package chapter_1;

import java.util.Scanner;

/**
 * Created by user on 08.04.17.
 */
public class Exersize_3_max {
    static final int COUNT_NUM = 3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите " + COUNT_NUM + " целых числа: ");
        int[] numbers = new int[COUNT_NUM];
        for (int i = 0; i < COUNT_NUM; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Самое большое число: " + Math.max(numbers[0], Math.max(numbers[1], numbers[2])));
    }

}
