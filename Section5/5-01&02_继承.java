

/**
 继承：继承是从已经有的类创建新类的过程
         继承一个父类，只能继承非私有的数据（属性和方法）
protected访问权限修饰符，在继承关系中使用，在父类中使用protected修饰的属性或者方法可以被子类继承
  创建子类对象时，父类的构造方法也会被调用，因为子类要使用到父类的数据，那么要通过子类的父类构造方法来初始化。
 如果创建子类对象时，使用默认的构造方法，那么父类默认构造方法也会被调用
 如果创建子类对象时，使用的是带参数带构造方法，那么父类带默认构造方法也会被调用

 当父类中没有无参构造方式时，子类必须显示的调用父类的带参构造方法，怎么调用？
 可以在子类中显示的使用super()调用父类的构造方法，只能出现在第一句

小结：
 1。继承发生在多个类之间
 2。继承使用关键字extends
 3。java只能单继承，允许多层继承
 4。被继承带类叫做父类（超类），继承父类带类叫做子类（派生类）
 5。在父类中非私有属性和方法可以被子类继承
 6。protected（受保护带访问权限修饰符），修饰带属性或方法可以被子类继承
 7。构造方法不能被继承
 8。创建对象会调用构造方法，调用构造方法不一定就是创建该类对象（创建子类时候会调用父类的构造方法，但是父类的对象并没有被创建）
 9。实例化子类对象，会先调用父类的构造方法，如果父类中没有默认的构造方法，
 那么子类必须显示的通过super（）来调用父类的带参构造方法，super也只能在子类构造方法中带第一句。

 继承的好处：
 1。提高代码的复用性
 2。提高代码的维护性
 3。让类与类之间产生关系，是多态的前提

 继承的缺点：
 增强了类与类之间的耦合性

 开放原则：高内聚，低耦合


 子类的实例化过程：
 子类实例化时会先调用父类的构造方法
 如果父类中没有默认的构造方法，在子类的构造方法中必须显示的调用父类的构造方法

 结论：
 构造方法只是用于初始化类中的字段以及执行一些初始化代码
 调用构造方法并不代表会生成对象
         */

public class Main {

    public static void main(String[] args) {
        HomeDog homeDog=new HomeDog("旺财 ");
        homeDog.eat();
        System.out.println("Hello World!");
    }
}

class Dog{
    public Dog(String name,String sex){
        this.name=name;
        this.sex=sex;

        System.out.println("我是Dog的构造");
    }
    protected String name;
    protected String sex;
    public void eat(){
    System.out.println("吃饭");

    }
}
class HomeDog extends Dog{
    public HomeDog(String name){
        super(name,"公");//必须在第一句，且只能一次
        this.name=name;
        System.out.println(name+"我是homedog的构造");
    }

    public void print(){
        System.out.println("我是一只家狗。");
    }
}

class HuskyDog extends Dog{
    public HuskyDog(){
        super("哈士奇","公");
        System.out.println("我是Husky的构造");
    }
    public void show(){
        System.out.println("我是Husky，我可以跳舞");
    }
}
