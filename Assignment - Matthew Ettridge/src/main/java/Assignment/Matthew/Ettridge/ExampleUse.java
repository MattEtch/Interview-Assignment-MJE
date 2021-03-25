package Assignment.Matthew.Ettridge;

import java.io.FileNotFoundException;
/**
 * 
 * @author MATTHEW ETTRIDGE
 *
 */
public class ExampleUse {

	/**
	 * A simple method that demonstrates and formats the outputs of the library methods
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Initialise library and select target file
		TextStats textStats = new TextStats();
		String chosenFile = "src/test/resources/LoremIpsumTest.txt";
		
		//Perform library operations and format the results 
		System.out.println("The file containts " + textStats.lineCount(chosenFile) + " lines");
		System.out.println("The file containts an average of " + textStats.averageNumberOfLettersPerWord(chosenFile) + " letters per word");
		System.out.println("The file's most common character is " + textStats.mostCommonCharacter(chosenFile));
		System.out.println("The file containts " + textStats.whitespaceDelimitedWordCount(chosenFile) + " words");

	}

}
