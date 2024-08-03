package Cafe;

public abstract class Clas_Cafe {
    protected String nombre;
    protected String tamano;
    protected double precio;

    public Clas_Cafe(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public abstract void preparar();
    public abstract void servir();
}
