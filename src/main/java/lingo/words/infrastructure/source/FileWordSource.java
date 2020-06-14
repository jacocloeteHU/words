package lingo.words.infrastructure.source;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;

import lingo.words.domain.model.IWordSource;
import lingo.words.infrastructure.serialization.IWordDeserializer;
import lingo.words.infrastructure.serialization.SerlializationBuilder;

public class FileWordSource implements IWordSource {

	private IWordDeserializer serializer;
	private String fileName;
	private String fileType;
	
	public FileWordSource(String fileName, String fileType) {
		super();
		this.serializer = new SerlializationBuilder().initializeSerializer(fileType);
		this.fileName = fileName;
		this.fileType = fileType;
	}

/*	public FileWordSource(IWordDeserializer serializer, String fileName, String fileType) {
		super();
		this.fileType = fileType;
		this.serializer = serializer;
		this.path = path;
		this.fileName = fileName;
	}*/

	public ArrayList<String> readWords() throws IOException, URISyntaxException {
		String data = readFileAsString();
		return this.serializer.deserialize(data);
	}
	
	private String readFileAsString() throws IOException, URISyntaxException {
	/*	URI uri = ClassLoader.getSystemResource("lingo/words/").toURI();
		String mainPath = Paths.get(uri).toString();
		Path path = Paths.get(mainPath ,"Movie.class");*/

		InputStream is = getClass().getResourceAsStream("/" +fileName + fileType);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//ClassLoader classLoader = new WordsApplication().getClass().getClassLoader();
	//	File file = new File(classLoader.getResource( fileName + fileType).getFile());
		StringBuffer sb = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null)
		{
			sb.append(line + "\n");
		}
		return sb.toString();
	}

}
