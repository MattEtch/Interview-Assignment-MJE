package Assignment.Matthew.Ettridge;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

public class StatTests {

	TextStats textStats = new TextStats();
	
	@Test
	public void testLoremIpsum() throws FileNotFoundException {
		
		String fileName = "src/test/resources/LoremIpsum.txt";
		
		assertEquals(5, textStats.lineCount(fileName));
		assertEquals(69, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals('i', textStats.mostCommonCharacter(fileName));
		assertEquals(5, textStats.averageNumberOfLettersPerWord(fileName));
		
	}
	
	@Test
	public void testLargerSpaces() throws FileNotFoundException {
		
		String fileName = "src/test/resources/LoremIpsumLargeSpacesTest.txt";
		
		assertEquals(5, textStats.lineCount(fileName));
		assertEquals(69, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals('i', textStats.mostCommonCharacter(fileName));
		assertEquals(5, textStats.averageNumberOfLettersPerWord(fileName));
	}
	
	@Test
	public void testEmptyTextFile() throws FileNotFoundException {
		
		String fileName = "src/test/resources/EmptyFileTest.txt";
		
		assertEquals(0, textStats.lineCount(fileName));
		assertEquals(0, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals(' ', textStats.mostCommonCharacter(fileName));
		assertEquals(0, textStats.averageNumberOfLettersPerWord(fileName));
		
	}
	
	@Test
	public void testLargeTextFile() throws FileNotFoundException {
		
		String fileName = "src/test/resources/LargeFileTest.txt";
		
		assertEquals(10000, textStats.lineCount(fileName));
		assertEquals(10000, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals('e', textStats.mostCommonCharacter(fileName));
		
		
	}
	
	@Test
	public void testNonAlphabeticalTextFile() throws FileNotFoundException {
		
		String fileName = "src/test/resources/NonAlphabetTest.txt";
		
		assertEquals(1, textStats.lineCount(fileName));
		assertEquals('/', textStats.mostCommonCharacter(fileName));
		
		
	}
	
	@Test (expected = FileNotFoundException.class)
	public void testNonExistantTextFile() throws FileNotFoundException {
		
		String fileName = "ThisFileDoesntExist.txt";
		
		assertEquals(0, textStats.lineCount(fileName));
		assertEquals(0, textStats.whitespaceDelimitedWordCount(fileName));
		assertEquals(' ', textStats.mostCommonCharacter(fileName));
		assertEquals(0, textStats.averageNumberOfLettersPerWord(fileName));
		
		
	}
	
	
}
