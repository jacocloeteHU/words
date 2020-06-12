package lingo.words;

import lingo.words.application.services.IWordViewService;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.io.IOException;
import java.net.URISyntaxException;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WordsApplicationTests {
	@Autowired
	IWordViewService wordViewService;
	@Test
	public void contextLoads() throws IOException, URISyntaxException {
		wordViewService.loadWordsFromSource( "words", ".csv");
		//WordService.LoadWordsFromSource("C:/Users/jacoc/Documents/GitHub/words/src/main/resources/", "words", ".csv");
		assertEquals(42, Integer.sum(19, 23));
	}

}
