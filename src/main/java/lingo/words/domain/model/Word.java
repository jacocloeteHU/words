<<<<<<< HEAD:src/main/java/lingo/words/domain/model/Word.java
package lingo.words.domain.model;
=======
<<<<<<< Updated upstream:src/main/java/lingo/words/models/Word.java
package lingo.words.models;
=======
package lingo.words.domain.model;
>>>>>>> Stashed changes:src/main/java/lingo/words/models/model/Word.java
>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd:src/main/java/lingo/words/models/Word.java

public class Word {
	private int Length;
	private String Word;
	
	public Word(int length, String content) {
		super();
		Length = length;
		Word = content;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public String getWord() {
		return Word;
	}

	public void setWord(String content) {
		Word = content;
	}

	@Override
	public String toString() {
		return "word [Length=" + Length + ", Word=" + Word + "]";
	}
	
	

}
