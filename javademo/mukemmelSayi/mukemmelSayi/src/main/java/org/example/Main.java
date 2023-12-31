package org.example;

import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
       //mükemmel sayı pozitif bölenlerinin toplamı kendisine eşit sayıdır. örn. 6,28
        int number=5;
        int total= 0;
        for (int i=1;i<number;i++){
            if (number % i == 0){
                total=total+i;
            }}
            if (total==number){
                System.out.println("Mükemmel sayıdır.");
            } else{
                System.out.println("Mükemmel sayı değildir.");
            }

    }
}