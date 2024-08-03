package Cafe;

public class EspressoItaliano extends Clas_Cafe{

        private int intensidad;

        public EspressoItaliano(String nombre, String tamano, double precio, int intensidad) {
            super(nombre, tamano, precio);
            this.intensidad = intensidad;
        }

        @Override
        public void preparar() {
            System.out.println("Preparando Espresso Italiano: " + nombre);
        }

        @Override
        public void servir() {
            System.out.println("Sirviendo Espresso Italiano: " + nombre);
        }
    }


