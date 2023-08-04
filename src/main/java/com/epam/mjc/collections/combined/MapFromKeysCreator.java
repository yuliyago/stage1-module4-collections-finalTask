package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> finalMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int length = entry.getKey().length();
            Set<String> words = new HashSet<>();
            for (Map.Entry<String, Integer> entry1 : sourceMap.entrySet()) {
                if (length == entry1.getKey().length()) {
                    words.add(entry1.getKey());
                }
            }
            finalMap.put(length, words);
        }
        return finalMap;
    }
}
