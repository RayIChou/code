package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testCopyFile {
public static void main(String[] args){
	copyFile("g:/a.txt","g:/b.txt");
}


static void copyFile(String src,String dec){
	FileInputStream fis =null ;
	FileOutputStream fos = null;
	byte[] buffer = new byte [1024];//为了提高效率，设置缓存数组
	int temp = 0;
	
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			while((temp=fis.read(buffer))!=-1){
				fos.write(buffer,0,temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	

}
}
