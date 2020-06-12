package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;
import org.springframework.stereotype.Service;

@Service
public class WordService implements IWordService {
	private ArrayList<Word> wordList;
	
	public WordService() {
		this.wordList = new ArrayList<Word>();
	}
	
	public ArrayList<Word> getAll(){
		return this.wordList;
	}
	
	public void addList(ArrayList<Word> words) {
		
		this.wordList.addAll(words);
	}

	public void clear() {
		wordList.clear();
	}
}
