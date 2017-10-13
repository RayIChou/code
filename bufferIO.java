package test;
//使用BufferedInputStream 和BufferedOutStream实现文件的复制：

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferIO {
	public static void main(String[] args){
	}
	void copyFile(String src,String dec){
		FileInputStream fis = null;
		BufferedInputStream bis= null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		int temp = 0;
		try {
			fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			while((temp=bis.read())!=-1){
				bos.write(temp);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			//增加处理流后，注意流的关闭顺序！“后开的先关“。
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
