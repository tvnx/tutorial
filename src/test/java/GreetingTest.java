import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GreetingTest {
	@Test
	public void greet() throws Exception {
		// capture stdout
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		// make a greeting
		Greeting g = new Greeting("Hans");
		g.greet();

		// verify that it happened
		assertEquals("Hello, Hans!", out.toString().trim());

		// release it
		System.setOut(null);
	}
}