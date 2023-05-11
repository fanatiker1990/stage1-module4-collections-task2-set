package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (Integer num : sourceList) {
            integerTreeSet.add(num * num);
        }
        NavigableSet<Integer> set = integerTreeSet;
        set = set.subSet(lowerBound, true, upperBound, true);
        return set;
    }


}
