package util;

import java.util.ArrayList;

public class ArrayListUtil {
    public static boolean isEvenArray(ArrayList<Integer> arr) {
        for (int j : arr) {
            if (j % 2 != 0)
                return false;
        }
        return true;
    }
}
