package com.test.examples.FileInputAndOutputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutputStream {
	public static void main(String[] args) throws IOException {
		String file = "/Users/vinodkumar/Desktop/core_java_practice/java51.txt";

		File fileOne = new File(file);
		System.out.println("To check the file exist or not :: "+fileOne.exists());
		System.out.println("to check the file can read :: "+fileOne.canRead());
		System.out.println("To check the file can write :: "+fileOne.canWrite());
		System.out.println("file absolute path :: "+fileOne.getAbsolutePath());
		System.out.println("free space :: "+fileOne.getFreeSpace());
		System.out.println("file name :: "+ fileOne.getName());
		System.out.println("file can execute or not :: "+fileOne.canExecute());
		System.out.println("file canonicalpath :: "+fileOne.getCanonicalPath());
		System.out.println("file path :: "+fileOne.getPath());
		System.out.println("comparision :: "+fileOne.compareTo(fileOne));
		//System.out.println("To delete a file :: "+fileOne.delete());
		System.out.println("Length of the file :: "+fileOne.length());
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("i over ride the link");
		bw.flush();
	}
	
	
}
