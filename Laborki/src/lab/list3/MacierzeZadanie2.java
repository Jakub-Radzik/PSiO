package lab.list3;

import java.util.Random;

public class MacierzeZadanie2 {
    public int size;
    private int[][] matrix1;
    private int[][] matrix2;

    public MacierzeZadanie2(int size, int zakres) {
        this.size = size;
        matrix1 = new int[size][size];
        matrix2 = new int[size][size];

        Random rand = new Random();

        for (int i = 0; i <matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = rand.nextInt(50);
                matrix2[i][j] = rand.nextInt(50);
            }
        }

    }

    //wyswietlanie macierzy (pomocnicze)
    public static void display(int[][] matrix){
        for(int i = 0; i < matrix.length ; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("|");
        }
    }

    public int[][] matrixSum(){

        int[][] sum = new int[size][size];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        return sum;
    }

    public int[][] matrixMultiply(){
        int[][] multiply = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    multiply[i][j]+= matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return multiply;
    }

    public static void main(String[] args) {
        MacierzeZadanie2 matrix = new MacierzeZadanie2(3, 50);
        System.out.println("matrix 1");
        display(matrix.matrix1);
        System.out.println("matrix 2");
        display(matrix.matrix2);
        System.out.println("matrix multiply");
        display(matrix.matrixMultiply());
    }

}
