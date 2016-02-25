package edu.cis232;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		
		String message;
		
		
		try{
			File File = new File("ShapeName.txt");
			Scanner inputFile = new Scanner(File);
			
			while (inputFile.hasNext()){
				message = inputFile.nextLine();
				
				System.out.println(message);
				
			}
			inputFile.close();
		}
		
		catch(IOException IOError){
			
			message = "Error:" + IOError;
		}
		
		
	}

}
