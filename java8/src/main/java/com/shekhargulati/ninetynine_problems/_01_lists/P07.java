package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <b>(**) Flatten a nested list structure</b>
 * <p>
 * Transform a list, possibly holding lists as elements into a 'flat' list by replacing each list with its elements (recursively).
 * </p>
 */
public class P07 {

    public static <T> List<T> flatten(List<?> list, Class<T> elementType) {
        if (list == null) {
            return null;
        }

        List<T> result = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof List) {
                List o1 = (List) o;
                List<T> flatten = flatten(o1, elementType);
                result.addAll(flatten);

            } else {
                T element = elementType.cast(o);
                result.add(element);
            }
        }

        return result;
    }

    public static <T> List<T> flatten_stream(List<?> list, Class<T> elementType) {
        if (list == null) {
            return null;
        }

        return list.stream()
                .flatMap(e -> {
                    if (e instanceof List) {
                        List o = (List) e;
                        return flatten_stream(o, elementType).stream();
                    } else {
                        return Stream.of(e);
                    }
                }).map(o -> elementType.cast(o))
                .collect(Collectors.toList());
    }
}
