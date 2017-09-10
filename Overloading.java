package test;

public class Overloading {
	public int add(int a,int b){
		System.out.println("调用我了");
		return a+b;
		
	}
	public double  add(double a ,double b){
		System.out.println("哈哈有小数点是调用我");
		return a+b;
	}
	
public static void main(String[] args){
       Overloading t=new Overloading();
       t.add(3.0, 4.0);
       
	
}
}
