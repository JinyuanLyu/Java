/*
静态内部类：
在一个类部定义一个静态修饰的内部类：
静态的含义是该内部类可以像其他静态成员一样，没有外部类对象时，也能够访问它。
静态嵌套类仅能访问外部类的静态成员和方法。

格式：
class Outer{
    static class Inner{}
}
class Test{
    public static void main(String[] args){
        Outer.Inner n=new Outer.Inner();
    }
}

----------------------------------------------------------------
匿名内部类就是没有名字的内部类。
匿名内部类有三种情况：
（1）继承试的匿名内部类。
（2）接口式的匿名内部类。
（3）参数式的匿名内部类。

在使用匿名内部类的时候，要记住几个原则：
（1）不能有构造方法（因为匿名，没有名字），只能有一个实例。
（2）不能定义任何静态成员，静态方法。
（3）不能是public protected private static
（4）一定是在new的后面，用其隐含实现一个接口或继承一个类。
（5）匿名内部类为局部的，所以局部内部类的所有限制都对其生效。
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Outer outer=new Outer();

    /*在外部创建成员内部类的实例，因为成员内部类需要依赖外部类的对象，
       通常情况下，不建议这样来实例化内部类的对象。
    Outer.Inner inner=outer.new Inner();
    inner.print();
    */
        //通常这样
        outer.innerPrint();
        outer.show();
  //----------静态内部类------------------------------
        Outer.Inner3 inner3=new Outer.Inner3();
        inner3.print();

  //----------继承式匿名内部类--------------------------
    outer.print1();
  //----------接口式匿名内部类--------------------------
    outer.print2();
  //----------接口式匿名内部类--------------------------
    outer.print3(new Eat(){
        public void eat(){System.out.println("eat:参数式匿名内部类");}
    });//！！！！！！！加分号


    }

}


class Outer{
    private String name;    //成员内部类和方法内部类可以使用外部的属性

    //-------------------成员内部类-------------------------
    //通常这样调用内部类的方法,建议在外部类中定义一个方法，对外提供访问内部类的方法
    public  void  innerPrint(){
        Inner inner=new Inner();
        inner.print();
    }
    //成员内部类
    private class Inner{
        public void print(){System.out.println("Inner成员内部类");}
    }


    //----------------------方法内部类-------------------------------
    //show方法的局部变量或方法的参数，必须是常量 final

    public void show(){
        int x=10;   //实际是 final int x=10 只能访问 不能修改
        class Inner2{
            //x++; x可以用但是不能修改。
            public void println(){System.out.println("方法内部类"+x);}
        }
        Inner2 inner2=new Inner2();
        inner2.println();
    }

    //---------------------静态内部类--------------------------------
    //无法从静态上下文中引用非静态变量 比如上面的name，可以访问静态的东西
    static class Inner3{
        public void print(){
            System.out.println("静态内部类");//
        }
    }

    //---------------------匿名内部类--------------------------------
     //继承试匿名内部类
     public void print1() {
        Cat cat = new Cat() {
            public void eat() {
                System.out.println("eat:继承试匿名内部类");
            }
        };                                       //!!!!!!!!必须有分号
        cat.eat();
     }
     //接口式匿名内部类
     public void print2() {
         Eat eat = new Eat() {
             public void eat() {
                 System.out.println("eat:接口式匿名内部类");
             }

         };
         eat.eat();
     }
     //参数式
     public void print3(Eat eat){
        eat.eat();
     }
}



abstract class Cat{
    public abstract void eat();
}

interface Eat{
    public void eat();
}
