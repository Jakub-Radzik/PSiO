package training.sajgon;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.LinkedList;

public class LinkedListss {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        list.addFirst(69);
        list.addLast(2137);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        list.removeLast();
        list.removeLast();
        list.removeFirstOccurrence(3);
        System.out.println(list);
    }
}
