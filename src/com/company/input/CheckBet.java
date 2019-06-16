package com.company.input;

import com.company.Main;
import com.company.model.Bet;

public class CheckBet {
    private String[] inputStrings;
    private String input;
    private double stake;
    private int selection;



    public CheckBet(String input,String inputStrings[]) {
        this.input = input;
        this.inputStrings=inputStrings;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
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
            return stake >= 10;
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

    public boolean check()
    {
        if(checkSelection()&&checkInputStrings()&&checkProductSelection()&&checkStake()&&inputStrings[4].length()!=0){
                Main.noofselections[selection]++;
                Bet b=new Bet(inputStrings[1],selection,stake,inputStrings[4]);
                if(Main.noofselections[selection]<=3)
                {
                    Main.setInput.setB(b);
                    Main.setInput.organizeInput();
                    b.setLegal(1);
                }
                else
                {
                    b.setLegal(0);
                }
                Main.betinput.add(b);
                return true;
            }
        else{
            Bet b=new Bet();
            b.setProduct(input);
            b.setLegal(-1);
            Main.betinput.add(b);
            System.out.println("Invalid Input");
            return false;
        }
    }
}
