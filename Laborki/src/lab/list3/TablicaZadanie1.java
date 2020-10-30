package lab.list3;

import java.util.Arrays;
import java.util.Random;

public class TablicaZadanie1 {

    public int[] liczby;

    public TablicaZadanie1(int length, int zakres) {
        liczby = new int[length];
        Random rand = new Random();
        for(int i = 0; i < length; i++) {
            liczby[i] = rand.nextInt(zakres);
        }
    }

    // b) wypisywanie w kolejności dodania
    public void wypiszLiczby(){
        displayElements(liczby);
    }

    // c) wypisywanie w odwrotnej kolejności niż kolejności dodania
    public void wypiszLiczbyReversed(){
        System.out.print("[");
        for (int i = liczby.length-1; i >= 0 ; i--) {
            System.out.print(liczby[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // d) podział ciągu na 2 podciągi parzyste i nieparzyste
    public void sortedSubArrays(){
        int c_even = 0;
        int c_odd = 0;
        for(int elem:liczby){
            if(elem%2==0){
                c_even++;
            }else{
                c_odd++;
            }
        }

        int[] even_elements = new int[c_even];
        int[] odd_elements = new int[c_odd];

        c_even = 0;
        c_odd = 0;

        for(int i = 0; i < liczby.length ; i++) {
            if(liczby[i]%2==0){
                even_elements[c_even]=liczby[i];
                c_even++;
            }else{
                odd_elements[c_odd]=liczby[i];
                c_odd++;
            }
        }

        System.out.print("Even array: ");
        displayElements(bubbleSort(even_elements));
        System.out.print("Odd array: ");
        displayElements(bubbleSort(odd_elements));

    }

    //funkcja pomocnicza wyświetlająca dla funkcji b i d
    public void displayElements(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if(i!=tab.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // e) znajdź największy element
    public int findMax(){
        int max = liczby[0];
        for (int i = 1; i < liczby.length ; i++) {
            if (liczby[i]>max){
                max = liczby[i];
            }
        }
        return max;
    }

    // f) znajdź najmniejszy element
    public int findMin(){
        int min = liczby[0];
        for (int i = 1; i < liczby.length ; i++) {
            if (liczby[i]<min){
                min = liczby[i];
            }
        }
        return min;
    }

    //sortowanie tablicy ASC
    public static int[] bubbleSort(int[] tab){
        int i,j,temp,f;
        for (i = 0; i < tab.length - 1; i++){
            for (j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        return tab;

    }


    public static void main(String[] args) {

        int n = 12;
        int k = 100;

//        Scanner in = new Scanner(System.in);
//        System.out.println("n musi być mniejsze od k");
//        while(n>k){
//            System.out.println("Wprowadź n:");
//            n = in.nextInt();
//            System.out.println("Wprowadź k:");
//            k = in.nextInt();
//        }

        TablicaZadanie1 obj = new TablicaZadanie1(n,k);
        obj.wypiszLiczby();
        obj.wypiszLiczbyReversed();
        System.out.println("max: "+obj.findMax());
        System.out.println("min: "+obj.findMin());
        obj.sortedSubArrays();
    }
}
