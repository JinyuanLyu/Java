/*
字符串操作--String类
    方法名称                                        类型          描述
字符串操作--String类
public char chaeAt(int index)                       普通        根据下标找到指定的字符
public char[] toCharArray                           普通        以字符组数组的形式返回全部的字符串内容
public String(char[] value)                         构造        讲全部的字符数组变为字符串
public String(char[] value,int offset,int count)    构造        讲指定范围的字符数组变为字符串
public byte[] get Bytes()                           普通        将字符串变为字节数组
public String(byte[] bytes)                         构造        将字节数组变为字符串
public String(byte[] bytes,int offset,int length)   构造        将指定范围的字节数组变为字符串
public String(byte[] bytes,String charsetName)      构造        通过使用指定的charset解码指定的byte数组,构造一个新的String

判断是否以指定内容开头或者结尾
public boolean startsWith(String prefix)            普通        从第一个位置开始判断是否以指定的内容开头
public boolean startsWith(String prefix,int toffset)普通        从指定的位置开始判断是否以指定的内容开头
public boolean endWith(String suffix)               普通        判断是否以指定的内容结尾
String类替换操作
public String replace(char oldChar,char newChar)    普通        替换指定字符
public String replace(CharSequence target,CharSequence replacement) 普通 替换指定字符串
public String replaceAll(String regex,String replacement)           普通 替换指定的字符串
public String replaceFirst(String regex,String replacement)         普通 替换第一个满足条件的字符串

字符串截取操作:
public String substring(int beginIndex)             普通        从指定位置开始一直截取到末尾
public String substring(int beginIndex,int endIndex)普通        截取指定范围的字符串
字符串拆分操作
public String[] split(String regex)                 普通        按照指定的字符串拆分
public String[] split(String regex,int limit)       普通        拆分字符串,并指定拆分个数
字符串查找操作
public boolran contains(String s)                   普通        返回一个字符串是否存在
public int indexOf(int ch)                          普通        从头查找指定的字符是否存在,char→int,如果存在则返回位置,如果不存在则返回"-1"
public int indexOf(int ch,int fromIndex)            普通        从指定位置查找指定字符是否存在,char→int,如果存在则返回位置,如果不存在则返回"-1"
public int indexOf(String str)                      普通        从头查找指定字符串是否存在,如果存在则返回位置,如果不存在则返回"-1"
public int indexOf(String str,int fromIndex)        普通        从指定位置查找字符串是否存在,如果存在则返回位置,如果不存在则返回"-1"
public int lastIndexOf(int ch)                      普通        从字符串的最后向前查找,指定的字符是否存在,如果存在则返回位置,如果不存在则返回"-1"
public int lastIndexOf(int ch,int fromIndex)        普通        从字符串的指定末尾向前查找,指定的字符是否存在,如果存在则返回位置,如果不存在则返回"-1"
public int lastIndexOf(String str)                  普通        从字符串的最后向前查找,指定的字符串是否存在,如果存在则返回位置,如果不存在则返回"-1"
public int lasIndexOf(String str,int fromIndex)     普通        从字符串的指定的末尾向前查找,指定的字符串是否存在,如果存在则返回位置,如果不存在则返回"-1"

其他方法
public boolean isEmpty              普通      判断是否为空,指的是内容为空"",不是none
public int length                   普通      返回字符串的长度
public String toLowerCase()         普通      转小写
public String toUpperCase()         普通      转大写
public String trim()                普通      去掉开头和结尾的空格,中间的空格不去
public String concat(String str)    普通      字符串连接操作
 */


import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String str = "HelloWorld12345";
        char c = str.charAt(1);
        System.out.println(c );
        System.out.println(str.toCharArray());
        char[] cs={'a','b','c'};
        String s1=new String(cs);

        String s2=new String(cs,0,1);
        System.out.println(s2);
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(str.replace('W','*'));
        System.out.println(str.replaceAll("[0-9]","*"));//也可以用str.replaceAll("\\d","*")
        System.out.println(str.replaceAll("\\d","*"));

        System.out.println(str.substring(0,4));

        System.out.println(Arrays.toString(str.split("d")));//d作为拆分的标记
        System.out.println(str.contains("o"));
        System.out.println(str.indexOf("f"));
        System.out.println(str.lastIndexOf("o"));
    }
}

