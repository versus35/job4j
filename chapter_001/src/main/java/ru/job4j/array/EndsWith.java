package ru.job4j.array;

import java.util.Arrays;

public class EndsWith {
    public static boolean endsWith(char [] world, char [] post){
        boolean result = false;
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < post.length; j++){
                if (world [i] == post [j]) {
                    result = true;
                } else if (world [i] != post [j]){
                    result = false;
                }



            }

        }
        return result;
    }
}
