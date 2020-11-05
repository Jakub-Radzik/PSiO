package training.Streams_;

interface Sayable{
    public String say(String name);
}

public class LambdaExpr {
    public static void main(String[] args) {
        Sayable s = (name)->{
          return "nothing "+name;
        };

        System.out.println(s.say("Jakub"));
    }
}
