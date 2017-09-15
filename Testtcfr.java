//测试try catch finall return 执行顺序
package test;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testtcfr {
	public static void main (String[] args){
		String str = new Testtcfr().openFile();
		System.out.println(str);
	}


String openFile(){
	try{
	System.out.println("aaa");
	FileInputStream fis = new FileInputStream("d:/a.txt");
	int a = fis.read();
	System.out.println("bbb");
	return "step1";
} catch (FileNotFoundException e){
	System.out.println("catching!!!");
	e.printStackTrace();
	return "step2";//先确定返回的值，并不会直接结束运行！
}	catch(IOException e){
	e.printStackTrace();
	return "step3";
}finally{
	System.out.println("finally!!!");
	//return "ffff";//不要在finally种使用return!
	//因为return有两个作用 return一个值 结束程序
}
}
//执行顺序：
//执行try catch 给返回值赋值
//执行 finally
//return 
	
	
	
}
