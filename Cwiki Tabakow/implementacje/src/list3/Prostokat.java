package list3;

public class Prostokat{

    double x1=1;
    double y1=1;
    double x2=20;
    double y2=10;

    public Prostokat(double x1, double y1, double x2, double y2) throws ArithmeticException{
        if(x1 == x2 || y1 == y2) throw new ArithmeticException("Boki muszą mieć dlugosc wiekszą od zera!");
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Prostokat(double x1, double y1) {
        this(x1,y1,3*x1,3*y1);
    }

    public Prostokat() {
        this(1,1,20,10);
    }

    public double pole(){
        return Math.abs(x1-x2)*Math.abs(y1-y2);
    }

    public double obwod(){ return 2*(Math.abs(x1-x2)+Math.abs(y1-y2)); }

    public double przekatna(){ return Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2)); }

    public static void main(String[] args) {

        try{
            Prostokat my = new Prostokat(-5,-5,5,5);

            System.out.println("my.pole() = " + my.pole());
            System.out.println("my.obwod() = " + my.obwod());
            System.out.println("my.przekatna() = " + my.przekatna());

        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

}
