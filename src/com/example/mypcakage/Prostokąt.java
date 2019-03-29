package com.example.mypcakage;

public class Prostokąt extends Kwadrat implements IKwadrat{

        private double bokB;
        private double wysH;
    public Prostokąt(double bokA,double bokB,double wysH) {
        super(bokA);
        this.bokB = bokB;
        this.wysH = wysH;
    }

    public double getBokB() {
        return bokB;
    }

    @Override
    public double getBokA() {
        return super.getBokA();
    }

    @Override
    public double liczpole() {
        double pole;
        pole = super.getBokA() * bokB;
            return pole;
    }

    @Override
    public double policzobjetosc() {
        double objetosc;
            objetosc = this.liczpole()* wysH;
            return objetosc;
    }

    @Override
    public double liczppplaskiej() {
        double pplaskiej;
        pplaskiej = liczpole()*6;
            return pplaskiej;
    }
}
