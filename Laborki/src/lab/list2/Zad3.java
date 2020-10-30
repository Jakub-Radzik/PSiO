package lab.list2;

import static java.lang.Math.*;

public class Zad3 {

    static int silnia(int x){
        int s = 1;
        for (int i = 1; i <= x ; i++) {
            s*=i;
        }
        return s;
    }

    static double E_X_jr(int x, int n){
        double sum = 1;
        int k = 1;

        while (k<=n && x!=0){
            sum += (pow(x,k))/(silnia(k));
            k++;
        }

        return sum;
    }

    static double Sin_X_jr(int x, int n){
        double sum = x;
        int k = 1;

        while (k<=n){
            if(k%2 == 0){
                sum += (pow(x,(2*k)+1))/(silnia((2*k)+1));
            }
            else{
                sum -= (pow(x,(2*k)+1))/(silnia((2*k)+1));
            }
            k++;
        }

        return sum;
    }

    static double Cos_X_jr(double x, int n){
        double sum = 1;
        int k = 1;

        while (k<=n){
            if(k%2 == 0){
                sum += (pow(x,2*k))/(silnia(2*k));
            }
            else{
                sum -= (pow(x,2*k))/(silnia(2*k));
            }
            k++;
        }
        return sum;
    }

    public static void main(String[] args) {
            int x =2;
        System.out.println("e^x = " + E_X_jr(x,10));
//        System.out.println("Math.exp(x) = " + Math.exp(x));
        System.out.println("sin(x) = " + Sin_X_jr(x,5));
        System.out.println("cos("+x+") = " + Cos_X_jr(x,10));
//        System.out.println("Math.cos("+x+") = " + cos(x));
    }
}
