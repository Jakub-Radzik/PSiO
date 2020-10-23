package lab.list2;

public class Zad4 {
    static double E_X_jr(int x, int n){
        double sum = 1;
        int k = 1;

        while (k<=n){
            sum += (Zad1.power(x,k))/(Zad2.silnia(k));
            k++;
        }

        return sum;
    }

    static double Sin_X_jr(int x, int n){
        double sum = x;
        int k = 1;

        while (k<=n){
            if(k%2 == 0){
                sum += (Zad1.power(x,(2*k)+1))/(Zad2.silnia((2*k)+1));
            }
            else{
                sum -= (Zad1.power(x,(2*k)+1))/(Zad2.silnia((2*k)+1));
            }
            k++;
        }

        return sum;
    }

    static double Cos_X_jr(int x, int n){
        double sum = 1;
        int k = 1;

        while (k<=n){
            if(k%2 == 0){
                sum += (Zad1.power(x,2*k))/(Zad2.silnia(2*k));
            }
            else{
                sum -= (Zad1.power(x,2*k))/(Zad2.silnia(2*k));
            }
            k++;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(E_X_jr(2,5));
        System.out.println(Sin_X_jr(2,5));
        System.out.println(Cos_X_jr(2,5));

    }
}
