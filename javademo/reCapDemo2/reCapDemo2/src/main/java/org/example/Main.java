package org.example;

public class Main {
    public static void main(String[] args) {
        //double[] myList= new double[4];
        //bunun farklı bir yazım şekli de aşağıdaki gibi olabilir
        double[] myList = {1.2, 1.3, 3.4, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("toplam=" + total);
        System.out.println("En büyük sayı=" + max);
    }
}