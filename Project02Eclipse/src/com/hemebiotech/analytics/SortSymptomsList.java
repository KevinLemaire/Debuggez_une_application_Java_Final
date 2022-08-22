package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeSet;

public class SortSymptomsList implements ISymptomSorter {

    @Override
    public TreeSet<String> sortSymptoms(List<String> symptoms) {
        TreeSet<String> sortedSymptoms = new TreeSet<>();
        sortedSymptoms.addAll(symptoms);
        return sortedSymptoms;
    }
}