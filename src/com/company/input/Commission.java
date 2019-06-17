package com.company.input;

public class Commission {
    private double first;
    private double second;
    private double third;
    private double fourth;
    private double fifth;
    private double bookieCommision;
    private String input;
    private String[] inputStrings;

    public Commission(String input, String[] inputStrings) {
        this.input=input;
        this.bookieCommision=15;
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

    private boolean setCommissionsFromString()
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
            return false;
        }
    }

    private boolean checkCommissionTotal(){
        return first + second + third + fourth + fifth + bookieCommision == 100;
    }

    public boolean checkCommission(){
        try {
            return setCommissionsFromString() && checkCommissionTotal()&&checkTotalInputStrings();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    private boolean checkTotalInputStrings(){
        return inputStrings.length==6;
    }

}
