package lab.list2;

public class Zad2 {

    public static int silnia(int x) throws ArithmeticException{
        if(x<0){
            throw new ArithmeticException("Liczba ujemna");
        }
        if(x==0 || x==1){
            return 1;
        }else{
            return x*silnia(x-1);
        }
    }

    public static void main(String[] args) throws Exception{

        int a = 5;

        try{
            System.out.println(silnia(a));
        }
        catch (ArithmeticException e) {
            System.out.println("liczba musi byc wieksza lub równa 0");
        }

    }
}
