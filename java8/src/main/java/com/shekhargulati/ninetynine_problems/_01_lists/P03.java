package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Find the Kth element of a list.
 */
public class P03 {

    public static <T> T kth(final List<T> list, final int k) {
        if (list == null || list.size() <= k) {
            throw new NoSuchElementException("Cannot find kth element [" + k + "] from list: " + list);
        }

        return list.get(k);
    }

    public static <T> T kthRecursive(final LinkedList<T> list, final int k) {
        if (list == null || list.isEmpty() || k < 0) {
            throw new NoSuchElementException("Cannot find kth element [" + k + "] from list: " + list);

        } else if (k == 0) {
            return list.getFirst();

        } else {
            List<T> subList = list.subList(1, list.size() - 1);
            LinkedList<T> subLinkedList = new LinkedList<>(subList);
            return kthRecursive(subLinkedList, k - 1);
        }
    }

    public static <T> T kthStream(final List<T> list, final int k) {
        if (list == null || list.size() <= k) {
            throw new NoSuchElementException("Cannot find kth element [" + k + "] from list: " + list);
        }

        return list.stream().skip(k).findFirst().get();
    }

}
