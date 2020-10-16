package lab1;

public class Zad2c {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        System.out.println("Start");
        while(a!=b){
            if (a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        System.out.println(a);
    }
}
