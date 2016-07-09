package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

/**
 * <b> (*) Run-length encoding of a list.</b>
 */
public class P10 {

    public static <T> List<SimpleEntry<Integer, T>> encode(List<T> list) {
        List<SimpleEntry<Integer, T>> result = new ArrayList<>();
        List<List<T>> pack = P09.pack(list);
        for (List<T> element : pack) {
            SimpleEntry<Integer, T> entry = new SimpleEntry<>(element.size(), element.get(0));
            result.add(entry);
        }

        return result;
    }
}
