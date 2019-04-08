package com.asmyk.cci.strings;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Marko Bekhta
 */
public class isUniqueTest {
	@Test
	public void isUniqueString() throws Exception {
        assertEquals(true, IsUnique.isUnique("abc"));
        assertEquals(false, IsUnique.isUnique("abcc"));
        assertEquals(true, IsUnique.isUnique("a"));
		assertEquals(true, IsUnique.isUnique("a b"));
		assertEquals(false, IsUnique.isUnique("ab ab"));
		assertEquals(true, IsUnique.isUnique("a!b cd ef ?"));
		assertEquals(false, IsUnique.isUnique("a!b cd ef ?e"));
	}

}