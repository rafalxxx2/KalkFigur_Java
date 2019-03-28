package com.example.mypcakage;

public class Objetosc extends Kwadrat implements IKwadrat{

    public Objetosc(double bokA) {
        super(bokA);
    }

    @Override
    public String getKwadrat() {
        return super.getKwadrat();
    }



    @Override
    public double policzobjetosc() {
        double objetosc;
            objetosc = liczpole() * getBokA();
                return objetosc;
    }
}
