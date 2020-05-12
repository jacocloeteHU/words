<<<<<<< HEAD:src/main/java/lingo/words/domain/model/WordGroup.java
package lingo.words.domain.model;
=======
<<<<<<< Updated upstream:src/main/java/lingo/words/models/WordGroup.java
package lingo.words.models;
=======
package lingo.words.domain.model;
>>>>>>> Stashed changes:src/main/java/lingo/words/models/model/WordGroup.java
>>>>>>> 8eb390a4fe2d2e4d518769b38fd64c4f3b8162fd:src/main/java/lingo/words/models/WordGroup.java

import java.util.ArrayList;

public class WordGroup {
	private int Length;
	private String name;
	private ArrayList<AlphabeticalCategory> AlphabetWordList = new ArrayList<AlphabeticalCategory>();
	
	public WordGroup(int length, String name) {
		super();
		Length = length;
		this.name = name;
	}
	
	public WordGroup(int length, String name, ArrayList<AlphabeticalCategory> alphabetWordList) {
		super();
		Length = length;
		this.name = name;
		AlphabetWordList = alphabetWordList;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<AlphabeticalCategory> getAlphabetWordList() {
		return AlphabetWordList;
	}

	public void setAlphabetWordList(ArrayList<AlphabeticalCategory> alphabetWordList) {
		AlphabetWordList = alphabetWordList;
	}
	
	public void addAlphabetWord(AlphabeticalCategory AlphabeticalCategory) {
		AlphabetWordList.add(AlphabeticalCategory);
	}

	@Override
	public String toString() {
		return "WordGroup [Length=" + Length + ", name=" + name + ", AlphabetWordList=" + AlphabetWordList + "]";
	}
	
	
}
