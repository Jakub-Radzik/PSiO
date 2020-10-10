package lab2;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Podaj bok a: ");
        int a = number.nextInt();
        System.out.println("Podaj bok b: ");
        int b = number.nextInt();
        System.out.println("Podaj bok c: ");
        int c = number.nextInt();

        if(Math.abs(b-c) < a && a < (b+c)){
            int p = (a+b+c)/2;
            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Pole trójkąta wynosi: " + S);
        }else{
            System.out.println("Z podanych boków nie można utworzyć trójkąta");
        }
    }
}
