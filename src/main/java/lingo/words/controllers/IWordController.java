package lingo.words.controllers;

import java.util.ArrayList;

import lingo.words.models.Word;

public interface IWordController {
	public ArrayList<Word> GetAll();
	
	public void AddList(ArrayList<Word> words);
	
	public void Add(Word word);
	
	public boolean Remove(Word word);

	public void Clear();
}
