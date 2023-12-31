package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
        if (number < 1) {
            System.out.println("Geçersiz sayı");
        }
        if (number == 1) {
            System.out.println("Asal sayı değildir.");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Asal sayıdır.");
        }
        else {
            System.out.println("Asal sayı değildir.");
        }

    }

}



