package test;

public class Testpoly {
	void test (Animal h){//�˴���Animal���� �Ƕ�̬
		h.move();
	}
	public static void main (String[] args){
	//new Testpoly().test(new Monkey());//����new�Ķ�����˭���ϴ�������ĸ���Animal��Ȼ��ʹ˭����������ָ���ӣ�����Ҳ�Ƕ����һ����֧��˵���Ƕ���Ҳ����ȷ�ģ����Ƿ������Ͳ����ˣ����ﲻ���ں��ӣ�
	Animal a = new Monkey();
	new Testpoly().test(a);
	//��̬��
	}

}
class Animal{
	void move(){
		System.out.println("move");
	}
}
class Human extends Animal{
	void move(){
		System.out.println("ֱ�����ߣ�");
	}
}
class Monkey extends Animal{
	void move(){
		System.out.println("�����ߣ�");
	}
}
class Donkey extends Animal{
	void move(){
		System.out.println("��Сë¿��");
	}
}
//��������ö�̬�Ļ�������û��һ�������Ҫ�����һ��test������Ǹ����
//��̬������Ҫ���� Ҫ�м̳� Ҫ�з�����д��������̬����������ָ���������