package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public interface ISymptomAnalytics {
    List<String> getSymptoms ();

    TreeSet<String> sortSymptoms(List<String> symptoms);

    TreeMap<String,Integer> countSymptoms (List<String> symptoms, TreeSet<String> sortedSymptoms);

    public void writeSymptom(TreeMap<String,Integer> mappedSymptoms);

}
