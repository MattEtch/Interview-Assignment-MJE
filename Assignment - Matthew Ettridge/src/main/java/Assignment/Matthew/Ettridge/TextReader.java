package Assignment.Matthew.Ettridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

	public Scanner getScannedText(String fileName) throws FileNotFoundException {
		
		File file = new File("Test.txt");
		Scanner scannedText = new Scanner(file);
		return scannedText;
		
	}
	
}
