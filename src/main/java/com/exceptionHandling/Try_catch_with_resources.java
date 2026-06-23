package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Try_catch_with_resources {

	public static void main(String[] args) {

		File file = new File("demo.txt");
		// checked Exception FileNotFoundException
		// initialization/ declared variable.

		FileReader fileReader;
		String data = null;

		try (BufferedReader bufferReader = new BufferedReader(new FileReader(file))) {

			data = bufferReader.readLine();

		} catch (IOException e) {

			// parent class of FileNotFoundException is IOException so, it get replaced by
			// that.
			e.printStackTrace();
		}

		System.out.println(data);

	}

}
