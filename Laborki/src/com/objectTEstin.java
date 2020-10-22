package com;
/*
* @author Jakub Radzik
* @version 1.0 Oreo
* */
public class objectTEstin {


    public static void main(String[] args) {

        Emp jakub = new Emp(20000);
        System.out.println(jakub.getSalary());
        payRaise(jakub, 10);
        System.out.println(jakub.getSalary());

    }

    /*
     * Podnosi pensję użytkownika
     * @param x objekt Emp
     * @param perc procent o jaki powinna wzrosnąć pensja
     * */
    public static void payRaise(Emp x, int perc){
        x.raise(perc);
    }
}

class Emp{
    private double salary = 0;

    public Emp(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    /*
     * Podnosi pensję użytkownika
     * @param perc procent o jaki powinna wzrosnąć pensja
     * @return kwota po podwyżce
     * */
    public void raise(double perc){
        double raise = salary * perc/100;
        salary+=raise;
    }
}