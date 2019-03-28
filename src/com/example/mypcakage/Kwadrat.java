package com.example.mypcakage;

public class Kwadrat extends FiguraPlaska {

    private double bokA;
    private String kwadrat = "Kwadrat";

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    public double getBokA() {
        return bokA;
    }

    @Override
    public double liczpole() {
        double pole;
        pole = bokA * bokA;
            return pole;
    }

    public String getKwadrat() {
        return kwadrat;
    }
}
