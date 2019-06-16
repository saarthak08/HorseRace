package com.company;

import com.company.model.Bet;
import com.company.model.Position;

import java.util.ArrayList;

public class CheckInput {
    private String[] inputStrings;
    private String input;
    private double stake;
    private int selection;
    public static ArrayList<Bet> betinput = new ArrayList<>();
    public static int[] noofselections= new int[101];

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

    private void divideInput()
    {
        inputStrings=input.split(":");
    }

    private int checkFirstWordForBet(){
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

    private boolean checkProductSelection() {
        boolean a=false;
       if((inputStrings[1].startsWith("p")||inputStrings[1].startsWith("P"))&&inputStrings[1].length()==2){
           for (int i=1;i<=5;i++){
                if(inputStrings[1].charAt(1)==i+48){
                    a=true;
                    return a;
                }
            }
       }
       return a;
    }

    private boolean checkStake(){
        try {
            stake = Double.parseDouble(inputStrings[3]);
            return !(stake < 10);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    private boolean checkSelection(){
        try{
            selection=Integer.parseInt(inputStrings[2]);
            return selection <= 100 & selection > 0;
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

    public void check()
    {
        if(checkSelection()&&checkInputStrings()&&checkProductSelection()&&checkStake()&&inputStrings[4].length()!=0&&checkFirstWordForBet()!=0){
            if(checkFirstWordForBet()==1)
            {
                noofselections[selection]++;
                Bet b=new Bet(inputStrings[1],selection,stake,inputStrings[4]);
                if(noofselections[selection]<=3)
                {
                    b.setLegal(1);
                }
                else
                {
                    b.setLegal(0);
                }
                betinput.add(b);
            }
        }
        else{
            Bet b=new Bet();
            b.setProduct(input);
            b.setLegal(-1);
            betinput.add(b);
            System.out.println("Invalid Input");
        }
    }
}
