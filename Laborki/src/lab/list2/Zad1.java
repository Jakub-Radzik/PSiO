package lab.list2;

import java.math.BigInteger;
import java.util.Scanner;

public class Zad1 {

    public static BigInteger power(BigInteger x, int k) throws ArithmeticException{

        BigInteger power = new BigInteger("1");

        if(k<0){
            throw new ArithmeticException("Wykładnik musi być większy lub równy 0");
        }

        for (int i = 1; i <= k ; i++) {
            power = power.multiply(x);
        }

        return power;
    }

    public static double power(int x, int k) throws ArithmeticException{
        int power = 1;

        if(k<0){
            throw new ArithmeticException("Wykładnik musi być większy lub równy 0");
        }
        for (int i = 1; i <= k ; i++) {
            power*=x;
        }

        return power;
    }

    public static void main(String[] args) {

        BigInteger x = new BigInteger("2");

        try{
            System.out.println(power(x,500));
        }
        catch (ArithmeticException e){
            System.out.println("Wykładnik musi być większy lub równy 0");
        }
    }
}
