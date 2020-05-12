package lingo.words.domain.model;

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
