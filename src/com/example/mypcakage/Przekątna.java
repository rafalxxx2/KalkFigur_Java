package com.example.mypcakage;

public class Przekątna extends Kwadrat implements IPrzekatna{

    public Przekątna(double bokA) {
        super(bokA);
    }

    @Override
    public double liczprzekotna() {
        double przekatna;
        przekatna = getBokA()*Math.sqrt(2);
            return przekatna;
    }
}
