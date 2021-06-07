package com.company;
import java.util.Arrays;
import java.util.Random;

public class main2 {
    public static void quicksort(int[][] matrix, int low, int high){
        if (low >= high) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            int sered = matrix[i][low + (high - low) / 2];
            int n = low;
            int k = high;
            while (n <= k) {
                while (matrix[i][n] < sered) {
                    n++;
                }
                while (matrix[i][k] > sered) {
                    k--;
                }
                if (n <= k) {
                    int znach = matrix[i][n];
                    matrix[i][n] = matrix[i][k];
                    matrix[i][k] = znach;
                    n++;
                    k--;
                }
                if (low < k) {
                    quicksort(matrix, low, k);
                }
                if (high > n) {
                    quicksort(matrix, n, high);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {           // заполнение матрицы рандомными числами
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = new Random().nextInt(10);
            }
        }
        for (int v = 0; v < 5; v++) {
            System.out.println(Arrays.toString(matrix[v]));
        }
        System.out.println("_____________");
        int low = 0;
        int high = matrix.length - 1;
        quicksort(matrix, low, high);
        for (int v = 0; v < 5; v++) {
            System.out.println(Arrays.toString(matrix[v]));
        }
    }
}