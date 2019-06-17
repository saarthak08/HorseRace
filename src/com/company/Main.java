package com.company;

import com.company.input.CheckInput;
import com.company.input.Commission;
import com.company.input.Result;
import com.company.input.SetBetInput;
import com.company.model.Bet;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static CheckInput checkInput;
    private static Calculate calculate;
    public static ArrayList<Bet> betinput = new ArrayList<>();
    public static int[] noofselections= new int[101];
    public static SetBetInput setInput=new SetBetInput();
    public static Commission commission;
    public static Result result;
    public static int flag=0;
    private static double totalamountofbets=0;
    private static double[] output;


    public static void main(String[] args) throws IOException {
        System.out.println("Enter bets & result or press \'0\' to exit:");
        takeInput();

    }

    private static void takeInput() throws IOException {
        System.out.println("Enter the path of the text file for input:");
        String s;
        s=sc.nextLine();
        checkInput=new CheckInput(s);
        while(!s.equals("0"))
        {
            checkInput.setInput(s);
            checkInput.checkFirstWordInInput();
            s=sc.nextLine();
        }
        output=new double[SetBetInput.al.length];
        calculate();
        for(int i=0;i<5;i++)
        {
            System.out.println(output[i]);
        }
    }

    private static void calculate()
    {
        for(Bet b:betinput) {
            totalamountofbets =totalamountofbets+b.getStake();
        }
        calculate = new Calculate(SetBetInput.al[1], commission.getFirst(), result.getFirst(),totalamountofbets);
        output[0]=calculate.calculateOutput();
        calculate=new Calculate(SetBetInput.al[2],commission.getSecond(),result.getSecond(),totalamountofbets);
        output[1]=calculate.calculateOutput();
        calculate=new Calculate(SetBetInput.al[3],commission.getThird(),result.getThird(),totalamountofbets);
        output[2]=calculate.calculateOutput();
        calculate=new Calculate(SetBetInput.al[4],commission.getFourth(),result.getFourth(),totalamountofbets);
        output[3]=calculate.calculateOutput();
        calculate=new Calculate(SetBetInput.al[5],commission.getFifth(),result.getFifth(),totalamountofbets);
        output[4]=calculate.calculateOutput();
    }
}


        /*File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        if (br != null) {
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }*/