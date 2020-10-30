package train1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class goodCopyOf {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        a = (int[])cpOfArr(a,20);
        Arrays.stream(a).forEach(System.out::println);
    }


    public static Object cpOfArr(Object a, int newLength){
        System.out.println(a);
        Class cl = a.getClass();
        if(!cl.isArray()) return null;
        Class componentType = cl.componentType();
        System.out.println("cl = " + cl);
        System.out.println("componentType = " + componentType);
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length, newLength));
        return newArray;
    }

}
