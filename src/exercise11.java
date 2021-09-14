/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        System.out.printf("How many euros are you exchanging? ");
        Scanner scanner = new Scanner(System.in);
        String euros = scanner.nextLine();
        int newEuros = Integer.parseInt(euros);

        System.out.printf("What is the exchange rate? ");
        Scanner scanner1 = new Scanner(System.in);
        String exchangerate = scanner1.nextLine();
        double newexchangerate = Double.parseDouble(exchangerate);

        double dollars = (newexchangerate) * newEuros;

        System.out.printf(newEuros + " euros at an exchange rate of " + newexchangerate + "\n$%.2f U.S dollars.",dollars);
    }
}