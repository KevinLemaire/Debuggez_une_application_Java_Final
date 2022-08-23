package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class AnalyticsCounter implements ISymptomAnalytics {

    @Override
    public List<String> getSymptoms() {
        ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
        return symptomReader.getSymptoms();
    }

    @Override
    public TreeSet<String> sortSymptoms(List<String> symptoms) {
        ISymptomSorter symptomSorter = new SortSymptomsList();
        return symptomSorter.sortSymptoms(symptoms);
    }

    @Override
    public TreeMap<String, Integer> countSymptoms(List<String> symptoms,
                                                  TreeSet<String> sortedSymptoms) {
        ISymptomCounter symptomCounter = new CountSymptomsList();
        return symptomCounter.countSymptoms(symptoms, sortedSymptoms);
    }

    @Override
    public void writeSymptom(TreeMap<String, Integer> mappedSymptoms) {
        ISymptomWriter symptomWriter = new WriteSymptomsAnalytics("result.out");
        symptomWriter.writeSymptom(mappedSymptoms);
    }
}