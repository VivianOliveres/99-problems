package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class P02 {

    public static <T> T secondLast(List<T> list) {
        if (list == null || list.isEmpty() || list.size() == 1) {
            throw new NoSuchElementException("Invalid list : " + list);
        }

        int lastIndex = list.size() - 2;
        return list.get(lastIndex);
    }

    public static <T> T secondLastRecursion(LinkedList<T> list) {
        if (list == null || list.isEmpty() || list.size() == 1) {
            throw new NoSuchElementException("Invalid list : " + list);
        }

        if (list.size() == 2) {
            return list.get(0);
        }

        int lastIndex = list.size();
        List<T> subList = list.subList(1, lastIndex);
        LinkedList<T> subLinkedList = new LinkedList<>(subList);
        return secondLastRecursion(subLinkedList);
    }
}
