package list3;

public class Biblioteka {

    static int silnia(int x){
        if (x<=1){
            return 1;
        }
        else{
            return x*silnia(x-1);
        }

    }

    static double E_X_jr(int x, int n){
        double sum = 1;
        int k = 1;

        while (k<=n && x!=0){
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

    static double Cos_X_jr(double x, int n){
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
}
