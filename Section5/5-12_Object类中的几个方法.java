/*
Object类 是类层次接口的根类
每个类都使用Object作为超类。所有对象（包括数组）都实现这个类都方法

所有类都是Object的子类

public String toString()方法
返回该对象的字符串显示。
通常，toString方法会返回一个"以文本方式显示"此对象的字符串。结果应是一个简明且容易读懂的信息表达式。
建议所有子类都重写此方法。

public bollean equals(Object obj)
指示其他某对象是否与此对象"相等"。equals方法在非空对象引用上实现相等关系：
自反性:对于任何非空引用值 x， x.equals(x)  都返回 true
对称性:对于任何非空引用值x和y 当且仅当y.equals(x)返回true时， x.equals(y)才返回true
传递性:对于任何非空引用值x，y和z 如果x.equals(y)返回true y.equals(z)返回turs x.equals(z)才返回true
一致性:对于任何非空引用值x和y 多次调用x.equals(y)始终返回ture 或始终返回 false，前提是对象上equals比较中所用的信息没有被修改
对于任何非空引用值x x.equals(null) 都应该返回false

protected void finalize()throws Throwable
当垃圾回收器确定不存在对该对象对更多引用时候,由对象对垃圾回收器调用此方法。
子类重写finalize方法，以配置系统资源或执行其他清除。

public final Class<?> getClass()
返回此Object的运行时类



*/


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student s=new Student("feifei",1,18);
        System.out.println(s.toString());
        System.out.println(s);                                //toString可以省略，可以自动调用

        Student student2=new Student("beibei",2,20);
        boolean b=s.equals(student2);
        System.out.println(b);

        Student student3=new Student("beibei",2,20);
        boolean c=student2.equals(student3);
        System.out.println("------------");
        System.out.println(c);                  //依旧为false 因为比较两个对象 比较的是地址(不重写的情况下)
        System.out.println("------------");
        String a1=new String("beibei");
        String a2=new String("beibei");
        System.out.println(a1==a2);         //结果为 false
        System.out.println(a1.equals(a2));  //结果为 true 说明String类里重写了equals方法

        System.out.println(s.getClass()==student2.getClass());   //getClass返回运行时类


    }
}

class Student{
    private String name;
    private int sid;
    private int age;
    public Student(){};
    public Student(String name,int sid,int age){
        this.name=name;
        this.sid=sid;
        this.age=age;
    }

    //重写Object中的toString方法
    public String toString(){
        return "sid="+sid+",name="+name+",age="+age;
    }

    //重写equals方法 使得当两个对象的属性相等时候 返回true
    public boolean equals(Object obj){
        if (this==obj){return true;
    }
    if(obj instanceof Student){
        Student s=(Student)obj;
        if(!this.name.equals(s.name)){
            return false;
        }
        if(this.age!=s.age){
            return false;
        }
        if (this.sid!=s.sid){
            return false;
        }
       return true;

        }
       return false;
    }

}
