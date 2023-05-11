package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result1 = new HashSet<>();
        for (String s : firstSet) {
            if ((secondSet.contains(s) && !thirdSet.contains(s))) {
                result1.add(s);
            }
        }
        for (String s : thirdSet) {
            if (!firstSet.contains(s) && !secondSet.contains(s)) {
                result1.add(s);
            }
        }
        return result1;
    }
}
