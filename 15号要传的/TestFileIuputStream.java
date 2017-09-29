package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

	static void testReader(){
		File f = new File("g:/a.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
            int m = 0 ;
			while((m=fis.read())!=-1){
			char c =(char) m;
			System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis !=null);{
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	static void testWriter(){
		FileOutputStream fos = null;
		String str = "sffsdadkfjaslkfjslkfj";
		try {
			fos = new FileOutputStream("g:/b.txt");
			fos.write('a');
			fos.write('b');
			fos.write(str.getBytes());
			System.out.println();
			System.out.print(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		  }
		}
	}
 public static void main(String[] args){
	 testReader();
     testWriter();
 }
}
