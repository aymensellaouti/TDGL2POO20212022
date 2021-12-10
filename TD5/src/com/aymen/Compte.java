package com.aymen;

public class Compte {
    private double credit = 0;

    public double getCredit() {
        return credit;
    }

    public void crediter(double x) {
        this.credit += x;
    };
}
