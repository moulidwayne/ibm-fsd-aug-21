package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestNodeStreams {

	public static void main(String args[]) throws IOException {
		FileReader reader=null;
		FileWriter writer=null;
		try {
			reader = new FileReader("input.txt");

			writer = new FileWriter("output.txt");

			char[] buffer = new char[128];
			int charsRead;
			// read the first buffer
			charsRead = reader.read(buffer);
			while (charsRead != -1) {
				// write buffer to the output file
				writer.write(buffer, 0, charsRead);
				// read the next buffer
				charsRead = reader.read(buffer);

			}
		} catch (IOException ioe) {
			ioe.printStackTrace();

		} finally {
			
			reader.close();
			writer.close();
		}
	}

}
