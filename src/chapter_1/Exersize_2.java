package chapter_1;

import java.util.Scanner;

/**
 * Created by user on 08.04.17.
 */
public class Exersize_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое значение угла: ");
        int angle = input.nextInt();
        int normalizeAngleRemainder = ((angle % 360) + 360) % 360;
        int normalizeAngleFloorMod = Math.floorMod(angle, 360);
        System.out.println("Угол нормализованный с помощью остатка: " + normalizeAngleRemainder);
        System.out.println("Угол нормализованный с помощью floorMod: " + normalizeAngleFloorMod);
    }
}
