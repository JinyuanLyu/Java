/*
抽象类的基本概念
（1）许多具有相同特征和行为的对象可以抽象为一个类：很多具有相同特征和行为的类可以抽象成一个抽象类。
（2）使用abstract关键字声明的类为抽象类。
（3）抽象类不可以被实例化。


抽象类：用abstract关键字声明的类成为抽象类，
很多具有相同特征和行为对象可以抽象为一个类，
很多具有相同特征和行为的类可以抽象为抽象类。

七项规则：
1。抽象类可以没有抽象方法，有抽象方法的类必须是抽象类。
2。非抽象类继承抽象类必须实现所有抽象方法。
3。抽象类可以继承抽象类，可以不实现父类抽象方法/
4。抽象类可以有方法实现和属性。
5。抽象类不可以被实例化
6。抽象类不能被声明为final。
7。抽象类可以有构造方法。

* */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Man man=new Man();
        man.eat();
        man.move();
        Woman woman=new Woman();
        woman.eat();
       // Animal a=new Animal;    抽象类不可以被实例化
    }
}

abstract class Animal{
    public abstract void move();     //抽象方法 只能声明 没有实现
}
abstract class Person extends Animal{
    private String name;
    public abstract void eat();     //抽象方法 只能声明 没有实现
 public void sleep(){               //抽象类可以有非抽象方法
     System.out.println("睡觉");
 }
}

//继承抽象类的具体类      具体类必须实现抽象类所包含的所有方法
class Man extends Person{
    public void eat(){
        System.out.println("我是男人。我爱吃肉");
    }
    public void move(){
        System.out.println("我爱跑步");
    }
}

class Woman extends Person{

    public void eat() {
        System.out.println("我是女人。我爱吃肉");
    }
    public void move() {
        System.out.println("我爱跑步");
    }
}
