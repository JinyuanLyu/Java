/*
字符串操作--StringBuffer类
在实际开发当中,我们经常会使用到字符串连接的操作,如果用String来操作,则使用"+"号完成字符串的连接操作.
使用String连接字符串,代码性能会非常低,因为String的内容不可改变.解决这个温问题的方法是使用StringBuffer

StringBuffer的操作方法
public StringBuffer()                   构造一个空的StringBuffer对象
public StringBuffer(String)             将指定的String变为StringBuffer的内容
public StringBuffer(CharSequence seq)   接收CharSequence接口的实例
public StringBuffer append(数据类型 b)    提供了很多的append()方法,用于进行字符串连接
public StringBuffer delete(int start,int end)  删除指定位置的内容
public int indexOf(String str)          字符串的查询功能
public StringBuffer insert(int offset,数据类型 b) 在指定位置上增加一个内容
public StringBuffer replace(int start,int end.String str) 将指定范围的内容替换成其他内容
public String substring(int start,int end)  截取指定范围的字符串
public String substring(int start)          字符串截取
public StringBuffer reverse()               字符串反转


 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String a="a";//一个对象
        String b="b";//两个
        String c=a+b+1;//三个
        System.out.println(c);

        String d="a"+1+2+"b";//常量相加 只产生一个对象//没有性能问题(编译器进行优化)
        //StringBuffer目的是用来解决字符串相加时带来的性能问题
        //StringBuffer的内部实现采用字符数组,默认数组的长度为16,超过数组大小时,动态扩充的算法是原来长度*2+2
        //所以当我们已经预知要添加的数据的长度时,建议使用带初始化容量的构造方法,来避免动态扩充的次数,从而提高效率
        //线程安全的,会影响性能
        StringBuffer sb=new StringBuffer(21);//带容量的构造(建议)
        sb.append(a).append(b).append(1);
        System.out.println(sb.toString());
        StringBuffer sb2=new StringBuffer("abc");

    }
}
