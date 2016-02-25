package edu.cis232;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainMethod {

	public static void main(String[] args) throws IOException {
		
		
		String message;
		
		
		try{
			File File = new File("ShapeName.txt");
			Scanner inputFile = new Scanner(File);
			int count = 0, i = 0;
			Shape[] Shapes = new Shape[4];
			 
			while (inputFile.hasNext()){
				message = inputFile.nextLine();
				StringTokenizer tokens = new StringTokenizer(message,(","));
				if(message.contains("Circle")){
					String num = tokens.nextToken();
					char character = num.toc;
					if (character.isDigit()){
						
					}
				}
				
				System.out.println(message);
						
				}
				
			
			
			inputFile.close();
			
		}
		
		catch(IOException IOError){
			
			message = "Error:" + IOError;
		}
		
		
	}

}
