package lingo.words.infrastructure.serialization;

import java.util.ArrayList;

public interface IWordDeserializer {
	ArrayList<String> deserialize(String data);
}
