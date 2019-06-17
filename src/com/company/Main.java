package com.company;

import com.company.input.CheckInput;
import com.company.model.Commission;
import com.company.model.Result;
import com.company.input.SetBetInput;
import com.company.model.Bet;
import com.company.model.Output;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static CheckInput checkInput;
    private static Calculate calculate;
    public static ArrayList<Bet> betinput = new ArrayList<>();
    public static int[] noofselections = new int[101];
    public static SetBetInput setInput = new SetBetInput();
    public static Commission commission;
    public static Result result;
    public static int flag = 0;
    private static double totalamountofbets = 0;
    private static double[] output;
    private static int resultInInt[] = new int[5];


    public static void main(String[] args) throws IOException {
        getInput(getInputPath());
        output = new double[SetBetInput.al.length];
        setCalculate();
        orderResult();
        Output outputObject = new Output(betinput, SetBetInput.al, output, resultInInt);
        outputObject.showOutput();
    }

    private static void getInput(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st;
        checkInput = new CheckInput();
        if (br != null) {
            while ((st = br.readLine()) != null) {
                checkInput.setInput(st);
                checkInput.checkFirstWordInInput();
            }
        }
    }

    private static void setCalculate() {
        for (Bet b : betinput) {
            totalamountofbets = totalamountofbets + b.getStake();
        }
        calculate = new Calculate(SetBetInput.al[1], commission.getFirst(), result.getFirst(), totalamountofbets);
        output[0] = calculate.calculateOutput();
        calculate = new Calculate(SetBetInput.al[2], commission.getSecond(), result.getSecond(), totalamountofbets);
        output[1] = calculate.calculateOutput();
        calculate = new Calculate(SetBetInput.al[3], commission.getThird(), result.getThird(), totalamountofbets);
        output[2] = calculate.calculateOutput();
        calculate = new Calculate(SetBetInput.al[4], commission.getFourth(), result.getFourth(), totalamountofbets);
        output[3] = calculate.calculateOutput();
        calculate = new Calculate(SetBetInput.al[5], commission.getFifth(), result.getFifth(), totalamountofbets);
        output[4] = calculate.calculateOutput();
    }

    private static void orderResult() {
        resultInInt[0] = result.getFirst();
        resultInInt[1] = result.getSecond();
        resultInInt[2] = result.getThird();
        resultInInt[3] = result.getFourth();
        resultInInt[4] = result.getFifth();
    }

    private static String getInputPath() {
        while (true) {
            System.out.println("Press \'1\' to enter the path manually of the text file for input.\nPress \'2\' to take input from " + System.getProperty("user.dir") + "/input.txt\nPress \'0\' to exit.");
            String s=sc.nextLine();
                if (s.equals("1")) {
                    System.out.println("Enter the path of the file:");
                    return sc.nextLine();
                } else if (s.equals("2")) {
                    return System.getProperty("user.dir") + "/input.txt";
                } else if (s.equals("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Error! Invalid input! Please try again.");
                }
            }
    }
}

