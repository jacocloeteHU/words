package lingo.words.application.factories;

import java.util.ArrayList;

import lingo.words.domain.model.IFilter;
import lingo.words.application.filters.WordFilter;
import lingo.words.domain.model.Word;
import org.springframework.stereotype.Component;

@Component
public class WordFactory {
	// creates the word object
	private Word createWord(String wordString){
		return new Word(wordString);
	}
	
	// creates word objects and return a word list
	public ArrayList<Word> createWordList(ArrayList<String> wordsTxt){
		IFilter wordFilter = new WordFilter();
		ArrayList<Word> wordList = new ArrayList<Word>();
		for(String word : wordsTxt) {
			if(wordFilter.filter(word)) {
				wordList.add(createWord(word));
			}
		}
		return wordList;
	}

}
