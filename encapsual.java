/*隐藏/封装（encapsual）
 * 隐藏对象内部的复杂性，只针对外公开简单的接口，便于外界调用，从而提高系统的可扩展性，可维护性
 */

package test;

public class Monitor {
	public static final String NAME = "显示器";
	private String screen;
	private int size;
	private String color;
	private boolean good;


private void lightScreen(){
	System.out.println("屏幕亮了");
}
private void start(){
	lightScreen();
	System.out.println("显示器启动了！");
}
	//JAVABEAN（不包含逻辑的JAVA类）规范
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
		System.out.println("尺寸错误");
	
	}
}

}
// 虽然麻烦但是封装起来后安全