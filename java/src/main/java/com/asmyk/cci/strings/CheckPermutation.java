package com.asmyk.cci.strings;

import java.util.HashMap; 
import java.util.Map;
import java.util.Set;

// Cracking Codding Interview
public class CheckPermutation {
    public static Boolean checkPermutations(String str1, String str2) {
        HashMap<String, Integer> charCounter = new HashMap<>();
        HashMap<String, Integer> charCounter2 = new HashMap<>();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            String c = Character.toString(str1.charAt(i));
            if (charCounter.containsKey(c)) {
                charCounter.put(c, charCounter.get(c) + 1);
            } else {
                charCounter.put(c, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            String c = Character.toString(str2.charAt(i));
            if (charCounter2.containsKey(c)) {
                charCounter2.put(c, charCounter2.get(c) + 1);
            } else {
                charCounter2.put(c, 1);
            }
        }


        // this could be done with one hashmap as well
        Set<Map.Entry<String, Integer>> entries = charCounter.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            if (charCounter2.get(key) != entry.getValue()) {
                return false;
            }
        }

        Set<Map.Entry<String, Integer>> entries2 = charCounter2.entrySet();

        for (Map.Entry<String, Integer> entry : entries2) {
            String key = entry.getKey();
            if (charCounter.get(key) != entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}