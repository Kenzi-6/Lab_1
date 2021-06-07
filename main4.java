package com.company;
import java.util.Scanner;

public class main4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int kol = 0;
        for(int i = 0; i < str.length(); i++){
            char sim = str.charAt(i);
            if (sim == ' '){
                kol += 1;
            }
        }
        System.out.println("Количество: " + (kol + 1));
    }
}
