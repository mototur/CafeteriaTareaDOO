package gt.edu.miumg.TareaC;

public class Equipo extends Sucursal{
    private String estado;

    public void Encender(){
        estado= "Encendido";
        System.out.println("Equipo: " + estado);
    }

    public void Apagar(){
        estado= "Apagado";
        System.out.println("Equipo: " + estado);
    }

    public void Preparar(){
        estado= "Preparando";
        System.out.println("Equipo: " + estado + "orden!!!");
    }
}
