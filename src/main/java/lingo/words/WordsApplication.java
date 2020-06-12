package lingo.words;

import java.io.IOException;
import java.net.URISyntaxException;

import lingo.words.application.services.IWordViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class WordsApplication implements CommandLineRunner {
@Autowired
IWordViewService wordService;
	public static void main(String[] args) {

		SpringApplication.run(WordsApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException, URISyntaxException {
		wordService.loadWordsFromSource( "words", ".csv");
		//WordService.LoadWordsFromSource("C:/Users/jacoc/Documents/GitHub/words/src/main/resources/", "words", ".csv");
		System.out.println("hier moet je eerste woord staan. " + wordService.getWords().get(0).getWord());
	}

}
