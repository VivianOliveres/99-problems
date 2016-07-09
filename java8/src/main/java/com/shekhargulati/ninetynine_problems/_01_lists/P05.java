package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Reverse a list
 */
public class P05 {

    public static <T> List<T> reverse(List<T> list) {
        if (list == null) {
            return null;
        }

        Collections.reverse(list);
        return list;
    }

    public static <T> List<T> reverse_foreach(List<T> list) {
        if (list == null) {
            return null;
        }

        List<T> result = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            T element = list.get(i);
            result.add(element);
        }

        return result;
    }

    public static List<Integer> reverse_IntStream(List<Integer> list) {
        return list.stream().collect(() -> new ArrayList<>(), (l, i) -> l.add(0, i), (l1, l2) -> l2.addAll(l1));
    }

    public static <T> List<T> reverse_customStream(ArrayDeque<T> list) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(list.descendingIterator(), Spliterator.ORDERED), false)
                .collect(Collectors.toList());
    }
}

