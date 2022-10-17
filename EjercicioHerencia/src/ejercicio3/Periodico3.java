package ejercicio3;



public class Periodico3 extends Publicacion3 {
    private String nombre;
    private String fecha;

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
