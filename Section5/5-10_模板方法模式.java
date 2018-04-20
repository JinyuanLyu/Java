/*
模板方法模式：定义一个操作中的算法的骨架，而将一些可变部分的实现延迟到子类当中。
模板方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。



*/



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    UserManager um=new UserManager();
    um.action("admin","add");

    }
}


abstract class BaseManager{
    public void action(String name,String method){
        if("admin".equals(name)){
            execute(method);
        }else{
            System.out.println("你不是管理员");
        }

    }
    public abstract void execute(String method);
}

class UserManager extends BaseManager{
    public void execute(String method){

        //用户是否登陆的验证
        //验证成功后才能执行以下操作

        if("add".equals(method)){
            System.out.println("执行添加操作");
        }else if("del".equals(method)){
            System.out.println("执行删除操作");
        }
    }
}

class ClassManager{

}
