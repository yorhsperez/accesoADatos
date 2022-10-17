package ejercicio3;

public class Publicacion3 {

    public int numeroDePaginas;
    public float precio;

    /**
     * Constructores para diferentes caos
     */
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
        this.numeroDePaginas = numeroDePaginas;
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

        this.precio = precio;
    }
}
