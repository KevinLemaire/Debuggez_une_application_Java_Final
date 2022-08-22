package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeSet;

public interface ISymptomSorter {
    TreeSet<String> sortSymptoms(List<String> symptoms);
}