/*
策略模式，定义了一系列的算法，将每一种算法封装起来并可以互相替换使用，
策略模式让算法独立于使用它的客户应用而独立变化。

把可变到行为抽象出来，这样的好处是这些行为可以在真正使用时相互替换。

OO设计原则：
1。面向接口编程（面向抽象编程）
2。封装变化
3。多用组合，少用继承

*/


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        BaseService user=new UserService();
        user.setISave(new FileSave());
        user.add("user");

        user.setISave(new NetSave());
        user.add("user");


    }
}

//把可变到行为抽象出来，定义一些列到算法
interface ISave{
    public void save(String data);
}

//封装变化
class FileSave implements ISave{
    public void save(String data){
        System.out.println("把数据保存到文件中..."+data);
    }
}

class NetSave implements ISave{
    public void save(String data){
        System.out.println("把数据保存到网络中..."+data);
    }
}




//面向接口编程，将接口组合绑定


abstract class BaseService{
    //abstract  public void save(String data);
    private ISave iSave;
    public void setISave(ISave iSave){
        this.iSave=iSave;
    }

    public void add(String data){
        System.out.println("检查数据合法性 。。。");
        iSave.save(data);
        System.out.println("数据保存完毕");
    }
}

class UserService extends BaseService{

}




/*
class UserService extends BaseService{
    public void save(String data){
        System.out.println("把数据保存到文件中..."+data);
    }
}*


