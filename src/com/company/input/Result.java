package com.company.input;

public class Result {
    private double first;
    private double second;
    private double third;
    private double fourth;
    private double fifth;
    private String input;
    private String inputStrings[];

    public Result(String input, String inputStrings[]) {
       this.input=input;
       this.inputStrings=inputStrings;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double getFourth() {
        return fourth;
    }

    public void setFourth(double fourth) {
        this.fourth = fourth;
    }

    public double getFifth() {
        return fifth;
    }

    public void setFifth(double fifth) {
        this.fifth = fifth;
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
