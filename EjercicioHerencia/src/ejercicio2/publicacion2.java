package ejercicio2;

import java.util.Scanner;

public class publicacion2 {

    public int numeroDePaginas;
    public float precio;

    /**
     * Metodo dimeNumero
     * @return la cantidad asignada al atributo
     */
    public int dimeNumeroDePaginas() {

        return this.numeroDePaginas;
    }


    /**
     *
     * @param numeroDePaginas metodo que pide una cantidad y la asigna a la variable numeroDePaginas
     */
    public void ponNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas=numeroDePaginas;
    }

    /**
     *
     * @return el precio
     */
    public float dimePrecio() {

        return this.precio;
    }

    /**
     *
     * @param precio metodo que se le asigna una cantidad a la variable precio.
     */
    public void ponPrecio(float precio) {
        this.precio=precio;
    }
}
