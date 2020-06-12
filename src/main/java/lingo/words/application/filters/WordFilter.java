package lingo.words.application.filters;

public class WordFilter implements IFilter {

	// checks if word is only writen in lowercase, size 5-7 and no special chars
	public boolean filter(String word) {
		return word.matches("^[a-z]{5,7}+$");
	}


}
