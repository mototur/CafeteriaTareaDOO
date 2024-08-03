package gt.edu.miumg.TareaC;

public class Empleado extends Sucursal{

    private String nombre;
    private String puesto;
    private double salario;


    public void Trabajar(){
        System.out.println("El empleado "+ nombre + " Esta Trabajando");
    }

    public void TomarOrden(){
        System.out.println("Tomando Orden");
    }



}
