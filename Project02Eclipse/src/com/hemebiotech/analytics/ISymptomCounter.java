package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public interface ISymptomCounter {
    TreeMap<String, Integer> countSymptoms (List<String> symptoms, TreeSet<String> sortedSymptoms);
}