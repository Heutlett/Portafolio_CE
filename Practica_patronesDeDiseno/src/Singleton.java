public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private int edad;

    private String nombre;

    // El constructor privado no permite que se genere un constructor por defecto.
    // (con mismo modificador de acceso que la definición de la clase)
    private Singleton() {

        edad = 15;
        nombre = "adrian";

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
