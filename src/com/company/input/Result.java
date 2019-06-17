package com.company.input;

public class Result {
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;
    private String input;
    private String inputStrings[];

    public Result(String input, String inputStrings[]) {
       this.input=input;
       this.inputStrings=inputStrings;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFifth() {
        return fifth;
    }

    public void setFifth(int fifth) {
        this.fifth = fifth;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String[] getInputStrings() {
        return inputStrings;
    }

    public void setInputStrings(String[] inputStrings) {
        this.inputStrings = inputStrings;
    }

    private boolean checkTotalInputStrings(){
        return inputStrings.length==6;
    }

    private boolean setResultsFromString()
    {
        try{
            first=Integer.parseInt(inputStrings[1]);
            second=Integer.parseInt(inputStrings[2]);
            third=Integer.parseInt(inputStrings[3]);
            fourth=Integer.parseInt(inputStrings[4]);
            fifth=Integer.parseInt(inputStrings[5]);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    private boolean checkEachResult()
    {
        return (first <= 100 && first > 0) && (second <= 100 && second > 0) && (third <= 100 && third > 0) && (fourth <= 100 && fourth > 0) && (fifth <= 100 && fifth > 0);
    }

    public boolean checkResult()
    {
        try{
            return setResultsFromString() && checkTotalInputStrings() && checkEachResult();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
