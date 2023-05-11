package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                int innNum = num;
                while (true) {
                    if (innNum % 2 != 0) {
                        result.add(innNum);
                        break;
                    }
                    result.add(innNum);
                    innNum = innNum / 2;
                }
            } else {
                result.add(num);
                result.add(num * 2);
            }
        }
        return result;
    }
}
