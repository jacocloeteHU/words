package lingo.words.infrastructure.serialization;

import lingo.words.domain.model.Word;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SerializationBuilderTest {
    public SerializationBuilderTest() {
    }

    @Test
    @DisplayName("Testing Serializer creation ")
    public void createSerializer() {
        IWordDeserializer csvSerializer = new SerlializationBuilder().initializeSerializer(".csv");
        Assertions.assertTrue(csvSerializer.getClass().getName().contains("CsvWordDeserializer"));
        IWordDeserializer txtSerializer = new SerlializationBuilder().initializeSerializer(".txt");
        Assertions.assertTrue(txtSerializer.getClass().getName().contains("TxtWordDeserializer") );
        IWordDeserializer jsonSerializer = new SerlializationBuilder().initializeSerializer(".json");
        Assertions.assertTrue(jsonSerializer.getClass().getName().contains("JsonWordDeserializer") );

    }

}