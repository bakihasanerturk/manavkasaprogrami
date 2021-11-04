package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat,kg,totalPrice;
        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kg : ");
        kg = input.nextDouble();
        armutFiyat = kg*armutFiyat;

        System.out.print("Elma kg : ");
        kg = input.nextDouble();
        elmaFiyat = kg*elmaFiyat;

        System.out.print("Domates kg : ");
        kg = input.nextDouble();
        domatesFiyat = kg*domatesFiyat;

        System.out.print("Muz kg : ");
        kg = input.nextDouble();
        muzFiyat = kg*muzFiyat;

        System.out.print("Patlıcan kg : ");
        kg = input.nextDouble();
        patlicanFiyat = kg*patlicanFiyat;

        totalPrice = (armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat);

        System.out.println("Toplam Tutar : " + totalPrice + " TL");

    }
}
