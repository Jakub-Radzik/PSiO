package training.train1;

import java.util.function.Consumer;

public class _callBacks {
    public static void main(String[] args) {
        hello("Jakub", null, val -> System.out.println("nno last name"));
        hello2("j", null, () -> System.out.println("lol"));
    }



    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }else{
            callback.run();
        }
    }

}
