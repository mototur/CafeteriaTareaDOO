package Ingredientes;

public class Granos implements Ingredientes {
    private String nombre;
    private String tipo;
    private int cantidad;

    public Granos(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public double ObtenerCantidad() {
        return this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return nombre;
    }
}

