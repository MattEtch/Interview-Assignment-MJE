package Assignment.Matthew.Ettridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextStats {

	TextReader textReader;
	
	public TextStats() {
		textReader = new TextReader();
	}
	
	public int whitespaceDelimitedWordCount(String fileName) throws FileNotFoundException {
		
		Scanner text = textReader.getScannedText(fileName);
		
		
		int numberOfWords = 0;
		
		while(text.hasNext()) {
			
			
			text.next();
			
			numberOfWords++;
			
		}
		
		return numberOfWords;
	}
	
	public int lineCount(String fileName) throws FileNotFoundException {
		
		Scanner text = textReader.getScannedText(fileName);
		
		int count = 0;
		while(text.hasNextLine()) {
			text.nextLine();
			count++;
			
		}
		
		return count;
		
	}
	
	public int averageNumberOfLettersPerWord(String fileName) throws FileNotFoundException {
	
		Scanner text = textReader.getScannedText(fileName);
		
		int numberOfLetters = 0;
		int numberOfWords = 0;
		
		
		while(text.hasNext()) {
			
			
			String currentWord = text.next();
			int letters = currentWord.length();
			numberOfLetters += letters;
			numberOfWords++;
			
		}
		
		int average = 0;
		if(numberOfWords > 0) {
		 average = numberOfLetters/numberOfWords;
		 return average;
		}
		
		return 0;
		
	}
	
	public char mostCommonCharacter(String fileName) throws FileNotFoundException {
		
		Scanner text = textReader.getScannedText(fileName);
		
		
		String plainText = "";
		
		while(text.hasNext()) {
			plainText += text.next();
		}
		
		if(plainText.equals("")) {
			return ' ';
		}
		
		int highestFrequency = 0;
		char mostCommonCharacter = plainText.charAt(0);
		
		for(int i = 0; i < plainText.length(); i++) {
			
			char character = plainText.charAt(i);
			int characterCount = 0;
			
			for(int j = 0; j < plainText.length(); j++) {
				
				if(character == plainText.charAt(j)) {
					characterCount++;
				}
			}
			
			if(characterCount > highestFrequency) {
				highestFrequency = characterCount;
				mostCommonCharacter = character;
			}
			
		}
		
		return mostCommonCharacter;
	}
}
