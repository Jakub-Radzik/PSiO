package training.sajgon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortowankoTablic implements Comparable<SortowankoTablic>{
    String name;
    int age;

    public SortowankoTablic(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayList<SortowankoTablic> lista = new ArrayList<>();
        lista.add(new SortowankoTablic("Jakub7", 20));
        lista.add(new SortowankoTablic("Jakub1", 203));
        lista.add(new SortowankoTablic("Jakub3", 202));

        AgeComparator komparator = new AgeComparator();
        Collections.sort(lista, komparator);
        lista.forEach(element -> System.out.println(element.name+" "+ element.age));
    }

    @Override
    public int compareTo(SortowankoTablic o) {
        return name.compareTo(o.name);
    }

    static class AgeComparator implements Comparator<SortowankoTablic>{
        @Override
        public int compare(SortowankoTablic o1, SortowankoTablic o2) {
            return o1.name.compareTo(o2.name);
        }
    }

}
