package lab1;

public class Zad2a {
    public static void main(String[] args) {
        // zakładamy a!=0 i delta>0
        int a = 1;
        int b = 3;
        int c = 2;

        int delta = (b*b)-(4*a*c);

        int x1 = (int) ((-b-Math.sqrt(delta))/(2*a));
        int x2 = (int) ((-b+Math.sqrt(delta))/(2*a));

        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);


    }
}
