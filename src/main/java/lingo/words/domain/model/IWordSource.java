package lingo.words.domain.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public interface IWordSource {

	public ArrayList<String> readWords() throws IOException, URISyntaxException;
	
}
