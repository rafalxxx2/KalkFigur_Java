package com.example.mypcakage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Glowna glowna = new Glowna();





        System.out.println("1.Chcesz policzyć pole kwadratu?");
        System.out.println("2.Objetosc kwadratu??");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Podaj wartosc A ");
                glowna.argumentA();
                System.out.println(" A = " + glowna. getWartoscA());
                Kwadrat kwadrat = new Kwadrat(glowna.getWartoscA());
                Objetosc objetosc = new Objetosc(glowna.getWartoscA());
                System.out.println("Pole kwadratu = " + kwadrat.liczpole());
                System.out.println("Objetosc kwadratu = " + objetosc.policzobjetosc());

                break;
            case 2:

            break;

        }

    }
}
