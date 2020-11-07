package training.sajgon;

public class exept {

    static void dividing(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Nie wolno dzielić przez 0");
        }else{
            System.out.println(a/b);
        }
    }


    public static void main(String[] args) {

//        int a = 2;
//        int b = 0;
//
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println("Dzielenie przez 0");
//        }

        dividing(2,2);
        dividing(2,0);


    }
}
