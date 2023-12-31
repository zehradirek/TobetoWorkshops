package org.example;

public class Main {
    public static void main(String[] args) {

        //en küçük arkadaş sayılar 220-284 tür.220nin bölenlerinin tolamı 284tür
        //284 ün bölenlerinin toplamı da 220 ye eşittir.
        // kendileri hariç bölenlerinin toplamı birbirlerine eşittir.

        int number1 = 220;
        int number2 = 284;
        int total1= 0;
        int total2=0;

        for (int i = 1;i<number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
            for (int i=1;i<number2; i++) {
                if(number2 % i==0){
                    total2 = total2+ i;
                }
                 }
        if (total1==number2 && total2==number1){
            System.out.println("Bu iki sayı arkadaştır.");
        } else {System.out.println("Bu iki sayı arakaş değildir.");}

    }
}