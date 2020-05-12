<<<<<<< HEAD:src/main/java/lingo/words/domain/model/AlphabeticalCategory.java
package lingo.words.domain.model;
=======
<<<<<<< Updated upstream:src/main/java/lingo/words/models/AlphabeticalCategory.java
package lingo.words.models;
=======
package lingo.words.domain.model;
>>>>>>> Stashed changes:src/main/java/lingo/words/models/model/AlphabeticalCategory.java
>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd:src/main/java/lingo/words/models/AlphabeticalCategory.java

import java.util.ArrayList;

public class AlphabeticalCategory {
	private ArrayList<Word> words = new ArrayList<Word>();
	private char CategoryLetter;
	
	public AlphabeticalCategory(char categoryLetter) {
		super();
		CategoryLetter = categoryLetter;
	}
	
	public AlphabeticalCategory(ArrayList<Word> words, char categoryLetter) {
		super();
		this.words = words;
		CategoryLetter = categoryLetter;
	}

	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}
	
	public void addWord(Word word) {
		this.words.add(word);
	}

	public char getCategoryLetter() {
		return CategoryLetter;
	}

	public void setCategoryLetter(char categoryLetter) {
		CategoryLetter = categoryLetter;
	}

	@Override
	public String toString() {
		return "AlphabeticalCategory [words=" + words + ", CategoryLetter=" + CategoryLetter + "]";
	}
	
	
}
