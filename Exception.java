//�쳣����

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
		 System.out.println("���������ݣ�"+c1+c2+c3+c4);
	 }catch(FileNotFoundException e){
		 System.out.println("�ļ�û���ҵ�");
		 e.printStackTrace();
	 }catch(IOException e){
		 System.out.println("��ȡ�ļ�����");
	 }finally{
		 System.out.println("������û���쳣�Ҷ��ᱻִ��");
		 		try{
		 			if(reader!=null){
		 			reader.close();//��Դ���˱���������� 
		 			}
		 		}catch(IOException e){
		 			e.printStackTrace();
		 		}	 
		 		}
	 
	 
	 
 }
}
