package test;

public class Overloading {
	public int add(int a,int b){
		System.out.println("��������");
		return a+b;
		
	}
	public double  add(double a ,double b){
		System.out.println("������С�����ǵ�����");
		return a+b;
	}
	
public static void main(String[] args){
       Overloading t=new Overloading();
       t.add(3.0, 4.0);
       
	
}
}
