package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    double P = (1 - 1.0 / 2);
    for (int i = 2; i <= n; i++) {
        P *= (1 - 1.0 / (2 * i));
    }
    System.out.print(P);
    in.close();
    }
}
