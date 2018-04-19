/*
final关键字
1。使用final关键字声明一个常量
  修饰属性或者修饰局部变量（最终变量），也成为常量。
2。使用final关键字修饰一个方法
  该方法为最终方法，且只能被子类继承，也不能被子类重写。
3。使用fianl声明一个类
  该类就转变为最终类，没有子类的类。fianl修饰的类无法被继承。
4。在方法中参数使用final，在该方法内部不能修改参数的值（在内部类中详解）

注意：
1。使用final声明一个属性，就是常量，常量的命名规则建议使用全大写，常量必须在定义时或者在构造函数中进行初始化
2。使用fianl声明的方法，不能被子类重写，只能被继承。
3。使用fianl声明一个类。该类就转变为最终类，没有子类的类。fianl修饰的类无法被继承。
*/

public class Main {
    public static final int PERSON_NUM=10;          //java对修饰符的位置没有严格要求
    public static void main(String[] args) {
        System.out.println(Main .PERSON_NUM);

    FinalClass fc=new FinalClass();
    fc.setLengrh(10);


    }
}



//常量类（工具类的一种）：在实际项目开发中，常量类通常用于定义项目中一些公共的，不变的，数据
class Constant{
    public static final int PERSON_NUM=10;//人数
}

class FinalClass {
    public final int DAY_NUMBER;  //工作天数
    //构造起中的初始化
    public FinalClass(){
        DAY_NUMBER=22;
    }
    public  final void print(){
        System.out.println("我是final方法");
        }
    public void setLengrh(final int size){
        final int x=20;
        //size++;                       内部类里final修饰的参数 不能被改变
        System.out.println(size);
    }
}

class  SubClass extends FinalClass{
    /*public final void print(){
        System.out.println("我是final方法");            不能被重写 可以被继承

    }*/
}
