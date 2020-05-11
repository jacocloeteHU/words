package lingo.words.application.filters;

/*import java.util.ArrayList;
import java.util.Arrays;*/

public class WordFilter implements IFilter {

	// check if a word only exists of 5 to 7 letter, lowercase and non special chars. 
	public boolean Filter(String word) {
		return word.matches("^[a-z]{5,7}+$");
	}
	
	// Filter with all mini filters combined
	/*
	 * public boolean Filter(String word) { if((LengthFilter(word) &&
	 * UppercaseFiler(word) && SpecialCharsFilter(word)) == true) { return true; }
	 * else return false; }
	 * 
	 * // checks if the word is a valid length private boolean LengthFilter(String
	 * word) { ArrayList<Integer> lengthList = new ArrayList<>(Arrays.asList( 5, 6,
	 * 7)); int wordLength = word.length(); if(lengthList.contains(wordLength)) {
	 * return true; } else return false; }
	 * 
	 * // checks if the word has an uppercase letter private boolean
	 * UppercaseFiler(String word) { boolean isLowerCase =
	 * word.equals(word.toLowerCase()); return isLowerCase; }
	 * 
	 * // check if the word doesnt contain chars like @#$^&/.,=-_ ^[a-z]{5,7}+$
	 * private boolean SpecialCharsFilter(String word) { return
	 * word.matches("^[a-z]+$"); }
	 */

}
