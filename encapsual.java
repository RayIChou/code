/*����/��װ��encapsual��
 * ���ض����ڲ��ĸ����ԣ�ֻ����⹫���򵥵Ľӿڣ����������ã��Ӷ����ϵͳ�Ŀ���չ�ԣ���ά����
 */

package test;

public class Monitor {
	public static final String NAME = "��ʾ��";
	private String screen;
	private int size;
	private String color;
	private boolean good;


private void lightScreen(){
	System.out.println("��Ļ����");
}
private void start(){
	lightScreen();
	System.out.println("��ʾ�������ˣ�");
}
	//JAVABEAN���������߼���JAVA�ࣩ�淶
public boolean isGood(){
	return good;
	}

public int getSize(){
	return size;
}
public void setSize(int size){
	switch (size){
	case: 14;
	case: 17;
	case: 19;
	this.size=size;
	break;
	default:
		System.out.println("�ߴ����");
	
	}
}

}
// ��Ȼ�鷳���Ƿ�װ������ȫ