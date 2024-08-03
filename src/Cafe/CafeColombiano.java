package Cafe;

public class CafeColombiano extends Clas_Cafe {
    private String tipoGrano;

    public CafeColombiano(String nombre, String tamano, double precio, String tipoGrano) {
        super(nombre, tamano, precio);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Café Colombiano: " + nombre);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Café Colombiano: " + nombre);
    }
}

