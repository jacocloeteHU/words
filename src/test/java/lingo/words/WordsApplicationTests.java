package lingo.words;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class WordsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAdd() {
	    assertEquals(42, Integer.sum(19, 23));
	}
	
	@Test
	public void testDivide() {
	    assertThrows(ArithmeticException.class, () -> {
	        Integer.divideUnsigned(42, 0);
	    });
	}

}
