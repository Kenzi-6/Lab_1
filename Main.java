package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double b = in.nextInt();
        double z = (Math.sqrt(2 * b + 2 * Math.sqrt(Math.pow(b, 2) - 4))) / (Math.sqrt(Math.pow(b, 2) - 4) + b + 2);
    System.out.print(z);
    in.close();
    }
}
