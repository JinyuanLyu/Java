/*
静态代理模式

代理模式Proxy：为其他对象提供一种代理以控制对这个对象的访问。
代理模式说白了就是"真实对象"的代表，在访问对象时引入一定程度的间接性，因为这种间接性可以附加多种用途。

实现类和代理对象 同时拥有同一个接口
代理对象里传入实现类 实现和控制代理功能

 */



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Action userActione=new UserAction();
        ActionProxy proxy=new ActionProxy(userActione);
        proxy.doAction();
    }
}

//3代理对象
class ActionProxy implements Action{
    private Action target; //被代理的对象
    public ActionProxy(Action target){this.target=target;}

    //执行操作
    public void doAction() {
        long startTime=System.currentTimeMillis();
        target.doAction();//执行真正的业务
        long endTime=System.currentTimeMillis();
        System.out.println("共耗时："+(endTime-startTime));
    }
}

//1业务接口
interface Action{
    public void doAction();
}

//2实现类
class UserAction implements Action{
    public void doAction() {
        for(int i=0;i<100;i++)
        System.out.println("用户开始工作。。。");
    }

}

