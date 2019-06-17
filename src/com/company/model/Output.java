package com.company.model;

import com.company.model.Bet;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Output {
    private ArrayList<Bet> totalbets;
    private ArrayList<Bet>[] groupedBets;
    private double[] outputStake;
    private int[] result;
    FileWriter fw;
    PrintWriter writer;


    public Output(ArrayList<Bet> totalbets, ArrayList<Bet>[] groupedBets, double[] outputStake, int result[]) {
        this.totalbets = totalbets;
        this.groupedBets = groupedBets;
        this.outputStake=outputStake;
        this.result=result;
        try{
            fw=new FileWriter(System.getProperty("user.dir")+"//output.txt");
            writer= new PrintWriter(fw);
            writer.print("");
        }catch(Exception e){e.printStackTrace();}
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

    public void showOutput() {
        try {
            for (Bet b : totalbets) {
                if (b.getLegal() == -1) {
                    fw.write(b.getProduct() + "  -- Invalid Input\n");
                } else if (b.getLegal() == 0) {
                    fw.write("Bet:" + b.getProduct() + ":" + b.getSelection() + ":" + b.getStake() + ":" + b.getName() + "  -- Ineligible\n");
                    System.out.println();
                } else if (b.getLegal() == 1) {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < groupedBets[i].size(); j++) {
                            Bet x = groupedBets[i].get(j);
                            if (x.getName().equals(b.getName()) && x.getStake() == b.getStake() && x.getSelection() == b.getSelection() && x.getProduct().equals(b.getProduct())) {
                                if (b.getSelection() == result[i - 1]) {
                                    fw.write("Bet:" + b.getProduct() + ":" + b.getSelection() + ":" + b.getStake() + ":" + b.getName() + " -- Winner! Resultant Amount: $" + outputStake[i - 1]+"\n");
                                } else {
                                    fw.write("Bet:" + b.getProduct() + ":" + b.getSelection() + ":" + b.getStake() + ":" + b.getName() + " -- Lost\n");
                                }
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Output is generated at "+System.getProperty("user.dir")+"/output.txt");
            writer.close();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
