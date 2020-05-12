<<<<<<< HEAD:src/main/java/lingo/words/domain/services/WordService.java
package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;

=======
<<<<<<< Updated upstream:src/main/java/lingo/words/controllers/WordController.java
package lingo.words.controllers;

import java.util.ArrayList;

import lingo.words.models.Word;
=======
package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;
>>>>>>> Stashed changes:src/main/java/lingo/words/models/services/WordService.java

>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd:src/main/java/lingo/words/controllers/WordController.java
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
