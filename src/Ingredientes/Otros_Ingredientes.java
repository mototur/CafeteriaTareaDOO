package Ingredientes;

public class Otros_Ingredientes implements Ingredientes {
    private String nombre;
    private int cantidad;

    public Otros_Ingredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    @Override
    public String ObtenerNombre() {
        return nombre;
    }

    @Override
    public double ObtenerCantidad() {
        return this.cantidad = cantidad;
    }
}
