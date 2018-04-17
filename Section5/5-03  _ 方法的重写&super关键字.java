

/**
 * 方法的重写：
 * 在Java中，子类可以继承父类中的方法，而不需要重新编写相同的方法。但有时子类并不想原封不动的继承父类的方法，而是
 * 想做一定的修改，这就需要采取方法的重写。方法的重写又称方法的覆盖。
 * 在子类和父类中，方法重写后，在调用时，以创建对象类型为准，会调用谁的方法。
 *
 * 关于方法的重写的一些特性：
 * 1。发生在子父类中，方法重写的两个方法的返回值，方法名，参数列表必须完全一致（子类重写父类的方法）
 * 2。子类抛出的异常不能超过父类相应方法抛出的异常（子类异常不能大于父类异常）
 * 3。子类方法的访问级别不能低于父类相应方法的访问级别（子类访问级别不能低于父类访问级别）
 * 4。父类中的方法若使用private，static，final任意修饰符修饰，那么不能被子类重写。
 *
 * 若子类从父类中继承过来的方法，不能满足子类特有的需求时，子类就需要重写父类中相应的方法，方法的重写也是程序扩展的体现。

 面试题：overloading与overriding的区别？
 overloading：方法的重载，发生在同一个类中，方法名相同，参数列表不同，返回值无关。
 overriding：方法的重写，发生在子父类中，方法名相同，参数列表相同，返回值相同，子类的访问修饰符要大于或者等于父类的访问修饰符，
            子类的异常声明必须小于或者等于父类的异常声明。如果方法被rivate，static，final任意修饰符修饰，那么不能被重写。


super关键字：
 1。使用super调用父类中的属性，可以从父类实例处获取信息。
 2。使用super调用父类中的方法，可以委托父类对象帮助完成某件事情。
 3。使用super调用父类中的构造方法（super(实参)形式），必须在子类构造方法的第一条语句，调用父类中相应的构造方法，
 若不显示的写出来，默认调用父类的无参构造方法，比如 super();

    super.属性 表示调用父类的属性，如果是继承过来的属性，那么super可以省略

this表示当前对象
 使用super来调用父类的属性，方法，构造方法
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
    public void eat() throws Exception{   //异常的声明
        System.out.println("吃饭");

    }
}
class HomeDog extends Dog{
    public HomeDog(String name){
        super(name,"公");//必须在第一句，且只能一次
        this.name=name;
        System.out.println(super.name+"我是homedog的构造");    //这里表示调用父类的name。
    }

    public void print(){
        System.out.println("我是一只家狗。");
    }
    //重写父类的方法
    public void eat() throws Exception{    //异常的声明
        super.eat();                                         //这里表示调用父类的eat

        System.out.println("我是家狗，我喜欢吃骨头");
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
    public void eat() throws Exception{
        System.out.println("我是哈士奇，我喜欢吃鸡肝");
    }
}
