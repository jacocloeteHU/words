package lingo.words.application.services;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

import lingo.words.domain.model.IWordSource;
import lingo.words.domain.model.Word;
import lingo.words.domain.services.DomainServices;
import lingo.words.application.factories.WordFactory;
import lingo.words.infrastructure.source.FileWordSource;

public class WordService {
	
	public static boolean LoadWordsFromSource(String fileName, String fileType) throws IOException, URISyntaxException {
		IWordSource fileSource = new FileWordSource(fileName, fileType);
		ArrayList<String> words = fileSource.ReadWords();
		return CreateWords(words);
	}

	public static boolean CreateWords(ArrayList<String> words) {
		ArrayList<Word> wordsList = WordFactory.CreateWordList(words);
		DomainServices.WordService().Clear();
		DomainServices.WordService().AddList(wordsList);
		return true;	
	}

	public static Word GetWord() {
		Random rand = new Random();
		ArrayList<Word> wordsList = DomainServices.WordService().GetAll();
		return wordsList.get(rand.nextInt(wordsList.size()));
	}

	public static Word GetWordByLength(int length) {
		Random rand = new Random();
		ArrayList<Word> wordsList = DomainServices.WordService().GetAll();
		wordsList = (ArrayList<Word>) wordsList.stream().filter(x -> x.getLength() == length).collect(Collectors.toList());
		return wordsList.get(rand.nextInt(wordsList.size()));
	}
	
	public static ArrayList<Word> GetWords() {
		ArrayList<Word> wordsList = DomainServices.WordService().GetAll();
		return wordsList;
	}

	public static ArrayList<Word> GetWordsByLength(int length) {
		ArrayList<Word> wordsList = DomainServices.WordService().GetAll();
		return (ArrayList<Word>) wordsList.stream().filter(x -> x.getLength() == length).collect(Collectors.toList());
	}
}