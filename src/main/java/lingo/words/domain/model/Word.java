package lingo.words.domain.model;

import java.util.Objects;

public class Word {
	private int length;
	private String word;
	
	public Word(String word) {
		super();
		length = word.length();
		this.word = word;
	}

	public int getLength() {
		return length;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String content) {
		word = content;
		length = content.length();
	}

	@Override
	public String toString() {
		return "word [Length=" + length + ", Word=" + word + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Word word1 = (Word) o;
		return length == word1.length &&
				Objects.equals(word, word1.word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, word);
	}
}
