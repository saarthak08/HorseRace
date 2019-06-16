package com.company.model;

public class Commission {
    private double first;
    private double second;
    private double third;
    private double fourth;
    private double fifth;
    private double bookieCommision;

    public Commission(double first, double second, double third, double fourth, double fifth,double bookieCommision) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.bookieCommision=bookieCommision;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double getFourth() {
        return fourth;
    }

    public void setFourth(double fourth) {
        this.fourth = fourth;
    }

    public double getFifth() {
        return fifth;
    }

    public void setFifth(double fifth) {
        this.fifth = fifth;
    }

    public static boolean checkCommission(double first, double second, double third, double fourth, double fifth, double bookieCommision){
        return first + second + third + fourth + fifth + bookieCommision == 100;
    }
}
