package lec19_02_java_read_and_write;

import java.io.File;
import java.io.IOException;

//Extra knowledge, if interested so, different way to create folder and file
public class D_creating_folder_and_file_by_different_way {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Tofael\\Desktop\\Enthrall\\Students.txt");
		try {
			file.getParentFile().mkdir();
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("The error message is: " + e);
		}

	}

}
