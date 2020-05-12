package lingo.words.service;

import java.io.IOException;
import java.util.ArrayList;
<<<<<<< Updated upstream:src/main/java/lingo/words/service/WordService.java
import lingo.words.factories.WordFactory;
import lingo.words.models.Word;
=======

import lingo.words.application.factories.WordFactory;
import lingo.words.domain.model.Word;
import lingo.words.domain.services.DomainServices;
import lingo.words.infrastructure.source.FileWordSource;
import lingo.words.infrastructure.source.IFileWordSource;
>>>>>>> Stashed changes:src/main/java/lingo/words/application/services/WordService.java

public class WordService {
	
	public static boolean LoadWordsFromSource(String path, String fileName, String fileType) throws IOException {
		IFileWordSource fileSource = new FileWordSource(path, fileName, fileType);
		ArrayList<String> words = fileSource.ReadWordsFromFile();
		return CreateWords(words);
	}

	public static boolean CreateWords(ArrayList<String> words) {
		ArrayList<Word> wordsList = WordFactory.CreateWordList(words);
		DomainServices.WordService().Clear();
		DomainServices.WordService().AddList(wordsList);
		return true;	
	}
	
	public static ArrayList<Word> GetWords() {
		ArrayList<Word> wordsList = DomainServices.WordService().GetAll();
		return wordsList;
	}
} 