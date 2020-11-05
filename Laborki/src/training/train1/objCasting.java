package training.train1;




public class objCasting {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jakub", 2000);
        Employee b1 = new Boss("Andrzej", 15000,5000);

        //ClassCastException
        //Boss b2_cast = (Boss) e1;
        System.out.println(e1.toString());
        System.out.println(b1.toString());

        Boss b2_cast = (Boss) e1;
        System.out.println(b2_cast.toString());
        System.out.println(e1.toString());




    }
}


class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}

class Boss extends Employee{
    private int bonus;

    public Boss(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(int bonus){
        this.bonus = getSalary()+bonus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Boss{");
        sb.append("bonus=").append(bonus);
        sb.append("name=").append(getName());
        sb.append("salary=").append(getSalary());
        sb.append('}');
        return sb.toString();
    }
}