/**
 * 对象数组与管理
 * 使用对象数组实现多个小鸡的管理
 * 动态数组：
 * 1，数组是一种线性数据结构
 * 2，数组不适合作删除插入等操作，适合添加，查找，遍历。
 * 删除的效率较低，每次删除一个需要移动其他对象
**/

package main;
import java.util.Arrays;//数组的拷贝方法
public class main {
    public static void main(String[] args){
        ChickenManager cm=new ChickenManager(5);
        cm.add(new Chicken(1,"XiaoXiao",10));
        cm.add(new Chicken(2,"XiaoEr",3));
        cm.add(new Chicken(3,"XiaoSan",14));
        cm.add(new Chicken(4,"XiaoSI",5));
        cm.add(new Chicken(5,"XiaoWu",6));
        cm.add(new Chicken(5,"XiaoWu",6));
        System.out.println("数组的长度是"+cm.length());

        cm.printAll();

        Chicken c=cm.find(5);
        c.print();

        cm.updatae(new Chicken(1,"下蛋公鸡",20));
        cm.printAll();
    }


}//小鸡管理类
class ChickenManager{
    private Chicken cs[]=null;
    //记录当前数组的元素个数
    private int count=0;

    public ChickenManager(int size){
        if(size>0){
            cs=new Chicken[size];

        }else cs=new Chicken[5];
    }
    public int length(){
        return cs.length;
    }
    //添加 实现动态数组
    public void add(Chicken c){
        if(count>=cs.length){//数组已满，需要扩充
            //算法1；扩充原来数组的一半
            // cs.length*3/2+1
            int newLen=cs.length*2;
            cs=Arrays.copyOf(cs,newLen);

            //算法2：扩充原来数组的一倍
            // cs.length*2

        }
            cs[count]=c;
        count++;
    };
    //删除
    public void delete(int id){
        for(int i=0;i<count;i++){
            //找到删除对象，把该对象之后的对象向前移动一位
            if (cs[i].getId()==id){
                for(int j=i;j<(count-1);j++){
                    cs[j]=cs[j+1];
                }
                //最后一个对象赋值为空
                cs[count-1]=null;
                count--;//下标减一
                break;
            }

        }

    };
    //更新
    public void updatae(Chicken c){
        Chicken temp=find(c.getId());
        if(temp!=null){
            temp.setName(c.getName());
            temp.setAge(c.getAge());
        }

    };

    //查找
    public Chicken find(int id){
        for(int i=0;i<count;i++) {
            if (cs[i].getId() == id) {
                return cs[i];
            }
        }return null;
    };
    //输出所有
    public void printAll(){
        for(int i=0;i<count;i++){
           cs[i].print();
        }
    };

}

//小鸡类（数据对象）value object(vo)
class Chicken{
    private int id;
    private String name;
    private int age;
    public Chicken(){};
    public Chicken(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void print(){
        System.out.println("id"+id+",name="+name+",age="+age);
    }
}
