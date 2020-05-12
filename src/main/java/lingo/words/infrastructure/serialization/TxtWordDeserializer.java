package lingo.words.infrastructure.serialization;

import java.util.ArrayList;
import java.util.Scanner;

public class TxtWordDeserializer implements IWordDeserializer {

	@Override
	public ArrayList<String> Deserialize(String data) {
		ArrayList<String> wordsList = new ArrayList<String>();
		Scanner scanner = new Scanner(data);
		while (scanner.hasNextLine()) {
		  String line = scanner.nextLine();
		  wordsList.add(line);
		}
		scanner.close();
		return wordsList;
	}

}
