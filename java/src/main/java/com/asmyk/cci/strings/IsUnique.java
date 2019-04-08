package com.asmyk.cci.strings;

import java.util.HashMap;

// Cracking Codding Interview
public class IsUnique {
    public static Boolean isUnique(String str) {
        Boolean result = true;

        HashMap<String, Boolean> letters = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String c = Character.toString(str.charAt(i)).trim();
            if (letters.get(c) == null) {
                if (!"".equals(c)) {
                    letters.put(c, true);
                }
            } else {
                return false;
            }
        }
        return result;
    }
}