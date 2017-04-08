package chapter_1;

import java.util.Scanner;

/**
 * Created by user on 08.04.17.
 */
public class Exersize_3_if {
    static final int COUNT_NUM = 3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите " + COUNT_NUM + " целых числа: ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < COUNT_NUM; i++) {
            int num = input.nextInt();
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Самое большое число: " + max);
    }
}
