public class Main {

    public static void main (String [] args){

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        System.out.println("la edad de s2 es :" + s2.getEdad());

        System.out.println("la edad de s1 es :" + s1.getEdad());

        s1.setEdad(17);

        System.out.println("la edad de s2 es :" + s2.getEdad());

        System.out.println("la edad de s1 es :" + s1.getEdad());

    }

}
