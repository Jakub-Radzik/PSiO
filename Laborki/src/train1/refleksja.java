package train1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class refleksja {
    public static void main(String[] args) {

        try {
            Class cl = Class.forName("java.lang.Double");
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+ " ");
            System.out.print(cl);
            if(supercl != null && supercl != Object.class) System.out.print(" EXTENDS "+supercl);
            System.out.println('{');
            System.out.println("//CONSTRUCTORS");
            printConstructors(cl);
            System.out.println("//FIELDS");
            printFields(cl);
            System.out.println("//METHODS");
            printMethods(cl);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c: constructors){
            String name = c.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(name+"(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());

            }
            System.out.print(");");
        }
    }

    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for(Field f : fields){
            String type = f.getType().getName();
            String name = f.getName();
            System.out.println(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(type+" "+name+";");
        }
    }

    public static void printMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();

        for(Method m:methods){
            String retType = m.getReturnType().getName();
            String name = m.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(retType+" (");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.print(");");


        }
    }
}
