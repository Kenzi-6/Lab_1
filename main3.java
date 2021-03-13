package com.company;
import java.util.Scanner; import java.util.Random;

public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(); // начальная позиция улитки
        int B = in.nextInt(); // укажите метры в сантиметрах
        int[] days = new int[31];
        for(int i = 0; i <= 30; i++){
            days[i] = new Random().nextInt(2);
            if (days[i] == 1) {
                A = A + 2;
            } else {
                A = A - 1;
            }
        }
        if (A <= 0) {
            System.out.println("Улитка сползла с дерева");
        }
        if (A >= B){
            System.out.println("Улитка на Эвересте");
        }
        System.out.println(A + " см"); // Улитка находится на такой высоте
        in.close();
        }
    }
