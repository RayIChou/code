package testobject;

public class TestConstructor {
	public static void main(String[] args){
		iphone C = new iphone(5300,6,"white");//引用字符要双引号啊大哥！！
		C.start();
		System.out.println("color "+C.color);
		
		
	}

}

class iphone{
	int price;
	int verson;
	String color;
	
	public  void start(){
		System.out.println("the iphone is opening");
		}
	iphone(){}
    iphone(int price,int verson, String color){
		this.price=price;
		this.verson=verson;
		this.color=color;
	}
}
//<terminated>TestConstructor[Java Application]C:\Program Files\Java\jdk1.8.0_73\bin\javaw.exe