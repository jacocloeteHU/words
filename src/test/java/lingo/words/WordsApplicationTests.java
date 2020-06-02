package lingo.words;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import lingo.words.application.factories.WordFactory;
import lingo.words.application.filters.IFilter;
import lingo.words.application.filters.WordFilter;
import lingo.words.application.services.WordService;
import lingo.words.domain.model.Word;
import lingo.words.domain.services.DomainServices;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.io.IOException;
import java.util.ArrayList;

public class WordsApplicationTests {

	@Test
	public void contextLoads() throws IOException {
		WordService.LoadWordsFromSource("C:/Users/jacoc/Documents/GitHub/words/src/main/resources/", "words", ".csv");
		assertEquals(42, Integer.sum(19, 23));
	}
	
	@Test
	public void testAdd() {
	    assertEquals(42, Integer.sum(19, 23));
	}
	
	@Test
	@DisplayName("Testing Word object")
	public void CreateWord() {
	    Word word = new Word("testen");
		lengthWord(word);
		lengthWordmanipulation(word);
	}

	@DisplayName("Testing Word length and size")
	public void lengthWord(Word word) {
		assertEquals(6 ,word.getLength());
		assertEquals(6 ,word.getWord().length());
		//Word word = new Word("testen");
	}

	@DisplayName("Testing Word length/size after manipulation")
	public void lengthWordmanipulation(Word word) {
		word.setWord("testenen");
		assertEquals(8 ,word.getLength());
		assertEquals(8 ,word.getWord().length());
		//Word word = new Word("testen");
	}
	
	@Test
	@DisplayName("Filter Set Test")
	public void FilterLengthTest() {
		IFilter filter = new WordFilter();
		assertEquals(true, filter.Filter("banaan"));
		assertEquals(false, filter.Filter("banaanen"));
		assertEquals(true, filter.Filter("peren"));
		assertEquals(false, filter.Filter("bana"));
		assertEquals(false, filter.Filter("banan%"));
		assertEquals(false, filter.Filter("Banaan"));
	}
	
	@Test
	@DisplayName("Words Service Test")
	public void WordsServiceTest() {
		WordService.CreateWords(GetWordString());
		assertEquals(3 ,WordService.GetWords().size());
	}
	
	@Test
	@DisplayName("WordsController Addlist Test")
	public void WordsController() {
		ArrayList<Word> words = new ArrayList<Word>();
		words.add(new Word( "pinda"));
		words.add(new Word( "choco"));
		words.add(new Word("alade"));
		DomainServices.WordService().Clear();
		DomainServices.WordService().AddList(words);
		assertEquals(3 ,WordService.GetWords().size());
	}
	
	@Test
	@DisplayName("WordFactory List Creation Test")
	public void WordFactoryTest() {
		ArrayList<Word> wWords = WordFactory.CreateWordList(GetWordString());
		assertEquals(3, wWords.size());
	}
	
	private ArrayList<String> GetWordString() { 
		ArrayList<String> sWords =  new ArrayList<String>();
		sWords.add("banaan");
		sWords.add("appel");
		sWords.add("._peer");
		sWords.add("peren");
		sWords.add("peren$");
		sWords.add("Bananen");
	
		return sWords;
	}
	


}
