package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;

public class WordService implements IWordService {
	private ArrayList<Word> WordList; 
	
	public WordService() {
		this.WordList = new ArrayList<Word>();
	}
	
	public ArrayList<Word> GetAll(){
		return this.WordList;
	}
	
	public void AddList(ArrayList<Word> words) {
		
		this.WordList.addAll(words);
/*		for(Word word : words) {
			this.Add(word);
		}*/
	}
	
	public void Add(Word word) {
		this.WordList.add(word);
	}
	
	public boolean Remove(Word word) {
		return this.WordList.remove(word);
	}
	
	public void Clear() {
		WordList.clear();
	}
}
