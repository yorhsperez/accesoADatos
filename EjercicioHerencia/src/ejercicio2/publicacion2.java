package ejercicio2;

import java.util.Scanner;

public class publicacion2 {

    public int numeroDePaginas;
    public float precio;

    public int dimeNumeroDePaginas() {

        return this.numeroDePaginas;
    }

    public void ponNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas=numeroDePaginas;
    }

    public float dimePrecio() {

        return this.precio;
    }

    public void ponPrecio(float precio) {
        this.precio=precio;
    }
}
