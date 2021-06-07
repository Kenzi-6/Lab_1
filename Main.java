package com.company;
import java.text.DecimalFormat;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        double Sum = 0;
        double[] mas_el = new double[5];      // массив для элементов диагонали
        double[][] matrix = new double[5][5];
        String[] mas = new String[5];
        for (int i = 0; i < 5; i++) {           // заполнение матрицы рандомными числами
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = Math.round(Math.random() * 10);
            }
        }
        for (int n = 0; n <= 4; n++) {
            System.out.println(Arrays.toString(matrix[n]));     // вывод матрицы в исходном виде
        }
        for (int q = 0; q < 5; q++) {
            double element = matrix[q][q];     // идем по диагонали матрицы
            mas_el[q] = element;       // сохраняем элемент
            Sum += element;         // производим сложение элементов
        }
        System.out.println("Элементы диагонали " + Arrays.toString(mas_el));
        for (int k = 0; k < 5; k++) {
            if (k % 2 == 1) {       // элементы четных строк делим на сумму элементов диагонали
                for (int i = 0; i < 5; i++) {
                    matrix[k][i] = matrix[k][i] / Sum;
                }
            }
        }
        System.out.println("Сумма: " + Sum);
        for (int b = 0; b <= 4; b++) {
            if (b % 2 == 1) {
                for (int i = 0; i < 5; i++){
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String result = decimalFormat.format(matrix[b][i]);
                mas[i] = result;
                }
                System.out.println(Arrays.toString(mas));        // вывод матрицы в преобразованном виде
            }
            else {
                System.out.println(Arrays.toString(matrix[b]));
            }
        }
    }
}