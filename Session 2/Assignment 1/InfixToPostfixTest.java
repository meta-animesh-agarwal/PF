

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InfixToPostfixTest {

	String infixExpression;
	String postfixExpression;
	InfixToPostfix infixToPostfixObject;
	
	@Before
	public void setUp() throws Exception {
		infixToPostfixObject = new InfixToPostfix();
		infixExpression = "(( a + b ) - c) * d";
		postfixExpression = "ab+c-d*";
	}

	@Test
	public void testGetPostfix() {
		assertEquals(postfixExpression, infixToPostfixObject.infixToPostfix(infixExpression) );
	}

}
