/*
字符串操作-String类
1.String可以表示一个字符串
2.String类实际是使用字符数组存储的

String类的两种赋值方式:
1.一种称为直接赋值
String name="xiaobai"

2.通过关键字new调用String的构造方法赋值
String name=new String("xiaobai")


String 表示一个字符串,内部使用字符组实现,不能被继承(最终类),不可变

 */


public class Main {

    public static void main(String[] args){
        //String 的两种赋值方式    推荐使用第一种赋值方式
        //1.直接赋值 String赋值后 有一个字符串常量池 刚定义的s1 指向字符串常量池 常量池的作用是共享对象
        String s1="xiaobai";
        String s3="xiaobai";

        //2.new构造方法的方式
        // new 后 表示申请内存空间 生成的对象不在常量池当中
        //面试题:以下代码创建了几个对象?(不包括上面的代码) 答案:两个对象.一个对象(包括上面的代码)

        /*
        String str1 = “ABC”;可能创建一个或者不创建对象，如果”ABC”这个字符串在java String池里不存在，
        会在java String池里创建一个创建一个String对象(“ABC”)，然后str1指向这个内存地址，无论以后用这种方式创建
        多少个值为”ABC”的字符串对象，始终只有一个内存地址被分配，之后的都是String的拷贝，Java中称为“字符串驻留”，
        所有的字符串常量都会在编译之后自动地驻留。

        String str2 = new String(“ABC”);
        至少创建一个对象，也可能两个。因为用到new关键字，肯定会在heap中创建一个str2的String对象，它的value是“ABC”。
        同时如果这个字符串再java String池里不存在，会在java池里创建这个String对象“ABC”
         */
        String s2=new String("xiaobai");


        System.out.println(s1==s3);//true 共享对象
        System.out.println(s1==s2);//false 对象所指不同
        System.out.println(s1.equals(s2));//true
        System.out.println("----------四种情况分析---------");

        System.out.println("----------第一种:---------");
        //代码示例:四种情况分析
        //直接赋值字符串连接时,考虑编译期和运行期.如果在编译期 可以被确定,那么就使用已有的对象,
        String a="a";
        String a1=a+"1";//在编译这行代码时候 a是一个变量 编译的时候变量是不确定,只有在运行期变量才被确认 对象被创建在堆中
        String a2="a1";//a2可以被确认    且a2的对象被创建在常量池当中
        System.out.println("a1="+a1);
        System.out.println("a2="+a2);
        System.out.println(a1==a2);//因为对象不同 所以false
        System.out.println("----------第二种:---------");
        final String b="b";//b为常量
         String b1=b+"1";//此时b为"b" 因为是常量 所以b1被确认 此时b1在常量池中
         String b2="b1";//b2先在常量池中寻找是否有 在常量池中寻找到b1与之相等 所以共享对象
         System.out.println(b1==b2);//因为两个指向同一个对象 所以为true
        System.out.println("----------第三种:---------");
        String c=getString();//方法只有在运行期才能确定值
        String c1=c+1;
        String c2="c1";//c2确定
        System.out.println(c1==c2);//false 对象不同

        System.out.println("----------第四种:---------");
        final String d=getString2();//虽然是final 常量修饰 但是方法必须在运行期才能确定
        String d1=d+1;//编译期不确定
        String d2="d1";//编译器确定
        System.out.println(d1==d2);//false


    }


    private static String getString(){
    return "c";
    }
    private static String getString2(){
        return "d";
    }
}
