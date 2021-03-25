package Assignment.Matthew.Ettridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Provides a collection of methods to calculate various statistics about a specified text file
 * @author MATTHEW ETTRIDGE
 *
 */
public class TextStats {

	TextReader textReader;
	
	/**
	 * Initialises the text reader
	 */
	public TextStats() {
		textReader = new TextReader();
	}
	
	/**
	 * Calculates the word count of a specified text file, excluding the white spaces
	 * @param fileName The pathname of the file to be scanned
	 * @return The number of words in the file
	 * @throws FileNotFoundException
	 */
	public int whitespaceDelimitedWordCount(String fileName) throws FileNotFoundException {
		
		//Retrieve the target text as a scanner
		Scanner text = textReader.getScannedText(fileName);
		
		
		int numberOfWords = 0;
		
		//Iterate through each word and add 1 to the total
		while(text.hasNext()) {
			
			text.next();
			numberOfWords++;
			
		}
		
		return numberOfWords;
	}
	
	
	/**
	 * Calculates the number of lines in a text file
	 * @param fileName The pathname of the file to be scanned
	 * @return The number of lines in the file
	 * @throws FileNotFoundException
	 */
	public int lineCount(String fileName) throws FileNotFoundException {
		
		//Retrieve the target text as a scanner
		Scanner text = textReader.getScannedText(fileName);
		
		int count = 0;
		
		//Iterate through each line and add 1 to the total
		while(text.hasNextLine()) {
			text.nextLine();
			count++;
			
		}
		
		return count;
		
	}
	
	
	/**
	 * Calculates the average number of letters per word in a text file
	 * @param fileName The pathname of the file to be scanned
	 * @return The average number of letters per word
	 * @throws FileNotFoundException
	 */
	public int averageNumberOfLettersPerWord(String fileName) throws FileNotFoundException {
	
		//Retrieve the target text as a scanner
		Scanner text = textReader.getScannedText(fileName);
		
		int numberOfLetters = 0;
		int numberOfWords = 0;
		
		//Iterate through each word 
		while(text.hasNext()) {
			
			//Add the number of letters in each word to the total and advance the word counter
			String currentWord = text.next();
			int letters = currentWord.length();
			numberOfLetters += letters;
			numberOfWords++;
			
		}
		
		int average = 0;
		
		//Calculate average letters per word if possible 
		if(numberOfWords > 0) {
		 average = numberOfLetters/numberOfWords;
		 return average;
		}
		
		return 0;
		
	}
	
	/**
	 * Determines the most common character in a text file
	 * @param fileName The pathname of the file to be scanned
	 * @return The most common character
	 * @throws FileNotFoundException
	 */
	public char mostCommonCharacter(String fileName) throws FileNotFoundException {
		
		//Retrieve the target text as a scanner
		Scanner text = textReader.getScannedText(fileName);
		
		
		String plainText = "";
		
		//Convert the text in the scanner into a single string 
		while(text.hasNext()) {
			plainText += text.next();
		}
		
		//Return nothing if the file is empty
		if(plainText.equals("")) {
			return ' ';
		}
		
		int highestFrequency = 0;
		char mostCommonCharacter = plainText.charAt(0);
		
		//Iterate through all characters and compare it to all other characters in the string
		for(int i = 0; i < plainText.length(); i++) {
			
			char character = plainText.charAt(i);
			int characterCount = 0;
			
			for(int j = 0; j < plainText.length(); j++) {
				
				if(character == plainText.charAt(j)) {
					characterCount++;
				}
			}
			
			//Track the character with the highest frequency
			if(characterCount > highestFrequency) {
				highestFrequency = characterCount;
				mostCommonCharacter = character;
			}
			
		}
		
		return mostCommonCharacter;
	}
}
