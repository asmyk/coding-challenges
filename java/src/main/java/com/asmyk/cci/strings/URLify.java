package com.asmyk.cci.strings;

// Cracking Codding Interview
public class URLify {
    public static String toURL(String input) {
        char[] characters = input.trim().toCharArray();
        String space = "%20";
        String result = input.trim();
        int lastSpaceIndex = 0;

        for (int i = 0; i < characters.length; i++) {
            if (Character.isWhitespace(characters[i])) {
                result = result.substring(0, i + lastSpaceIndex) + space + result.substring(i + lastSpaceIndex + 1);

                lastSpaceIndex += 2;
            }
        }

        return result;
    }
}