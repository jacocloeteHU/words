package lingo.words;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lingo.words.application.services.WordService;

@SpringBootApplication
public class WordsApplication {

	public static void main(String[] args) {
		try {
			InitializeApplication();
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		SpringApplication.run(WordsApplication.class, args);
	}
	
	private static void InitializeApplication() throws IOException, URISyntaxException {
		WordService.LoadWordsFromSource( "words", ".csv");
		//WordService.LoadWordsFromSource("C:/Users/jacoc/Documents/GitHub/words/src/main/resources/", "words", ".csv");
		System.out.println("hier moet je eerste woord staan. " + WordService.GetWords().get(0).getWord());
	}

}
