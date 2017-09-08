package testobject;
public class TestObject {
	public static void main (String[] args)
	{
		Car c1 = new Car();
		c1.changeColor("green");
		c1.showColor();
	}
	 static class Car{     //这里不加static会出现的问题 写一篇博客
		
			Engine engine ;
			String color;
			
			public void changeColor(String c){
				color = c ;
			}
			public void showColor(){
				System.out.println("My color is "+color);
			}
			
		
	}
	class Engine{
		int speed;
		int weight;
	}

}