package filters;

import java.util.ArrayList;

public class WordFilter {
	
	// checks if the word is a valid length 
	public Boolean LengthFilter(String word, ArrayList<Integer> lengthList) {
		int wordLength = word.length();
		if(lengthList.contains(wordLength)) {
			return true;
		} else return false;
	}
	
	// checks if the word has an uppercase letter
	public Boolean UppercaseFiler(String word) {
		boolean isLowerCase = word.equals(word.toLowerCase());
		return isLowerCase;
	}
	
	// check if the word doesnt contain chars like @#$^&/.,=-_ 
	public boolean SpeecialCharsFilter(String word) {
		if(word.matches("[a-z]")) {
			return true;
		} else return false;
	}

}
