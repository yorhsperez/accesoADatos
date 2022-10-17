package ejercicio2;

import java.util.Scanner;

public class Periodico2 extends publicacion2 {
    private String nombre;
    private String fecha;


    public String dimeNombre() {


        return this.nombre;
    }

    public void ponNombre(String nombre) {
        this.nombre=nombre;
    }

    public String dimeFecha() {

        return this.fecha;
    }

    public void ponFecha(String fecha) {
        this.fecha=fecha;

    }
}
