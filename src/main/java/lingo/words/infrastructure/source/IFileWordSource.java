package lingo.words.infrastructure.source;

import java.io.IOException;
import java.util.ArrayList;

public interface IFileWordSource {

	public ArrayList<String> ReadWordsFromFile() throws IOException;
	
}
