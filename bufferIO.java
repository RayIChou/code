package test;
//ʹ��BufferedInputStream ��BufferedOutStreamʵ���ļ��ĸ��ƣ�

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
			//���Ӵ�������ע�����Ĺر�˳�򣡡��󿪵��ȹء���
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
