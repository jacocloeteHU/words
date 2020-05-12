<<<<<<< Updated upstream:src/main/java/lingo/words/controllers/IWordController.java
package lingo.words.controllers;

import java.util.ArrayList;

import lingo.words.models.Word;
=======
package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;
>>>>>>> Stashed changes:src/main/java/lingo/words/models/services/IWordService.java

public interface IWordService {
	public ArrayList<Word> GetAll();
	
	public void AddList(ArrayList<Word> words);
	
	public void Add(Word word);
	
	public boolean Remove(Word word);

	public void Clear();
}
