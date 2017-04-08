package chapter_1;

/**
 * Created by user on 08.04.17.
 */

import java.util.Scanner;

public class Exersize_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = input.nextInt();
        System.out.printf("%s%n%o%n%A", Integer.toBinaryString(number), number, (double) number);
    }
}
