import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;



public class TestCalculator {

	private Calculator calculator;
	
	@Before
	public void init() {
		calculator = new Calculator();
	}
	
	@Test
	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""), 0);
	}
	
	@Test
	public void singleValueReplied() {
		assertEquals(calculator.calculate("1"), 1);
	}

}
