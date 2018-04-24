/*
数据结构之链表
链表(Linked list) 一种常见的基础数据结构,是一种线性表,并不会按线性的顺序存储数据,
而是在每一个节点里存到是下一个节点的指针(Pointer).

在链表数据结构中,我们需要使用到递归算法.
递归算法是一种直接或者间接地调用自身算法的过程.在计算机编写程序中,递归算法对解决一大类
问题是十分有效的,它往往使算法的描述简洁且易于理解.

 */


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int result=jiecheng(10);
    }

    //递归算法:方法本身调用自己
    //1.递归必须要有出口(退出条件)
    //2.递归内存消耗大,容易发生内存溢出
    //3.层次调用越多,越危险
    public static int jiecheng(int num){
        if(num==1)return 1;
        return num*jiecheng(num-1);
    }

    //非递归方法
    public static int jiecheng2(int num){
        int result=num;
        int i=num-1;
        do{result=result*i;
        i--;}while (i>1);
        return result;
    }


}
