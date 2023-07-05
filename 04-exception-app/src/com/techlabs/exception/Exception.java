package com.techlabs.exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
	import java.io.IOException;

public class Exception {
	


	public static void main(String[] args) throws FileNotFoundException{
		
		
		        String filePath = "C:\\Users\\vismi\\OneDrive\\Desktop\\Exception.txt";

		        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
		            int line;
		            while ((line = fis.read()) != null) {
		                System.out.println("File found");
		            }
		        } catch (IOException e) {
		            // Handle exception
		            System.out.println("File not found");
		        }
		    }
		

	}


