/**
 * 
 */
package com.practice.interview.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author arpit
 *
 */
public class FileReadingWriting {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// File directory = new File("./");
		// System.out.println(directory.getAbsolutePath());

		FileReader fr = new FileReader("src/main/java/com/practice/interview/files/file.txt");
		BufferedReader br = new BufferedReader(fr);
		char c[] = new char[20];

		// illustrating markSupported() method
		if (br.markSupported()) {
			System.out.println("mark() method is supported");

			// illustrating mark method
			br.mark(100);
		}

		/*
		 * File Contents This is first line this is second line
		 */

		// skipping 8 characters
		br.skip(8);

		// illustrating ready() method
		if (br.ready()) {
			// illustrating readLine() method
			System.out.println(br.readLine());

			// illustrating read(char c[],int off,int len)
			br.read(c);
			for (int i = 0; i < 20; i++) {
				System.out.print(c[i]);
			}
			System.out.println();

			// illustrating reset() method
			br.reset();
			for (int i = 0; i < 8; i++) {
				// illustrating read() method
				System.out.print((char) br.read());
			}
		}

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("src/main/java/com/practice/interview/files/file1.txt");
			// inherited method from java.io.OutputStreamWriter
			fileWriter.write(65);
			fileWriter.write(66);
			fileWriter.write(67);
			fileWriter.write('D');
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.flush();
					fileWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
