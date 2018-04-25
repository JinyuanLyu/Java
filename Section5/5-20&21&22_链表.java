/*
链表(Linked list) 一种常见的基础数据结构,是一种线性表,但是并不会按线性的顺序存储数据,
而是在每一个节点里存到是下一个节点的指针(Pointer)


 链表与数组:都是线性数据结构
 数组:不适合插入删除,适合查找,遍历.固定长度.
 链表:不适合查找,适合插入,删除.不宜过长,否则会导致遍历性能下降.

*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NodeManager nm=new NodeManager();
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.add(2);
        nm.add(1);
        nm.print();
        System.out.println(nm.find(8));
        nm.update(2,8);
        nm.print();
        nm.insert(0,9);
        nm.print();
    }
}

class NodeManager{
    private  Node root;//根节点
    private int currentIndex=0;//节点的序号,每次操作从0开始.
    //Node node=new Node();
    //外部访问内部方法的接口

    //添加
    public void add(int data){
        if(root==null){
            root =new Node(data,null);
        }else
            root.addNode(data);}

    //删除
    public void del(int data) {
        if(root==null)return;
        if (root.getData() == data) {
            root = root.next;
        } else {
            root.delNode(data);
        }
    }

    //打印所有
    public void print(){
        if(root!=null){
            System.out.print(root.getData()+"→");
            root.printNode();
            System.out.println();}
        else System.out.println("null");}

    //查询是否存在节点
    public boolean find(int data){
        if(root==null){return false;}
        else if(root.getData()==data)return true;
        else return root.findNode(data);
    }

    //修改节点
    public void update(int oldData,int newData){
        if(root==null){System.out.println("Error");}
        else if(root.getData()==oldData){
            root.setData(newData);
        }else root.updateNode(oldData,newData);
    }


    /*插入节点(index理解为要插入到多少数值的后面)
    public void insert(int index, int data){
        if(root.getData()==index){
            Node temp=new Node(data,root.next.next);
            //Node temp=new Node(root.next.getData(),root.next.next);
            root.next.next=temp;
        }else root.insertNode(index,data);
    }*/
    //插入字节 (index为索引值,向之前插入)
    public void insert(int index, int data) {
        if(index<0)return;
        currentIndex =0;
        if (index==currentIndex){
            Node newNode=new Node(data,root.next.next);
            root.next=newNode;
        }else root.insertNode(index,data);

    }

    private class Node{
        private int data;
        private Node next;//把当前类型作为属性

        public  Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
        //添加节点
        public void addNode(int data){
            if(this.next==null){
                this.next=new Node(data,null);
            }else{this.next.addNode(data);}

        }

        //删除节点
        public void delNode(int data){
            if(this.next!=null) {
                if (this.next.data == data) {
                    this.next = this.next.next;
                } else this.next.delNode(data);
            }
        }

        //输出节点所有节点
        public void printNode(){
            if(this.next!=null){
                System.out.print(this.next.getData()+"→");
                this.next.printNode();
                System.out.println();
            }else System.out.println("null");
        }

        //查找节点是否存在
        public boolean findNode(int data){
            if(this.next!=null){
                if(this.next.getData()==data)return true;
                else return this.next.findNode(data);
            }else return false;
        }
        //修改节点
        public void updateNode(int oldData,int newData){
            if(this.next!=null){
                if(this.next.data==oldData){
                    this.next.setData(newData);
                }else this.next.updateNode(oldData,newData);
            }
        }
        //插入节点
        /*
        public void insertNode(int index, int data){
            if(this.next!=null){
                if(this.next.data==index){
                    Node temp=new Node(data,this.next.next);
                    //Node temp=new Node(this.next.getData(),this.next.next);
                    this.next.next=temp;
                }else this.next.insert(index,data);
            }
        }*/

        public void insertNode(int index, int data){
            currentIndex++;
            if(this.next!=null){
                if(currentIndex==index){
                    Node temp=new Node(data,this.next.next);
                    this.next.next=temp;
                }else this.next.insertNode(index,data);
            }
        }

    }
}
