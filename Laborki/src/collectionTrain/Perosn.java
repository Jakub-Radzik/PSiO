package collectionTrain;

class Perosn {
    String name;
    Address adress;

    public Perosn(String name, String city, String street) {
        this.name = name;
        this.adress = new Address(city, street);
    }
}

class Address{
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getInfo(){
        return city.concat(" ").concat(street);
    }


    public void setStreet(String street) {
        this.street = street;
    }
}

class tester{
    public static void main(String[] args) {
        Perosn jakub = new Perosn("Jakub", "Brzezina", "Spacerowa");
        System.out.println(jakub.adress.getInfo());
    }
}