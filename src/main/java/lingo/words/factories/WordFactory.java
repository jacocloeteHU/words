package lingo.words.factories;

import java.util.ArrayList;

<<<<<<< Updated upstream:src/main/java/lingo/words/factories/WordFactory.java
import lingo.words.filters.IFilter;
import lingo.words.filters.WordFilter;
import lingo.words.models.Word;
=======
import lingo.words.application.filters.IFilter;
import lingo.words.application.filters.WordFilter;
import lingo.words.domain.model.Word;
>>>>>>> Stashed changes:src/main/java/lingo/words/application/factories/WordFactory.java

public class WordFactory {
	// creates the word object
	private static Word CreateWord(String wordString){
		return new Word(wordString.length(), wordString);
	}
	
	// creates word objects and return a word list
	public static ArrayList<Word> CreateWordList(ArrayList<String> wordsTxt){
		IFilter wordFilter = new WordFilter();
		ArrayList<Word> wordList = new ArrayList<Word>();
		for(String word : wordsTxt) {
			if(wordFilter.Filter(word)) {
				wordList.add(WordFactory.CreateWord(word));
			}
		}
		return wordList;
	}

}
