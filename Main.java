package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: " );
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int w = x+y+z;
        System.out.println("Total: "+ w);

        //Average Score
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();
        int score4 = input.nextInt();
        int score5 = input.nextInt();
        int score6 = input.nextInt();
        int score10 = input.nextInt();
        int score7 = input.nextInt();
        int score8 = input.nextInt();
        int score9 = input.nextInt();
        int AverageScore = (score1+score2+score3+score4+score5+score6+score7+score8+score9+score10)/10;
        System.out.println("Average Score: "+ AverageScore);
    }
}
