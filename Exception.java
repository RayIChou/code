//异常处理

package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
 public static void main(String[] args){
	 FileReader reader = null ;
	 try{
		 reader = new FileReader("d://a.txt");
		 char c1 = (char)reader.read();
		 char c2 = (char)reader.read();
		 char c3 = (char)reader.read();
		 char c4 = (char)reader.read();
		 System.out.println("读出的内容："+c1+c2+c3+c4);
	 }catch(FileNotFoundException e){
		 System.out.println("文件没有找到");
		 e.printStackTrace();
	 }catch(IOException e){
		 System.out.println("读取文件错误");
	 }finally{
		 System.out.println("不管有没有异常我都会被执行");
		 		try{
		 			if(reader!=null){
		 			reader.close();//资源开了必须用这个关 
		 			}
		 		}catch(IOException e){
		 			e.printStackTrace();
		 		}	 
		 		}
	 
	 
	 
 }
}
