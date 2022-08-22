package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountSymptomsList implements ISymptomCounter {

    @Override
    public TreeMap<String, Integer> countSymptoms(List<String> symptoms, TreeSet<String> sortedSymptoms) {
        TreeMap<String,Integer> result = new TreeMap<>();
        for (String symptom : sortedSymptoms) result.put(symptom, Collections.frequency(symptoms, symptom));
        return result;
    }
}