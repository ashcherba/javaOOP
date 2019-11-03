package Homework5;

import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter{

	private String doc = "doc";
	@Override
	public boolean accept(File pathname) {
		
		int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        else {
            String text = pathname.getName().substring(pointerIndex + 1).toLowerCase();
            return doc.equals(text);
        }
	}

}
