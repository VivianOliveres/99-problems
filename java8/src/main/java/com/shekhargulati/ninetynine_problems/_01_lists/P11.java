package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>(*) Modified run-length encoding</b>
 * <pre>
 *      encode_modified(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
 * </pre>
 */
public class P11 {

    public static <T> List<Object> encode_modified(List<T> list) {
        List<Object> result = new ArrayList<>();
        List<List<T>> pack = P09.pack(list);
        for (List<T> element : pack) {
            if (element.size() == 1) {
                result.add(element.get(0));

            } else {
                AbstractMap.SimpleEntry<Integer, T> entry = new AbstractMap.SimpleEntry<>(element.size(), element.get(0));
                result.add(entry);
            }
        }

        return result;
    }
}
