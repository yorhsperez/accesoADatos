package ejercicio3;

public class Publicacion3 {

    public int numeroDePaginas;
    public float precio;

    Publicacion3() {
        numeroDePaginas = 0;
        precio = 0f;
    }

    Publicacion3(int numeroDePaginas) {
        this.numeroDePaginas=numeroDePaginas;

    }

    Publicacion3(float precio) {
        this.precio=precio;
    }

    Publicacion3(int numeroDePaginas, float precio) {
        this.numeroDePaginas=numeroDePaginas;
        this.precio=precio;
    }

    Publicacion3(float precio, int numeroDePaginas) {
        this.precio=precio;
        this.numeroDePaginas=numeroDePaginas;
    }

    public int dimeNumeroDePaginas() {

        return this.numeroDePaginas;
    }

    public void ponNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public float dimePrecio() {

        return this.precio;
    }

    public void ponPrecio(float precio) {
        this.precio = precio;
    }
}
