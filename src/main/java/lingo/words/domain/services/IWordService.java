package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;
public interface IWordService {
	public ArrayList<Word> GetAll();
	
	public void AddList(ArrayList<Word> words);
	
//	public void Add(Word word);
//
//	public boolean Remove(Word word);

	public void Clear();
}
