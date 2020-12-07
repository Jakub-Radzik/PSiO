package list6;

import java.util.List;

public class BubbleSortAsc implements ArraySorting{
    @Override
    public List<Integer> sortArray(List<Integer> list) {
        System.out.println("BUBBLE SORT");
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                    sorted = false;
                }
            }
        }
        return list;
    }
}
