/*
内部类：就是在类的内部定义的类。

成员内部类格式：
class Outer{
    class Inner{}
}

编译上诉代码会产生两个文件：
Outer.class 和 Outer$Inner.class

在外部创建内部类的对象
内部类除了可以在外部类中产生实例化对象，也可以在外部类外面实例化。
那么，根据内部类生成的*.class文件：Outer$Inner.class
"$"符号在程序运行时将替换为"."
所以内部类的访问：通过"外部类.内部类"的形式表示。

Outer out=new Outer();//产生外部类实例
Outer.Inner in=null;//声明内部类对象
in=out.new Inner();//实例化内部类对象
Outer.Inner in=out.new Inner(); //简写
但是通常不会采用这种方法实现，而是通过在外部类中提供一个访问内部类方法的接口。

方法内部类
内部类可以作为一个类的成员外，还可以把类放在方法内定义。
注意：
1。方法内部类只能在定义该内部类的方法内实例化，不可以在此方法之外对其实例化。
2。方法内部类对象不能使用该内部类所在方法的非final局部变量。

格式如下：
class Outer{
    public void doSomething(){
        class Inner{
            public void seeOuter(){}
        }
    Inner inner=new Inner();
    inner.seeOuter();
    }
}


内部类：
1。成员内部类：直接在类中定义的类。
2。方法内部类：在一个类中的方法内定义的类。
    (1)方法内部类只能在定义该内部类的方法内实例化，不可以在此方法之外对其实例化。
    (2)方法内部类对象不能使用该内部类所在方法的非final局部变量。
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
    }
}


class Outer{
    private String name;

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
}
