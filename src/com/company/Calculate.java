package com.company;

import com.company.model.Commission;

public class Calculate {
    private int commission;
    private int totalnoofbets;
    private double totalamountofbets;

    public Calculate(int commission, int totalnoofbets,double totalamountofbets) {
        this.commission = commission;
        this.totalnoofbets = totalnoofbets;
        this.totalamountofbets=totalamountofbets;
    }


    public double getTotalamountofbets() {
        return totalamountofbets;
    }

    public void setTotalamountofbets(double totalamountofbets) {
        this.totalamountofbets = totalamountofbets;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getTotalnoofbets() {
        return totalnoofbets;
    }

    public void setTotalnoofbets(int totalnoofbets) {
        this.totalnoofbets = totalnoofbets;
    }

    public double calculateOutput()
    {
           return ((totalamountofbets)*(commission/100))/totalnoofbets;
    }
}
