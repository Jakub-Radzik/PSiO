package train1;

import java.lang.reflect.*;

public class reflectInvoke {
    public static void main(String[] args) throws NoSuchMethodException {

        Method f = Math.class.getMethod("pow", double.class, double.class);
        double from = 1;
        double to = 10;
        int n = 10;

        double dx = (to - from) / (n-1);
        for(double x = from; x<=to ; x+=dx){
            try{
                double y = (Double) f.invoke(null, x,2);
                System.out.printf("%10.4f --- %10.4f%n",x,y);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
