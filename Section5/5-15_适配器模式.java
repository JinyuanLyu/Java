/*
适配器模式
适配器模式（Adapter）：将一个类的接口转换成客户希望的另一个接口。
适配器模式使得原本由接口不兼容而不能一起工作的那些类可以一起工作。

OO设计原则：
1。面向接口编程（面向抽象编程）
2。封装变化
3。多用组合，少用继承
4。对修改关闭。对扩展开放


 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        PowerA powerA=new PowerAImpl();
        work(powerA);


        PowerB powerB=new PowerBImpl();
         //work(powerB);
        Adapter adapter=new Adapter(powerB);
        work(adapter);



    }

    public static void work(PowerA a){
        System.out.println("正在链接");
        a.insert();
        System.out.println("工作结束");
    }
}



//适配器
class Adapter implements PowerA{
    private  PowerB powerB;
    public Adapter(PowerB powerB){
        this.powerB=powerB;
    }

    public void insert(){powerB.connet();}
}

interface PowerB{
    public void connet();
}
class PowerBImpl implements PowerB{
    @Override
    public void connet() {
        System.out.println("电源B开始工作");
    }
}


interface PowerA{
    public void insert();
}

class PowerAImpl implements PowerA{

    public void insert() {
      System.out.println("电源A开始工作");
    }
}


//-----------------------适配器方法2----------------------------
interface Animal{
    public void sing();
    public void cry();
    public void run();
    public void swim();
}

//适配器类
abstract class AnimalFunction{
    public void sing(){}
    public void cry(){}
    public void run(){}
    public void swim(){}

}
/*
class Dog implements Animal {                       使用适配器 可以简化具体类
    public void sing(){}
    public void cry(){}
    public void run(){System.out.println("我疯狂跑");}
    public void swim(){}

}*/

class Dog extends AnimalFunction{

    public void run(){System.out.println("我疯狂跑");};

}

//-----------------------适配器方法2----------------------------
