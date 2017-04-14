/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_1;

import java.math.BigInteger;

/**
 *
 * @author user
 */
public class Exersize_6 {

    public static void main(String args[]) {
        final int number = 1000;
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial " + number + " is " + result);
    }
}
