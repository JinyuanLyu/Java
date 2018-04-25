/*
基本数据类型包装类:
在java中有一个设计的原则"一切皆对象",在java中的基本数据类型就完全不符合这种设计思想.因为八种
基本数据类型并不是引用数据类型,所以java中为了解决这样的问题,在JDK1.5以后引入了八种基本数据类
型的包装类.

八种包装类分为两大类型:
Number:Integer,Short,Long,Double,Float,Byte,都是Number的子类表示一二个号数字.
Object:Character,Boolean都是Object的直接子类
基本数据类型  包装类
    int     Integer
    chart   Character
    float   Float
    double  Double
    boolean Boolean
    byte    Byte
    short   Short
    long    Long

 装箱和拆箱操作:
 讲一个基本数据类型转换为包装类,那么这样的操作称为装箱操作.
 将一个包装类转换为一个基本数据类型,这样的操作称为拆箱操作.
 方法              描述
 byteValue()    Byte→byte
 doubleValue()  Double→double
 floatValue()   Float→float
 intValue()     Integer→int
 longValue()    Long→long
 shortValue()   Short→short

转型操作:
在包装类中,可以将一个字符串变为制定的基本数据类型,一般在输入数据时会比较多.
在Integer类中将String变为int型数据:public static int parseInt(String s);
在Float类中将String变为float型数据:public static int parseFloat(String s);
注意:转型操作时,字符串必须由数字组成,否则会出现错误

享元模式(Flyweight Pattern)
它使用共享对象,用来尽可能减少内存使用量以及分享资讯给尽可能多的相似对象;
它适用于大量对象只是重复因而导致无法令人接受的使用大量内存.通常对象中的部分状态是可以分享的.
常见的做法是把它们放在外部数据结构,当需要使用时再讲它们传递给享元.
运用共享技术有效的支持大量细粒度的对象.

 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //使用包装类
        Integer i1=new Integer(10);//把基本数据类型转为包装类,称为自动装箱
        int i2=i1.intValue();       //把包装类转换为基本数据类型,称为自动拆箱

        Integer i3=10;      //建议的方式

        Integer i4=new Integer("123");

        //把数值字符串转换为int类型
        String num1="123";
        int i5=Integer.parseInt(num1);

        Integer i6=Integer.valueOf(num1);
       // int i6=Integer.valueOf(num1);



        Integer x1=new Integer(10);
        Integer x2=new Integer(10);
        System.out.println(x1==x2);        //false 双等比较地址
        System.out.println(x1.equals(x2)); //true    equals重写了 比较数值

        System.out.println("-------------------");

        Integer x3=new Integer(128);
        Integer x4=new Integer(128);
        System.out.println(x3==x4);        //false 双等比较地址
        System.out.println(x3.equals(x4)); //true    equals重写了 比较数值

        System.out.println("-------------------");
        //享元模式的使用
        Integer x5=10;      //x5 x6共享一个对象
        Integer x6=10;
        System.out.println(x5==x6);         //true
        System.out.println(x5.equals(x6));  //true
        System.out.println("-------------------");

        Integer x7=128;
        Integer x8=128;
        System.out.println(x7==x8);        //false
        System.out.println(x7.equals(x8)); //true

        System.out.println("-------------------");
        //享元模式把一个字节(-128至127)以内的数缓存到了一个常量池,共享一个单位 超过128就不再适用
        Integer x9=127;
        Integer x10=127;
        System.out.println(x9==x10);        //true
        System.out.println(x9.equals(x10)); //true

    }
}
