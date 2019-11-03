package Homework5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {

	public static void main(String[] args) {
		File fileSource = new File("test.doc");
		File fileTarget = new File("test2.doc");
		
		Filter filter = new Filter();
		File[] folder = fileSource.listFiles(filter);
		
		try
		(FileInputStream fis = new FileInputStream(fileSource);
		FileOutputStream fos = new FileOutputStream(fileTarget)) {
			byte[] buffer = new byte[1024]; int byteread = 0;
			for (; (byteread = fis.read(buffer)) > 0;) { 
				fos.write(buffer, 0, byteread); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
