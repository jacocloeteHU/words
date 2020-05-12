<<<<<<< HEAD:src/main/java/lingo/words/domain/services/IWordService.java
package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;

=======
<<<<<<< Updated upstream:src/main/java/lingo/words/controllers/IWordController.java
package lingo.words.controllers;

import java.util.ArrayList;

import lingo.words.models.Word;
=======
package lingo.words.domain.services;

import java.util.ArrayList;

import lingo.words.domain.model.Word;
>>>>>>> Stashed changes:src/main/java/lingo/words/models/services/IWordService.java

>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd:src/main/java/lingo/words/controllers/IWordController.java
public interface IWordService {
	public ArrayList<Word> GetAll();
	
	public void AddList(ArrayList<Word> words);
	
	public void Add(Word word);
	
	public boolean Remove(Word word);

	public void Clear();
}
