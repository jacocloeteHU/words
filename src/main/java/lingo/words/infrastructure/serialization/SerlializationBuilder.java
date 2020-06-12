package lingo.words.infrastructure.serialization;

public class SerlializationBuilder {
	public IWordDeserializer initializeSerializer(String fileType) {
		switch(fileType) {
		  case ".txt":
		      return new TxtWordDeserializer();
		  case ".csv":
			  return new CsvWordDeserializer();
		  case ".json":
			  return new JsonWordDeserializer();
		  default:
			  return new TxtWordDeserializer();
		}
	}

}
