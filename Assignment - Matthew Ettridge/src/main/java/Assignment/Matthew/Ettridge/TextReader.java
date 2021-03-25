package Assignment.Matthew.Ettridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class that handles locating and reading text from a specified text file
 * @author MATTHEW ETTRIDGE
 *
 */
public class TextReader {

	/**
	 * Creates a scanner based on a specified text file.
	 * @param fileName The pathname of the file to be scanned 
	 * @return The scanner based on the text file
	 * @throws FileNotFoundException
	 */
	public Scanner getScannedText(String fileName) throws FileNotFoundException {
		
		File file = new File(fileName);
		Scanner scannedText = new Scanner(file);
		return scannedText;
		
	}
	
}
