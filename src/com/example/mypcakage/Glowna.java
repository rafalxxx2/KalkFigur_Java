package com.example.mypcakage;

import java.util.Scanner;

public class Glowna {
    private double wartoscA;
    private double wartoscB;
   // Scanner scanner = new Scanner(System.in);


    public Glowna() {

    }

    public double getWartoscA() {
        return wartoscA;
    }

    public void setWartoscA(double wartoscA) {
        this.wartoscA = wartoscA;
    }

    Scanner scanner = new Scanner(System.in);

    public double getWartoscB() {
        return wartoscB;
    }

    public void setWartoscB(double wartoscB) {
        this.wartoscB = wartoscB;
    }

    public double argumentA(){
        wartoscA = scanner.nextDouble();
            return wartoscA;
    }

    public double argumentB(){
        wartoscB = scanner.nextDouble();
        return wartoscB;
    }
}
