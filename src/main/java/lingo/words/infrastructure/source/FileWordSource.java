package lingo.words.infrastructure.source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import lingo.words.infrastructure.serialization.IWordDeserializer;
import lingo.words.infrastructure.serialization.SerlializationBuilder;

public class FileWordSource implements IFileWordSource {
	
	private IWordDeserializer serializer;
	private String path;
	private String fileName;
	private String fileType;
	
	public FileWordSource(String path, String fileName, String fileType) {
		super();
		this.serializer = new SerlializationBuilder().InitializeSerializer(fileType);
		this.path = path;
		this.fileName = fileName;
		this.fileType = fileType;
	}

	public FileWordSource(IWordDeserializer serializer, String path, String fileName, String fileType) {
		super();
		this.fileType = fileType;
		this.serializer = serializer;
		this.path = path;
		this.fileName = fileName;
	}

	public ArrayList<String> ReadWordsFromFile() throws IOException {
		String data = ReadFileAsString();
		return this.serializer.Deserialize(data);
	}
	
	private String ReadFileAsString() throws IOException {
		return new String(Files.readAllBytes(Paths.get(this.path + this.fileName + this.fileType)));
	}

}
