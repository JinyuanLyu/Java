/*
实现一个化妆品商城中的化妆品管理
1.定义一个化妆品类（Cosmetic）name type price
2.定义一个化妆品管理类（CosmeticManager）
（1）实现进货功能
（2）可以输出所有化妆品信息功能
3.使用继承实现一个可按照单价降序输出所有化妆品的功能
4.使用继承实现一个只输出进口化妆品的功能
*/

public class Test5{
public static void main(String[] args){
	
ImportCosmeticManager cm=new ImportCosmeticManager();
cm.add(new Cosmetic("香奈儿","进口",1000));
cm.add(new Cosmetic("圣罗兰","进口",2000));
cm.add(new Cosmetic("大宝","国产",20));
cm.add(new Cosmetic("资生堂","进口",150));
cm.printInfo();
}

}

//可以按照单价排序的输出
class SortCosmeticManager extends CosmeticManager{
	public void printInfo(){
		Cosmetic[] temp=java.util.Arrays.copyOf(cs,count);
		System.out.println("总数量为："+temp.length);
		
		Cosmetic c=null;
		for(int i=0;i<temp.length-1;i++){
			for(int j=0;j<temp.length-1-i;j++){
				if(temp[j].getPrice()>temp[j+1].getPrice()){
					c=temp[j];
					temp[j]=temp[j+1];
				temp[j+1]=c;}
			}
		}
		
	    for(Cosmetic cosmetic:temp){
		 System.out.println(cosmetic.getInfo());
	     }
	}
}

//可实现输出进口化妆品的管理类
class ImportCosmeticManager extends CosmeticManager{
	public void printInfo(){
		for(int i=0;i<cs.length;i++){						//比较两个字符串的值是否相等 不用使用等于==
			if("进口".equals(cs[i].getType())){                              //使用equals()
				System.out.println(cs[i].getInfo());
			}
		}
	}
}

//化妆品管理类
class CosmeticManager{
	protected Cosmetic[] cs=new Cosmetic[4];
	protected int count = 0;
	public void add(Cosmetic c){
		int size=cs.length;
		
		if(count>=size){
			int newLen=size*2;
			cs=java.util.Arrays.copyOf(cs,newLen);
		}
		cs[count]=c;
		count++;
	};

	public void printInfo(){
		for(int i=0;i<count;i++){
			System.out.println(cs[i].getInfo());
		}
	}
	
	
}


class Cosmetic{
	private String name;
	private String type;
	private int price;
	public Cosmetic(){};
	public Cosmetic(String name,String type,int price){
		this.name=name;
		this.type=type;
		this.price=price;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setType(String type){
		this.type=type;
	}
		public String getType(){
		return type;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public String getInfo(){
		return "name:"+name+",type:"+type+",price:"+price;
	}
}

