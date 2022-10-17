package ejercicio2;

import java.util.Scanner;

public class Periodico2 extends publicacion2 {
    //Clase que hereda de publicacion2
    private String nombre;
    private String fecha;


    /**
     *
     * @return el resultado de la variable nombre
     */
    public String dimeNombre() {


        return this.nombre;
    }

    /**
     *
     * @param nombre metodo que se le pasa un string y se asigna a la variable nombre
     */
    public void ponNombre(String nombre) {
        this.nombre=nombre;
    }

    /**
     *
     * @return el resultado de la variable fecha
     */
    public String dimeFecha() {

        return this.fecha;
    }

    /**
     *
     * @param fecha metodo que se le pasa un string y se asigna a la variable fecha.
     */
    public void ponFecha(String fecha) {
        this.fecha=fecha;

    }
}
