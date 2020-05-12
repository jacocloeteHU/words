package lingo.words;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD
=======
<<<<<<< Updated upstream
import lingo.words.factories.WordFactory;
import lingo.words.filters.IFilter;
import lingo.words.filters.WordFilter;
import lingo.words.models.Word;
import lingo.words.service.ControllersService;
import lingo.words.service.WordService;
=======
>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd

import lingo.words.application.factories.WordFactory;
import lingo.words.application.filters.IFilter;
import lingo.words.application.filters.WordFilter;
import lingo.words.application.services.WordService;
import lingo.words.domain.model.Word;
import lingo.words.domain.services.DomainServices;
<<<<<<< HEAD
=======
>>>>>>> Stashed changes
>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

@SpringBootTest
class WordsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAdd() {
	    assertEquals(42, Integer.sum(19, 23));
	}
	
	@Test
	public void testDivide() {
	    assertThrows(ArithmeticException.class, () -> {
	        Integer.divideUnsigned(42, 0);
	    });
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
		words.add(new Word(5, "pinda"));
		words.add(new Word(5, "choco"));
		words.add(new Word(5, "alade"));
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
