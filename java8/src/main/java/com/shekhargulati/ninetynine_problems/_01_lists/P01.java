package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.LinkedList;
import java.util.List;

/**
 * (*) Find the last element of a list.
 * <p>
 * Check P01Test class for test cases related to this problem.
 */
public class P01 {

    public static <T> T last(List<T> elements) {
        if (elements == null) {
            return null;
        }

        int lastIndex = elements.size() - 1;
        return elements.get(lastIndex);
    }

    public static <T> T last(LinkedList<T> elements) {
        if (elements == null) {
            return null;
        }

        return elements.getLast();
    }


    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            return null;
        }

        if (elements.size() == 1) {
            return elements.get(0);
        }

        int lastIndex = elements.size();
        List<T> subList = elements.subList(1, lastIndex);
        return lastRecursive(subList);
    }


}
