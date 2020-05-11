package lingo.words.service;

import java.util.ArrayList;
import lingo.words.factories.WordFactory;
import lingo.words.models.Word;

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