package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyDir {
	public static void main(String[] args){
		//1��ʵ��һ���ļ�����һ���ļ���copy
		//2��ʵ��һ��Ŀ¼��Ŀ¼����ֻ���ļ�������һ��Ŀ¼��copy
		//3��ʵ��һ��Ŀ¼��Ŀ¼��������ļ�����Ŀ¼������һ��Ŀ¼��copy
		//4�����õݹ飬ʵ�ֽ�һ��Ŀ¼�������е�����copy����һ��Ŀ¼
		File file = new File("G:\\Ray\\Github\\code");
		File file2 = new File("G:\\ppsfile");
		copyDir(file,file2);
	}
	static void copyDir(File file,File file2){
		new File(file2,file.getName()).mkdir();
		//copyFile(new File(file,"22.txt"),new File(file2,"22.txt"));
		File[] files =file.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				copyDir(f,new File(file2,file.getName()));
			}
			if(f.isFile()){
				copyFile(f,new File(new File(file2,file.getName()),f.getName()));
				
			}
		}
	}
	static void copyFile(File src, File dec) {
		FileInputStream fis = null;
		FileOutputStream fos =null;
		byte[] buffer =new byte[1024];
		int temp =0;
	    	try {
				fis =new FileInputStream(src);
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
					e.printStackTrace();
				}
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	    	
	    
	}
	
 
}
