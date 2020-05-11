package lingo.words.application.services;

import java.util.ArrayList;

import lingo.words.application.factories.WordFactory;
import lingo.words.domain.Word;

public class WordService {

	public static boolean CreateWords(ArrayList<String> words) {
		ArrayList<Word> wordsList = WordFactory.CreateWordList(words);
		ControllersService.GetWordController().Clear();
		ControllersService.GetWordController().AddList(wordsList);
		return true;	
	}
	
	public static ArrayList<Word> GetWords() {
		ArrayList<Word> wordsList = ControllersService.GetWordController().GetAll();
		return wordsList;
	}
} 