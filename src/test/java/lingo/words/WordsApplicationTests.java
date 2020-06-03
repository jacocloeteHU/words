package lingo.words;

import org.junit.jupiter.api.Test;

import lingo.words.application.services.WordService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class WordsApplicationTests {

	@Test
	public void contextLoads() throws IOException, URISyntaxException {
		WordService.LoadWordsFromSource( "words", ".csv");
		//WordService.LoadWordsFromSource("C:/Users/jacoc/Documents/GitHub/words/src/main/resources/", "words", ".csv");
		assertEquals(42, Integer.sum(19, 23));
	}

}
