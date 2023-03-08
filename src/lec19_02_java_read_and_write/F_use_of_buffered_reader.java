package lec19_02_java_read_and_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F_use_of_buffered_reader {

	public static void main(String[] args) throws FileNotFoundException {
		// The coding is not complete, we have to create the file by playing the C class
		String path = "C:\\Users\\Tofael\\Desktop\\JanQABootcamp\\Jan2023.txt";
		FileReader fileReader = new FileReader(path);
		// if FileReader can read/recognize the file in path, the above line will be
		// executed
		System.out.println("FileReader find the location of the path as: " + path);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String data = " ";
		try {
			while((data = bufferedReader.readLine()) != null) {
				System.out.println("The BufferedReader read the file and got::> " + data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
