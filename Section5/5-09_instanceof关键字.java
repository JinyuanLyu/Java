//当我们需要把父类当实例强制转换为子类当引用时，为了避免类型转换异常 java.lang.ClassCastException
//那么我们需要在转换之前做类型检查（判断）
//if(c instanceof JianJiaoChicken)   成立的条件是，对象本身及对象的父类型，都可以通过检查

/*
父类的设计法则：
通过instanceof关键字，我们可以很方便的检查对象的类型，但如果一个父类但子类过多，这样的判断还是显得很繁琐
怎么设计一个父类呢？
1。父类通常情况下都设计为抽象类或者接口，其中优先考虑接口，如接口不能满足才考虑抽象类。
2。一个具体的类尽可能不去继承另一个具体类，这样的好处是无需检查对象是否为父亲的对象。



*/





public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //用父类的引用指向子类对象（用大的类型还表示小的类型），自动转换，向上转型
        Chicken hc=new HomeChicken("小鸡");
        //hc.eat();

        Chicken yc=new YeChicken("野鸡");
        //yc.eat();

        //hc=yc;
        //hc.eat();

        //eat(hc);
        //eat(yc);

        Chicken jjc=new JianJiaoChicken("尖叫鸡");
        eat(jjc);
        eat(yc);

    }
    //抽象（粒度）    面向抽象编程（面向接口编程）
    public static void eat(Chicken c){
        System.out.println("鸡吃饭");
        c.eat();

        //当我们需要把父类当实例强制转换为子类当引用时，为了避免类型转换异常 java.lang.ClassCastException
        //那么我们需要在转换之前做类型检查（判断）

        if(c instanceof JianJiaoChicken)
        { JianJiaoChicken jjc=(JianJiaoChicken)c;   //大的类型转换为小的类型。强制转换（向下转型）
          jjc.song();}
    }

}

//鸡
abstract class Chicken{
    private String name;
    public Chicken(){}
    public Chicken(String name){this.name=name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void eat();

}

//家鸡
class HomeChicken extends Chicken{
    public HomeChicken(String name){
        super(name);
    }

    public void eat(){
        System.out.println("我是"+this.getName()+"，我爱吃米");
    }
}

//野鸡
class YeChicken extends Chicken{
    public YeChicken(String name){super(name);}

    public void eat() {
        System.out.println("我是"+this.getName()+"，我爱吃虫子");
    }
}

class JianJiaoChicken extends Chicken{
    public JianJiaoChicken(String name){super(name);}

    public void eat() {
        System.out.println("我是"+this.getName()+"，我不吃虫子");
    }
    public void song(){System.out.println("jijijijijijijijijiji");}

}
