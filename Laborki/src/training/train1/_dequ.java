package training.train1;

import java.util.ArrayDeque;
import java.util.Deque;

public class _dequ {
    public static void main(String[] args) {

        Deque<String> txt = new ArrayDeque<>();

        for (int i = 0; i <= 40; i++) {
            txt.add(Integer.toString(i));
        }

        int i =0;
        while(!txt.isEmpty()){
            if(i%2==0){
                System.out.println("txt.pollFirst() = " + txt.pollFirst());
            }
            else{
                System.out.println("txt.pollLast() = " + txt.pollLast());
            }
            System.out.println("txt = " + txt);

            
            if(txt.size()==1){
                System.out.println("SIZE = 1 "+ txt);
                System.out.println("txt.peekFirst().equals(txt.peekLast()) = " + txt.peekFirst().equals(txt.peekLast()));

            }
            
            i++;
        }

        System.out.println(txt);
    }
}
