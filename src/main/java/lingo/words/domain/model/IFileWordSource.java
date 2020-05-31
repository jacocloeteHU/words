package lingo.words.domain.model;

import java.io.IOException;
import java.util.ArrayList;

public interface IFileWordSource {

	public ArrayList<String> ReadWords() throws IOException;
	
}
