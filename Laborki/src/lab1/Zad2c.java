package lab1;

public class Zad2c {
    public static void main(String[] args) {
        int a = 36;
        int b = 24;

        String txt = "NWD("+a+","+b+") = ";

        while(a!=b){
            if (a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }

        System.out.println(txt+a);
    }
}
