package com.company.model;

public class Result {
    private double first;
    private double second;
    private double third;
    private double fourth;
    private double fifth;

    public Result(double first, double second, double third, double fourth, double fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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
}
