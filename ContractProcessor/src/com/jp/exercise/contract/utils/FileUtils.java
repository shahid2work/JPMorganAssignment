package com.jp.exercise.contract.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class FileUtils {

	@SuppressWarnings("resource")
	public int getLineCount(String filename) {
	    Scanner fileScanner = null;
	    int lineCount = 0;
	    Pattern lineEndPattern = Pattern.compile("(?m)$");  
	    try {
	        fileScanner = new Scanner(new File(filename)).useDelimiter(lineEndPattern);
	        while (fileScanner.hasNext()) {
	            fileScanner.next();
	            ++lineCount;
	        }   
	    }catch(FileNotFoundException e) {
	        e.printStackTrace();
	        return lineCount;
	    }
	    fileScanner.close();
	    return lineCount;
	}
	
	public String[][] readCSVtoString(String filename) {
		Scanner fileScanner = null;
		String fileContent = null;
		int num_row = getLineCount(filename);
		int numberOfLines=0;
		String[][] resultData = null;
		while ( fileScanner.hasNextLine() && numberOfLines < num_row){
			fileContent = fileScanner.nextLine();
			resultData [numberOfLines++] = fileContent.split(",");
	        }
		return resultData;
       }
	
	
}
