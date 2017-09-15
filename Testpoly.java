package test;

public class Testpoly {
	void test (Animal h){//此处用Animal父类 是多态
		h.move();
	}
	public static void main (String[] args){
	//new Testpoly().test(new Monkey());//这里new的对象是谁，上传给上面的父类Animal，然后即使谁，例如这里指猴子，猴子也是动物的一个分支，说他是动物也是正确的，但是反过来就不对了，动物不属于猴子！
	Animal a = new Monkey();
	new Testpoly().test(a);
	//动态绑定
	}

}
class Animal{
	void move(){
		System.out.println("move");
	}
}
class Human extends Animal{
	void move(){
		System.out.println("直立行走！");
	}
}
class Monkey extends Animal{
	void move(){
		System.out.println("爬行走！");
	}
}
class Donkey extends Animal{
	void move(){
		System.out.println("骑小毛驴！");
	}
}
//如果不掉用多态的话，以上没对一个子类就要多调用一个test，这就是高耦合
//多态三个必要条件 要有继承 要有方法重写（多种形态）父类引用指向子类对象