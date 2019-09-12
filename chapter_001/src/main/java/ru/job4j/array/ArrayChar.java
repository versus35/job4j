package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < word.length && i < pref.length; i++) {
            if (pref[i] == word[i]) {
                result = true;
            } else if (pref [i] != word [i]){
                result = false;
            }
        }
        return result;
    }

}