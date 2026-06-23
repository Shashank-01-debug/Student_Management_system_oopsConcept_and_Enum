package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExceptionDemo {

	public static void main(String[] args) {
		

		File file = new File("demo.txt");
		// checked Exception FileNotFoundException
		//initialization/ declared variable.
		
		FileReader fileReader;
		BufferedReader bufferReader = null;
		String data = null;
		
		try {
			 fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			 data = bufferReader.readLine();
			

		} catch (IOException e) {
			
			//parent class of FileNotFoundException is IOException so, it get replaced by that.
			e.printStackTrace();
		}
		
		
		finally {
			//closing the resource inside finally block.
			try {
				bufferReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(data);

	}

}
