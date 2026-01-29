package chapter9_set_map.exercise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Bài tập với Set
 * a. Loại bỏ các phần tử trùng lặp
 * Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để loại bỏ các phần tử trùng lặp, sau đó hiển thị danh sách các phần tử duy nhất.
 * b. Tính tổng của các phần tử không trùng lặp
 * Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để tính tổng của các phần tử không trùng lặp trong mảng.
 * <p>
 * c. Tìm các phần tử chung trong hai mảng
 * Viết một chương trình nhận vào hai mảng số nguyên và sử dụng hai Set để tìm các phần tử chung giữa hai mảng.
 * <p>
 * d. Tìm phần tử lớn nhất và nhỏ nhất
 * Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để tìm phần tử lớn nhất và nhỏ nhất trong mảng.
 */
public class Ex1SetPractice {
    static void main() {
        int[] arr = new int[]{1, 2, 7, 3, 4, 5, 3, 5, 2};

        //  a. Loại bỏ các phần tử trùng lặp
        Set<Integer> set = new HashSet<>();

        for (int j : arr) {
            set.add(j);
        }
        System.out.println("Set: " + set);

        //  b. Tính tổng của các phần tử không trùng lặp
        int sum = 0;

        for (int val : set) {
            sum += val;
        }
        System.out.println("Sum of set : " + sum);

        // c. Tìm các phần tử chung trong hai mảng
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) set1.add(i);

        Set<Integer> set2 = new HashSet<>();
        for (int i : arr2) set2.add(i);

        Set<Integer> set3 = new HashSet<>(set1);

        set3.retainAll(set2); // Giữ lại các phần tử có trong set2 (phép giao)

        System.out.println(set3);

        // * d. Tìm phần tử lớn nhất và nhỏ nhất
        int[] arr4 = {1, 4, 2, 6, 5, 7, 3};

        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : arr4) sortedSet.add(num);

        System.out.println("Tree set: " + sortedSet);
        System.out.println("Min: " + sortedSet.first());
        System.out.println("Max: " + sortedSet.last());
    }
}
