package com.company;


public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        int[][] transpoze = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }

        for(int i = 0 ; i < transpoze.length;i++){
            for(int j = 0 ; j < transpoze[i].length;j++){
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }

    }
}

