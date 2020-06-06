package lingo.words.domain.model;

import java.util.Objects;

public class Word {
	private int Length;
	private String Word;
	
	public Word(String word) {
		super();
		Length = word.length();
		Word = word;
	}

	public int getLength() {
		return Length;
	}

	public String getWord() {
		return Word;
	}

	public void setWord(String content) {
		Word = content;
		Length = content.length();
	}

	@Override
	public String toString() {
		return "word [Length=" + Length + ", Word=" + Word + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Word word = (Word) o;
		return Length == word.Length &&
				Objects.equals(Word, word.Word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Length, Word);
	}
}
