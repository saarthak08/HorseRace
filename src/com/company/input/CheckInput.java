package com.company.input;

public class CheckInput {
    private String[] inputStrings;
    private String input;
    private CheckBet bet;
    private Commission commission;
    private Result result;


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
            commission=new Commission(input,inputStrings);
            commission.checkCommission();
        }
        else if(inputStrings[0].equalsIgnoreCase("Result")){
            result=new Result(input,inputStrings);
            result.checkResult();
        }
    }

}
