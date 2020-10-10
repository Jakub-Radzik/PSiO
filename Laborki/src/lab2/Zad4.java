package lab2;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Wpisz liczbę a:");
        int a = number.nextInt();
        System.out.println("Wpisz liczbę b:");
        int b = number.nextInt();

        double T;

        if(a>=b){T= 2*a + Math.abs(b)-1;}
        else{T = Math.sin(a)-Math.pow(b, 2);}

        System.out.println("T(" + a + "," + b +") = " + T);

    }
}
