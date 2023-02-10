package lec14_03_java_read_and_write;

import java.io.File;
import java.io.IOException;

public class C_creating_folder_and_file {

	public static void main(String[] args) {
		// Creating a Folder (file explorer)
		// for Mac user -- got to the properties -- if the folder name is JanQABootcamp -- /Users/YourName/Desktop/JanQABootcamp
		File folder = new File("C:\\Users\\Tofael\\Desktop\\JanQABootcamp"); 
		folder.mkdir(); // this method make directory or folder
		if(folder.exists()) {
			System.out.println(folder.getName() + " folder is created.");
			// Craeting a file
			File file = new File("C:\\Users\\Tofael\\Desktop\\JanQABootcamp\\Jan2023.txt");
			// An exception can be occur, use try catch block or declare throws
			// IOException is the base class for exceptions thrown while accessing information using streams, files and directories. 
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("The exception is >>>>> " + e);
				// e.printStackTrace(); // we can also use method of Exception class
			}
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the JanQABootcamp Folder.");
			} else {
				System.out.println("Exception occured, file is not created");
			}
			
		} else {
			System.out.println("Folder is not created");
		}
	
	}

}
