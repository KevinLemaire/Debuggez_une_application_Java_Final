package com.hemebiotech.analytics;

import java.util.TreeMap;
public interface ISymptomWriter {
    void writeSymptom(TreeMap<String, Integer> mappedSymptoms);
}