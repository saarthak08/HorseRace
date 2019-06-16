package com.company.input;

import com.company.model.Bet;

import java.util.ArrayList;

public class SetBetInput {
    public static ArrayList<Bet>[] al = new ArrayList[6];
    Bet b;

    public Bet getB() {
        return b;
    }

    public void setB(Bet b) {
        this.b = b;
    }

    public SetBetInput(){
        for(int i=0;i<=5;i++){
            al[i]=new ArrayList<Bet>();
        }
    }

    public void organizeInput() {
        for (int i = 1; i <= 5; i++) {
            if (b.getProduct().charAt(1) ==i+48){
                al[i].add(b);
            }
        }
    }
}

