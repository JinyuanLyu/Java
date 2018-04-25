/*
包与访问修饰符
包用于对多个java源文件的管理,就像我们的文件目录一样.
定义一个包:
package com.vince;
该语句只能出现在代码中的第一句.

访问修饰符:
访问修饰符   同一个类    同包  不同包子类   不同包非子类
public      yes       yes     yes         yes
protected   yes       yes     yes
默认         yes       yes
private     yes

OO原则总结:
(1)开闭原则
   一个软件实体如类,模块和函数应该对扩展开放面对修改关闭.

(2)合成/聚合复用原则
   新对象的某些功能在已创建好的对象里已实现,那么尽量用已有对象提供的功能,使之成为新对象的一部分,
   而不要再重新创建

(3)依赖倒置原则(面向接口编程,策略模式,用父类接收子类 //父类 对象名字=new 子类)
   高层模块不应该依赖底层模块,二者都应该依赖其抽象;抽象不应该依赖细节;细节应该依赖抽象

(4)接口隔离原则(接口不要写太全,分开.)
   客户端不应该依赖它不需要的接口å:一个类对另一个类的依赖应该建立在最小的接口上

(5)迪米特法则
   一个对象应该对其他对象保持最少的了解

(6)里氏替换原则(多态)
   所有引用基类的地方必须能透明地使用其子类的对象

(7)单一职责原则
   不要存在于一个导致类变更的原因,即一个了类只负责一项职责



 */
/*
package com.qfedu.sms.vo;
public class Student{

}
*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
