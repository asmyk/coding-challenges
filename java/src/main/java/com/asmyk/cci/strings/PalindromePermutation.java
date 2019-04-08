package com.asmyk.cci.strings;

import java.util.HashMap;
import java.util.Map;

// Cracking Codding Interview
public class PalindromePermutation {
    public static Boolean isPalindromePermutation(String s) {
        Boolean allowOddNumber = s.length() % 2 == 0;
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s.charAt(i))) {
                letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
            } else {
                letters.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            Integer val = entry.getValue();
            if (val % 2 != 0) {
                if (allowOddNumber) {
                    allowOddNumber = false;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}