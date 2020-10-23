package collectionTrain;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class _HashTable {
    public static void main(String[] args) {

//        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
//        hm.put(100, "Avi");
//        hm.put(101, "Davi");
//        hm.put(102, "Avilla");
//        hm.put(103, "Avizo");

//        for(Map.Entry m : hm.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

//        System.out.println(hm);
//        hm.remove(101);
//        System.out.println(hm);
//        System.out.println(hm.getOrDefault(102,"Not found"));
//        System.out.println(hm.getOrDefault(101,"Not found"));

            Hashtable<Integer, Book> map = new Hashtable<>();
            Book b1 = new Book(101, "Let us C", "Jakub", "AAA", 45);
            Book b2 = new Book(102, "Let us CAA", "Jakub d", "AAAa", 445);
            Book b3 = new Book(103, "Let us CAAA", "Jakub c", "AAAs", 435);
            Book b4 = new Book(104, "Let us CB", "Jakub A", "AAAd", 25);

            map.put(1,b1);
            map.put(2,b2);
            map.put(3,b3);
            map.put(4,b4);


        Enumeration<Integer> e1 = map.keys();

//        while (e1.hasMoreElements()){
//            System.out.println(e1.nextElement());
//        }

            for(Enumeration<Book> e = map.elements(); e.hasMoreElements();){
                Book x = e.nextElement();
                System.out.println(x.author +" "+ x.quantity);
            }
            for(Enumeration<Integer> e = map.keys(); e.hasMoreElements();){
                int x = e.nextElement();
                System.out.println(x);
            }


//            for(Map.Entry<Integer,Book> entry : map.entrySet()){
//                System.out.println(entry.hashCode());
//                int key = entry.getKey();
//                Book b = entry.getValue();
////                System.out.println(key+" dets:");
////                System.out.println(b.id+" "+b.name);
//            }


    }
}

class Book{
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
