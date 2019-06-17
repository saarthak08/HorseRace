package com.company;

import com.company.model.Bet;

import java.util.ArrayList;

public class Calculate {
    private double commission;
    private int totalnoofbetsCorrect=0;
    private int result;
    private ArrayList<Bet> betsInput;
    private double totalamountofbets;

    public Calculate(ArrayList<Bet> betsInput ,double commission, int result,double totalamountofbets ) {
        this.commission = commission;
        this.result = result;
        this.betsInput = betsInput;
        this.totalamountofbets=totalamountofbets;
        setTotalnoofbetsCorrect();
    }

    public void setTotalnoofbetsCorrect(){
        for(Bet b:betsInput){
            if(b.getSelection()==result){
                totalnoofbetsCorrect++;
            }
        }
    }
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }


    public double calculateOutput()
    {
           return ((totalamountofbets)*(commission/100))/totalnoofbetsCorrect;
    }
}
