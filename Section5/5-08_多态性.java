/*
多态是面向对象的三大特性之一
什么是多态？
对象在运行过程中的多种形态。

多态性我们大概可以分为两类：
（1）方法的重载和重写
（2）对象的多态性

例如：
//用父类的引用指向子类对象（用大的类型去接受小的类型，向上转型，自动转换）
Chicken home = new HomeChicken()；

结论：
在编程时针对抽象类型的编写代码，成为面向抽象编程（或者说是面向接口编程）
父类通常都定义为抽象类，接口

对象的多态性：
对象多态性是从继承关系中的多个类而来/

 向上转型：将子类实例转为父类引用
 格式：父类 父类对象=子类实例；➡自动转换
 以基本数据类型操作为例：int i='a';
 因为char的容量比int小，所以可以自动完成

 向下转型：将父类实例转为子类实例
 格式：子类 子类对象=（子类） 父类实例；强制转换
 以基本数据类型操作为例：char c=（char）97；
 因为整型是4个字节比char2个字节要大，所以需要强制完成


多态性小结：
1。方法的重载与重写就是方法的多态性表现
2。多个子类就是父类中的多种形式
3。父类引用可以指向子类对象，自动转换
4。子类对象指向父类引用需要强制转换（注意：类型不对会报异常）
5。在实际开发中尽量使用父类引用（更利于扩展）


* */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //用父类的引用指向子类对象（用大的类型还表示小的类型），自动转换，向上转型
        Chicken hc=new HomeChicken("小鸡");
        //hc.eat();

        Chicken yc=new YeChicken("野鸡");
        //yc.eat();

        //hc=yc;
        //hc.eat();

    //eat(hc);
    //eat(yc);

    Chicken jjc=new JianJiaoChicken("尖叫鸡");
    eat(jjc);


    }
    //抽象（粒度）    面向抽象编程（面向接口编程）
    public static void eat(Chicken c){
        System.out.println("鸡吃饭");
        c.eat();
        JianJiaoChicken jjc=(JianJiaoChicken)c;//大的类型转换为小的类型。强制转换（向下转型）
        jjc.song();
    }

}

//鸡
abstract class Chicken{
    private String name;
    public Chicken(){}
    public Chicken(String name){this.name=name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void eat();

}

//家鸡
class HomeChicken extends Chicken{
    public HomeChicken(String name){
        super(name);
    }

    public void eat(){
        System.out.println("我是"+this.getName()+"，我爱吃米");
    }
}

//野鸡
class YeChicken extends Chicken{
    public YeChicken(String name){super(name);}

    public void eat() {
        System.out.println("我是"+this.getName()+"，我爱吃虫子");
    }
}

class JianJiaoChicken extends Chicken{
    public JianJiaoChicken(String name){super(name);}

    public void eat() {
        System.out.println("我是"+this.getName()+"，我不吃虫子");
    }
    public void song(){System.out.println("jijijijijijijijijiji");}

}
