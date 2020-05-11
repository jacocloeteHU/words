package lingo.words.models;

public class Word {
	private int Length;
	private String Content;
	
	public Word(int length, String content) {
		super();
		Length = length;
		Content = content;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return "word [Length=" + Length + ", Content=" + Content + "]";
	}
	
	

}
