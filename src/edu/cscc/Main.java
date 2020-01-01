package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

/** Mark Martin
 * This program will prompt the user to input the prices of 10 phones via a "double array".  Once entered, the
 * program will determine the 3 most expensive and 3 least expensive via an array sort and display those prices
 * back to the user.
 */
public class Main {

    public static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int[] prices = new int[10];
        //enter prices
        System.out.print("Enter all 10 smartphone prices: ");
            for (int i=0; i<prices.length; i++) {
                prices[i] = input.nextInt();
        }
        //sort array ascending
        Arrays.sort(prices);

        //display 3 highest
        System.out.println("The 3 most expensive phones: ");
            for (int i=(prices.length - 1); i>6; i--) {
                System.out.println(prices[i]);
            }
        //display 3 lowest
        System.out.println("The 3 least expensive phones: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(prices[i]);
            }
    }
}
