package com.example.mypcakage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Glowna glowna = new Glowna();





        System.out.println("1.Chcesz policzyć różne wielkosci kwadratu?");
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
                Przekątna przekątna = new Przekątna(glowna.getWartoscA());
                System.out.println("Pole kwadratu = " + kwadrat.liczpole());
                System.out.println("Objetosc kwadratu = " + objetosc.policzobjetosc());
                System.out.println("Pole powierzchni szescianu = " + kwadrat.liczppplaskiej());
                System.out.println("Przekatna boku = " + przekątna.liczprzekotna());

                break;
            case 2:
                System.out.println("Podaj wartosc A ");
                glowna.argumentA();
                System.out.println("Podaj wartosc B ");
                glowna.argumentB();
                System.out.println("Podaj wysokosc H");
                glowna.argumentH();
                Prostokąt prostokąt = new Prostokąt(glowna.getWartoscA(),glowna.getWartoscB(),glowna.getWysH());
                PrzekatnaPros przekatnaPros = new PrzekatnaPros(glowna.getWartoscA(),glowna.getWartoscB(),glowna.getWysH());
                System.out.println("A = " + glowna.getWartoscA() + ", B = " + glowna.getWartoscB() + ", H = " + glowna.getWartoscB());
                System.out.println("Pole prostokąta = " + prostokąt.liczpole());
                System.out.println("Pole objetosci = " + prostokąt.policzobjetosc());
                System.out.println("Pole powierzchni graniastoslupa = " + prostokąt.liczppplaskiej());
                System.out.println("Przekatna bokow = " + przekatnaPros.liczprzekotna());


            break;

        }

    }
}
