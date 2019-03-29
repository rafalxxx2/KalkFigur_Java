package com.example.mypcakage;

public class PrzekatnaPros extends Prostokąt implements IPrzekatna {

    public PrzekatnaPros(double bokA, double bokB, double wysH) {
        super(bokA, bokB, wysH);
    }

    @Override
    public double liczprzekotna() {
        double przekatna;
        przekatna = (Math.pow(getBokA(),2) + Math.pow(getBokB(),2));
        przekatna = Math.sqrt(przekatna);
        return przekatna;
    }
}
