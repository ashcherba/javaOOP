package Homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) {
		
		File file1 = new File("test1.txt");
		File file2 = new File("test2.txt");
		
		writeToFile(file1, "Mother. Brother. Father.");
		writeToFile(file2, "Mother. Brother. Sister.");
		File fileBoth = mergeFiles(file1, file2);
		System.out.println(readFromFile(fileBoth));
	}
	
	public static void writeToFile(File file, String text){
		try(PrintWriter pw=new PrintWriter(file)){ 
			pw.println(text); 
			} 
		catch(FileNotFoundException e){
			System.out.println("ERROR FILE WRITE"); 
		}
	}
	
	public static String readFromFile(File file){
		StringBuffer sb = new StringBuffer();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String str=""; 
			for(;(str=br.readLine())!=null;) {
				sb.append(str);
			}
		} catch (FileNotFoundException e) {	
			System.out.println("ERROR");
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		return sb.toString();
	}
	
	public static File mergeFiles(File file1, File file2) {
		String textOne = readFromFile(file1);
		textOne = textOne.toLowerCase();
		textOne = textOne.replaceAll("[.,]", "");
		String[] tOne = textOne.split("[ ]");
		
		String textTwo = readFromFile(file2);
		textTwo = textTwo.toLowerCase();
		textTwo = textTwo.replaceAll("[.,]", "");
		String[] tTwo = textTwo.split("[ ]");
	
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tOne.length; i++) {
			for (int j = 0; j < tTwo.length; j++) {
				if(tOne[i].equals(tTwo[j]) && !sb.toString().contains(tOne[i])){
					sb.append(tOne[i]);
					sb.append(' ');
				}
			}
		}	
		File fileBoth = new File("fileBoth.txt");
		writeToFile(fileBoth, sb.toString());
		return fileBoth;
	}

}
