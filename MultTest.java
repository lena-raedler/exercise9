import static org.junit.Assert.*;

import org.junit.Test;

public class MultTest {
	Multprgm mp = new Multprgm();
	@Test
	public void testArray() {
		assertEquals("Failed", mp.array.length, 5);
		
	}
}
