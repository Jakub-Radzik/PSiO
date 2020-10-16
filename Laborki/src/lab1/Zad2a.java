package lab1;

public class Zad2a {
    public static void main(String[] args) {
        // zakładamy a!=0 i delta>0
        int a = 2;
        int b = 8;
        int c = 2;

        // sprawdzamy czy a != 0

        if(a==0){
            System.out.println("a=0");
            System.out.println("Jest to równanie liniowe");
        }else{
            int delta = (b*b)-(4*a*c);

            //delta warunki na ilosc pierwiastkow
            if(delta>0){
                System.out.println("x1= "+(-b-Math.sqrt(delta))/(2*a));
                System.out.println("x2= "+(-b+Math.sqrt(delta))/(2*a));
            }else if(delta==0){
                System.out.println("x1= "+(-b/(2*a)));
            }else {
                System.out.println("Brak pierwiastków rzeczywistych");
            }






        }





    }
}
