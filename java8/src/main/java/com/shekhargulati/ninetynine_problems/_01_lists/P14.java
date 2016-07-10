package com.shekhargulati.ninetynine_problems._01_lists;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * (*) Duplicate the elements of a list
 * <pre>
 *          duplicate(Arrays.asList("a", "b", "c", "d"))
 * </pre>
 */
public class P14 {

    public static <T> List<T> duplicate(List<T> list) {
        return list.stream().flatMap(e -> Stream.of(e, e)).collect(Collectors.toList());
    }
}
