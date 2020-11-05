package training.train1;


import java.util.ArrayDeque;
import java.util.Deque;

public class test {
    public static void main(String[] args) {

        Deque<Bok> books = new ArrayDeque<Bok>();

        for (int i = 0; i < 20; i++) {
            books.add(new Bok(i,i*10,"Book #".concat(Integer.toString(i))));
        }

        books.forEach(bok -> System.out.println(bok.name+" "+bok.id+" "+bok.quantity));

    }
}

class Bok{
    int id, quantity;
    String name;


    public Bok(int id, int quantity, String name) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }
}