package com.junitmaven.examples.junitmavenexample;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenationTest {
	@Test
	public void testConcat()
	{
		Concatenation myconcat = new Concatenation();
		String result =  myconcat.concat("Hello ", "World");
		assertEquals("Hello World", result);
	}
}
