package com.company.input;

import com.company.Main;

public class CheckInput {
    private String[] inputStrings;
    private String input;
    private CheckBet bet;

    public CheckInput(){}

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

    public void checkFirstWordInInput(){
        if(inputStrings[0].equalsIgnoreCase("Bet")){
            bet=new CheckBet(input,inputStrings);
            bet.check();
        }
        else if(inputStrings[0].equalsIgnoreCase("Commission")){
            Commission commission=new Commission(input,inputStrings);
            if(commission.checkCommission()){
                Main.commission=commission;
            }

        }
        else if(inputStrings[0].equalsIgnoreCase("Result")){
            Result result=new Result(input,inputStrings);
            if(result.checkResult()){
                Main.result=result;
                Main.flag=1;
            }
        }
    }

}
