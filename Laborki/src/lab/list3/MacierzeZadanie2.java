package lab.list3;

import java.util.Random;

public class MacierzeZadanie2 {
    private int size;
    private int[][] matrix;

    //CONSTRUCTORS's
    public MacierzeZadanie2(int size, int zakres) {
        this.size = size;
        matrix = new int[size][size];

        Random rand = new Random();

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(50);
            }
        }

    }

    public MacierzeZadanie2(int size){
        this(size, size*10);
    }

    public MacierzeZadanie2(){
        this(5, 50);
    }

    //GETTER's
    public int[][] getMatrix() {
        return matrix;
    }
    public int getSize() {
        return size;
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

    //sum of matrixes
    public static int[][] matrixSum(MacierzeZadanie2 matrix1, MacierzeZadanie2 matrix2){
        int size = matrix1.getSize();
        int[][] sum = new int[size][size];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix1.getMatrix()[i][j]+matrix2.getMatrix()[i][j];
            }
        }
        return sum;
    }

    public static int[][] matrixMultiply(MacierzeZadanie2 matrix1, MacierzeZadanie2 matrix2){
        int size = matrix1.getSize();
        int[][] multiply = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    multiply[i][j]+= matrix1.getMatrix()[i][k]*matrix2.getMatrix()[k][j];
                }
            }
        }
        return multiply;
    }

    public static void main(String[] args) {

        int size = 5;

        MacierzeZadanie2 matrix1 = new MacierzeZadanie2(size, 50);
        MacierzeZadanie2 matrix2 = new MacierzeZadanie2(size, 50);

        System.out.println("matrix 1");
        display(matrix1.getMatrix());

        System.out.println("matrix 2");
        display(matrix2.getMatrix());

        System.out.println("matrix addition");
        display(matrixSum(matrix1, matrix2));

        System.out.println("matrix multiply");
        display(matrixMultiply(matrix1, matrix2));
    }

}
