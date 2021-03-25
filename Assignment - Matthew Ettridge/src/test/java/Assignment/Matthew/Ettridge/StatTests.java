package Assignment.Matthew.Ettridge;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * A collection of tests to see if the library methods function correctly 
 * @author MATTHEW ETTRIDGE
 *
 */
public class StatTests {

	TextStats textStats = new TextStats();
	
	/**
	 * Test if the library calculates the correct values for Lorem Ipsum
	 * @throws FileNotFoundException
	 */
	@Test
	public void testLoremIpsum() throws FileNotFoundException {
		
		String fileName = "src/test/resources/LoremIpsumTest.txt";
		
		assertEquals(5, textStats.lineCount(fileName));
		assertEquals(69, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals('i', textStats.mostCommonCharacter(fileName));
		assertEquals(5, textStats.averageNumberOfLettersPerWord(fileName));
		
	}
	
	/**
	 * Test if the library can still correctly deliminate white space when the spaces between words are larger and varied
	 * @throws FileNotFoundException
	 */
	@Test
	public void testLargerSpaces() throws FileNotFoundException {
		
		String fileName = "src/test/resources/LoremIpsumLargeSpacesTest.txt";
		
		assertEquals(5, textStats.lineCount(fileName));
		assertEquals(69, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals('i', textStats.mostCommonCharacter(fileName));
		assertEquals(5, textStats.averageNumberOfLettersPerWord(fileName));
	}
	
	/**
	 * Test if the library methods don't throw errors and return correct values for empty text files
	 * @throws FileNotFoundException
	 */
	@Test
	public void testEmptyTextFile() throws FileNotFoundException {
		
		String fileName = "src/test/resources/EmptyFileTest.txt";
		
		assertEquals(0, textStats.lineCount(fileName));
		assertEquals(0, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals(' ', textStats.mostCommonCharacter(fileName));
		assertEquals(0, textStats.averageNumberOfLettersPerWord(fileName));
		
	}
	
	/**
	 * Test if the library can calculate values for a larger text file quikely and without errors
	 * @throws FileNotFoundException
	 */
	@Test
	public void testLargeTextFile() throws FileNotFoundException {
		
		String fileName = "src/test/resources/LargeFileTest.txt";
		
		assertEquals(10000, textStats.lineCount(fileName));
		assertEquals(10000, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals('e', textStats.mostCommonCharacter(fileName));
		
		
	}
	
	/**
	 * Test if the library methods can recognise and calculate correct values for text with no alphabetical characters
	 * @throws FileNotFoundException
	 */
	@Test
	public void testNonAlphabeticalTextFile() throws FileNotFoundException {
		
		String fileName = "src/test/resources/NonAlphabetTest.txt";
		
		assertEquals(1, textStats.lineCount(fileName));
		assertEquals('/', textStats.mostCommonCharacter(fileName));
		assertEquals(1, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals(17, textStats.averageNumberOfLettersPerWord(fileName));
		
	}
	
	/**
	 * Test if the library correctly throws an exception when a specified text file doesn't exist in the directory
	 * @throws FileNotFoundException
	 */
	@Test (expected = FileNotFoundException.class)
	public void testNonExistantTextFile() throws FileNotFoundException {
		
		String fileName = "ThisFileDoesntExist.txt";
		
		assertEquals(0, textStats.lineCount(fileName));
		assertEquals(0, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals(' ', textStats.mostCommonCharacter(fileName));
		assertEquals(0, textStats.averageNumberOfLettersPerWord(fileName));
		
		
	}
	
	
}
