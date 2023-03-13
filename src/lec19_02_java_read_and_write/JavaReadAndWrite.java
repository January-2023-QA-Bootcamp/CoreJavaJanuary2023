package lec19_02_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) {
		// Creating Folder
			// for Mac user -- go to the properties -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
			File folder = new File ("C:\\Users\\Tofael\\Desktop\\JanuaryBatch");
			folder.mkdir(); // this method make directory or folder and this is coming from File class
			
			if (folder.exists()) {
				System.out.println(folder.getName() + " folder is created");
				// Creating file
				File file = new File("C:\\Users\\Tofael\\Desktop\\JanuaryBatch\\January2023.txt");
				// An exception can occur during creation of a file
				// IOException is the base class for exceptions thrown while accessing information using streams,
				// files and directories. 
				try {
					file.createNewFile();			
				} catch (IOException e) {
					System.out.println("The new file is not created and the exception is: >>>>>> " + e);
				}
				
				if (file.exists()) {
					System.out.println(file.getName() + " file is created inside January Batch Directory");
					// learning here from today
					System.out.println("<-- Please write something about the students of January 2023 Batch -->");
					Scanner scanner = new Scanner(System.in);
					String userInput = scanner.nextLine();
					
					FileWriter fw = null;
					try {
						fw = new FileWriter(file);
						// %S or %s: Specifies String
						fw.write(userInput);
						fw.close();
					} catch (Exception f) {
						System.out.println("Not printing");
						//f.printStackTrace(); // this method print the Exception or you can use sysout like line 26
					}
					
					System.out.println("Now go to the Desktop, open the folder, then the file and see what is written in the file");
					
					String filePath = "C:\\Users\\Tofael\\Desktop\\JanuaryBatch\\January2023.txt";
					
					FileReader fr = null;
					BufferedReader br = null;
					
					try {
						fr = new FileReader(filePath);
						System.out.println("FileReader find the location of the path as: " + filePath);
					} catch (FileNotFoundException g ) {
						g.printStackTrace();
					}
					// TODO need to discuss with Nasir 
					String data = " ";
					
					try {
						br = new BufferedReader(fr);
						while((data = br.readLine()) != null) {
							System.out.println("The BufferedReader read the file and got:  " + data);
						}
					} catch ( IOException h) {
						h.printStackTrace();
					} finally {
						if (fr != null) {
							fr = null; // If fr is not null, make it null, mean close the resource.
						}
						if (br != null) {
							br = null; // If br is not null, make it null, mean close the resource.
						}
					}
					scanner.close();
					
					} else {
					System.out.println("Exception Occured, file is not generated");
				}
		
			} else {
				System.out.println("Folder is not Created");
			}
			

		}

}
