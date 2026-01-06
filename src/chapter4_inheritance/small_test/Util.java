package chapter4_inheritance.small_test;

import java.util.Scanner;

public class Util {
    static Scanner input = new Scanner(System.in);

    public static int functionCheck(int n1, int n2) {
        int choice;
        do {
            System.out.println("Nhập số tương ứng với tính năng bạn muốn sử dụng: ");
            choice = input.nextInt();

            if (choice < 1 || choice > 9) {
                System.out.println("----Lựa chọn không khả dụng hiện tại, vui lòng chọn lại");
            }
        } while (choice < n1 || choice > n2);
        return choice;
    }


}
