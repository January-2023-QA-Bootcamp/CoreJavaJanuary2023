package lec19_02_java_read_and_write;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class E_use_of_file_reader {

	public static void main(String[] args) {
		// The coding is not complete, we have to create the file by playing the C class
		String path = "C:\\Users\\Tofael\\Desktop\\JanQABootcamp\\Jan2023.txt";
		try {
			FileReader fileReader = new FileReader(path);
			// if FileReader can read/recognize the file in path, the above line will be executed
			System.out.println("FileReader find the location of the path as: " + path);
		} catch (FileNotFoundException e) {
			System.out.println("The exception occured and that is >>>>> " + e);
			// e.printStackTrace();
		}
	
	}

}
