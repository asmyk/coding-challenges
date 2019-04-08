package com.asmyk;

import java.util.ArrayList;
import java.util.HashMap;

// https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times/java
public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> occurenciesCounter = new HashMap<Integer, Integer>();
        ArrayList<Integer> filteredList = new ArrayList<Integer>();

        for (int item : elements) {
            final Integer occurencies = occurenciesCounter.getOrDefault(item, 0);
            occurenciesCounter.put(item, occurencies + 1);

            if (occurencies < maxOccurrences) {
                filteredList.add(item);
            }
        }
        return filteredList.stream().mapToInt(i -> (int) i).toArray();
    }
}