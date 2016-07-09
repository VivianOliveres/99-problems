package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.List;

/**
 * Find out whether a list is a palindrome.
 */
public class P06 {

    public static <T> boolean isPalindrome(List<T> list) {
        for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
            T first = list.get(i);
            T second = list.get(j);
            if (first == null && second == null) {
                continue;

            } else if (first == null || second == null || !first.equals(second)) {
                return false;
            }
        }

        return true;
    }

    public static <T> boolean isPalindrome_Reverse(List<T> list) {
        List<T> reversedList = P05.reverse_foreach(list);
        return list.equals(reversedList);
    }

    public static <T> boolean isPalindrome_Stream(List<T> list) {
        return false;
    }

}
