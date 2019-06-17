package com.company.model;

import com.company.input.Result;

import java.util.ArrayList;

public class Output {
    private ArrayList<Bet> totalbets;
    private ArrayList<Bet>[] groupedBets;
    private double[] outputStake;
    private int[] result;


    public Output(ArrayList<Bet> totalbets, ArrayList<Bet>[] groupedBets, double[] outputStake, int result[]) {
        this.totalbets = totalbets;
        this.groupedBets = groupedBets;
        this.outputStake=outputStake;
        this.result=result;
        showOutput();
    }

    public ArrayList<Bet> getTotalbets() {
        return totalbets;
    }

    public void setTotalbets(ArrayList<Bet> totalbets) {
        this.totalbets = totalbets;
    }

    public ArrayList<Bet>[] getGroupedBets() {
        return groupedBets;
    }

    public void setGroupedBets(ArrayList<Bet>[] groupedBets) {
        this.groupedBets = groupedBets;
    }

    public void showOutput()
    {
        for(Bet b:totalbets){
            if(b.getLegal()==-1)
            {
                System.out.println(b.getProduct()+"  -- Invalid Input");
            }
            else if(b.getLegal() ==0){
                System.out.println("Bet:"+b.getProduct()+":"+b.getSelection()+":"+b.getStake()+":"+b.getName()+"  -- Ineligible");
            }
            else if(b.getLegal()==1)
            {
                for(int i=1;i<=5;i++){
                    for(int j=0; j<groupedBets[i].size();j++){
                        Bet x=groupedBets[i].get(j);
                        if (x.getName().equals(b.getName()) && x.getStake() == b.getStake() && x.getSelection() == b.getSelection() && x.getProduct().equals(b.getProduct()))
                        {
                            if(b.getSelection()==result[i-1]) {
                                System.out.println("Bet:" + b.getProduct() + ":" + b.getSelection() + ":" + b.getStake() + ":" + b.getName() + " -- Winner! Resultant Amount: " + outputStake[i - 1]);
                            }
                            else{
                                System.out.println("Bet:" + b.getProduct() + ":" + b.getSelection() + ":" + b.getStake() + ":" + b.getName()+ " -- Lost");
                            }
                        }
                    }
                }
            }
        }
    }
}
