package lab2;

public class Zad2 {
    public static void main(String[] args) {
        int a = 22;
        int b = 32;
        System.out.println("Pole= "+a*b);
        System.out.println("Obwód= "+ 2*(a+b));
        System.out.printf("%s %5.2f","Przekątna= ", Math.sqrt(a*a+b*b)); //5.2f = 5-width of number, 2-decimal part
    }
}
