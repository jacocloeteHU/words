package lingo.words.application.services;

import java.io.IOException;
import java.util.ArrayList;

import lingo.words.domain.model.Word;
import lingo.words.domain.services.DomainServices;
import lingo.words.application.factories.WordFactory;
import lingo.words.infrastructure.source.FileWordSource;
import lingo.words.infrastructure.source.IFileWordSource;

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