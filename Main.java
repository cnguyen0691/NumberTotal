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


    }
}
