package com.company;

import com.company.model.Bet;
import com.company.model.Position;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static CheckInput checkInput;


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
            s=sc.nextLine();
        }

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