package com.asmyk.cci.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Marko Bekhta
 */
public class PalindromePermutationTest {
    @Test
    public void isPermutation() throws Exception {
        assertEquals(true, CheckPermutation.checkPermutations("abc", "bca"));
        assertEquals(true, CheckPermutation.checkPermutations("abc", "acb"));
        assertEquals(true, CheckPermutation.checkPermutations("aaa", "aaa"));
        assertEquals(true, CheckPermutation.checkPermutations("a", "a"));
        assertEquals(true, CheckPermutation.checkPermutations("qazwsxedc", "cdexswzaq"));
    }

    @Test
    public void isNotPermutation() {
        assertEquals(false, CheckPermutation.checkPermutations("bba", "aba"));
        assertEquals(false, CheckPermutation.checkPermutations("abc", "bdca"));
        assertEquals(false, CheckPermutation.checkPermutations("abc", "bdb"));
        assertEquals(false, CheckPermutation.checkPermutations("abc", ""));
        assertEquals(false, CheckPermutation.checkPermutations("", "a"));
        assertEquals(false, CheckPermutation.checkPermutations("abc", "aba"));
    }

}