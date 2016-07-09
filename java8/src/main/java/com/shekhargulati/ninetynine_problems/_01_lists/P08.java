package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>(**) Eliminate consecutive duplicates of list elements</b>
 * <p>If a list contains repeated elements they should be replaced with a single copy of the element.
 * The order of the elements should not be changed.</p>
 * <p>
 * <pre>
 *     compress(Arrays.asList(a,a,a,a,b,c,c,a,a,d,e,e,e,e))
 *     [a,b,c,d,e]
 * </pre>
 */
public class P08 {

    public static <T> List<T> compress(List<T> list) {
        List<T> result = new ArrayList<>();
        T lastElement = null;
        for (T element : list) {
            if (lastElement == null) {
                lastElement = element;
                result.add(element);
                continue;
            }

            if (lastElement.equals(element)) {
                continue;
            }

            lastElement = element;
            result.add(element);
        }

        return result;
    }

    public static <T> List<T> compress_Stream(List<T> list) {
        List<T> result = new ArrayList<>();
        list.stream()
                .filter(e -> result.isEmpty() || result.get(result.size() - 1) != e)
                .forEach(e -> result.add(e));
        return result;
    }

}
