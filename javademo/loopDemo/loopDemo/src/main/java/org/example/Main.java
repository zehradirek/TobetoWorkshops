package org.example;

public class Main {
    public static void main(String[] args)
    { // for  döngüsü (en çok kullanılan döngü türüdür.)
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti.");

        //While döngüsü
        int i = 1;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        System.out.println("While döngüsü bitti.");
        //Do-While döngüsü
        int j=2;
        do {
            j++;
            System.out.println(j);
        }
        while(j<10);
        System.out.println("Döngü bitti");

        //Do-While döngüsü daha çok log atmak için kullanılır
        int x=200;
        do{
            System.out.println(x);
            x+=2;
        }while (x<20);
        System.out.println("Do-While Döngüsü bitti");
    }


}

