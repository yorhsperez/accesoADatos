package ejercicio3;



public class Periodico3 extends Publicacion3 {
    private String nombre;
    private String fecha;

    /**
     * Constructores para diferentes casos
     */
    Periodico3() {
        super();
        nombre = null;
        fecha = null;
    }
    Periodico3(String nombre, String fecha) {
        this.nombre=nombre;
        this.fecha=fecha;

    }
    Periodico3(int numeroDePaginas, float precio) {
        this.numeroDePaginas=numeroDePaginas;
        this.precio=precio;
    }
    Periodico3(String nombre, String fecha, int numeroDePaginas, float precio) {
        this.nombre=nombre;
        this.fecha=fecha;
        this.numeroDePaginas=numeroDePaginas;
        this.precio=precio;
    }

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
