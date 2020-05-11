package lingo.words.application.controllers;

import java.util.ArrayList;

import lingo.words.domain.Word;

public class WordController implements IWordController {
	private ArrayList<Word> WordList; 
	
	public WordController() {
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
