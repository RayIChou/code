package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyDir {
	public static void main(String[] args){
		//1、实现一个文件到另一个文件的copy
		//2、实现一个目录（目录下面只有文件）到另一个目录的copy
		//3、实现一个目录（目录下面包含文件和子目录）到另一个目录的copy
		//4、利用递归，实现将一个目录下面所有的内容copy到另一个目录
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
