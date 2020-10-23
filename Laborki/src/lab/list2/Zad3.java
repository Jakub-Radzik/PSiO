package lab.list2;

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

        while (k<=n){
            sum += (Math.pow(x,k))/(silnia(k));
            k++;
        }

        return sum;
    }

    static double Sin_X_jr(int x, int n){
        double sum = x;
        int k = 1;

        while (k<=n){
            if(k%2 == 0){
                sum += (Math.pow(x,(2*k)+1))/(silnia((2*k)+1));
            }
            else{
                sum -= (Math.pow(x,(2*k)+1))/(silnia((2*k)+1));
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
                sum += (Math.pow(x,2*k))/(silnia(2*k));
            }
            else{
                sum -= (Math.pow(x,2*k))/(silnia(2*k));
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
