package com.company;

import com.company.model.Bet;
import com.company.model.Position;

import java.util.ArrayList;

public class CheckInput {
    private String[] inputStrings;
    private String input;
    private ArrayList<Bet> betinput = new ArrayList<>();

    public CheckInput(String input) {
        this.input = input;
        divideInput();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
        divideInput();
    }

    public void divideInput()
    {
        inputStrings=input.split(":");
    }

    public int checkFirstWordForBet(){
        if(inputStrings[0].equalsIgnoreCase("Bet")){
            return 1;
        }
        else if(inputStrings[0].equalsIgnoreCase("Commission")){
            return 2;
        }
        else if(inputStrings[0].equalsIgnoreCase("Result")){
            return 3;
        }
        else{
            return 0;
        }
    }

    public boolean checkProductSelection() {
        boolean a=false;
       if((inputStrings[1].startsWith("p")||inputStrings[1].startsWith("P"))&&inputStrings[1].length()==2){
            for (int i=1;i<=5;i++){
                if(inputStrings[1].charAt(1)=='i'){
                    a=true;
                }
            }
       }
       return a;
    }

    public boolean checkStake(){
        try {
            double x = Double.parseDouble(inputStrings[3]);
            return !(x < 10);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkSelection(){
        try{
            int x=Integer.parseInt(inputStrings[2]);
            return x <= 100 & x > 0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    public boolean checkInputStrings(){
        return inputStrings.length == 5;
    }
}
