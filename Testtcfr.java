//����try catch finall return ִ��˳��
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
	return "step2";//��ȷ�����ص�ֵ��������ֱ�ӽ������У�
}	catch(IOException e){
	e.printStackTrace();
	return "step3";
}finally{
	System.out.println("finally!!!");
	//return "ffff";//��Ҫ��finally��ʹ��return!
	//��Ϊreturn���������� returnһ��ֵ ��������
}
}
//ִ��˳��
//ִ��try catch ������ֵ��ֵ
//ִ�� finally
//return 
	
	
	
}
