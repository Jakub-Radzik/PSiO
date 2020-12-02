package training.GenericPackage;

public class Main {
    public static void main(String[] args) {
        YourTypeClass<Integer> number = new YourTypeClass<>(1);
        YourTypeClass<Double> floatNumber = new YourTypeClass<>(3.5);
        YourTypeClass<String> text = new YourTypeClass<>("one");
        YourTypeClass<Character> sign = new YourTypeClass<>('1');
        YourTypeClass<Boolean> truth = new YourTypeClass<>(true);

        YourTypeClass[] myElements = new YourTypeClass[5];
        myElements[0] = number;
        myElements[1] = floatNumber;
        myElements[2] = text;
        myElements[3] = sign;
        myElements[4] = truth;

        for (int i = 0; i < myElements.length; i++) {
            System.out.println(myElements[i].getThing()+"\t"+myElements[i].getType());
        }

    }
}
