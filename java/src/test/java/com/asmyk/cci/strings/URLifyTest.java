package com.asmyk.cci.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class URLifyTest {
    @Test
    public void isUniqueString() throws Exception {
        assertEquals("", URLify.toURL("      "));
        assertEquals("a%20b", URLify.toURL("      a b"));
        assertEquals("Ab%20bc", URLify.toURL("Ab bc"));
        assertEquals("Ab%20bc", URLify.toURL("Ab bc  "));
        assertEquals("Ab%20bc", URLify.toURL("   Ab bc  "));
        assertEquals("Ab%20b%20c", URLify.toURL("Ab b c"));
        assertEquals("A%20b%20%20b%20c", URLify.toURL("A b  b c"));
        assertEquals("Ab%20%20bc", URLify.toURL("Ab  bc"));
    }
}