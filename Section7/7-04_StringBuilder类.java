/*
字符串操作--StringBuilder类
一个可变的字符序列,此类提供一个与StringBuffer兼容的API,但不保证同步.该类被设计用作
StringBuffer的一个简易替换,用在字符串缓冲区被单个线程使用的时候(这种情况很普遍).
如果可能,建议优先采用该类,因为在大多数实现中,它比StringBuffer要快.
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Stringbuffer和StringBuilder的区别?
        //StringBuffer是线程安全的,性能低,适合在多线程的使用
        //StringBuilder是线程不安全的,性能高,适合在单线程使用,占大多数情况,在jdk1.5后添加

        StringBuilder sb=new StringBuilder();


        //字符串相加操作
        //1.多个常量相加没有性能问题,在编译期优化
        //2.变量与常量相加,会产生多个垃圾对象

        String a="a"+1;
        String b="b"+a;
        String c=null;
        for(int i=0;i<5;i++){
            c+=i;//每次循环会产生一个StringBuilder对象,实现拼接,性能低,最好是手动创建StringBuilder来拼接
        }
        //1.字符串相加,在编译后,会使用StringBuilder来优化代码,实现拼接


    }


}
