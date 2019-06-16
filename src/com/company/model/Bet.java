package com.company.model;

public class Bet {
    private String product;
    private int selection;
    private double stake;
    private String name;
    private boolean legal;

    public Bet(String product, int selection, double stake, String name) {
        this.product = product;
        this.selection = selection;
        this.stake = stake;
        this.name=name;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    public double getStake() {
        return stake;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }
}
