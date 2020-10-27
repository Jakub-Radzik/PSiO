public class Zad4List2 {

    static int silnia = 1;

    public static int approximate(int n, int x){
        int sum = 1;
        for(int k = 1; k <=n; k++) {
            silnia*=k;
            sum += Math.pow(x,k)/silnia;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        System.out.println("e^x = " + approximate(n, x));
    }
}
