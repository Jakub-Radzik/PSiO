public class Car {
    private int modelYear;
    private int maxSpeed;
    private String modelName;

    public Car(int year, int speed, String name){
        modelYear = year;
        maxSpeed = speed;
        modelName = name;
    }

    public void velocity(int maxSpeed){
        System.out.print("I am fast like: "+ maxSpeed);
    }

    public void info(){
        System.out.println(modelName);
        System.out.println(maxSpeed);
        System.out.println(modelYear);
    }



}
