package ejercicio1;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.nombreAutor = "Frederick Forsyth";
        miLibro.titulo = "El manifiesto negro";
        miLibro.editorial = "Circulo de lectores";
        miLibro.tipoPortada = "Dura";
        miLibro.numeroDePaginas = 575;
        System.out.println("Nombre: "+miLibro.nombreAutor);
        System.out.println("Título: "+miLibro.titulo);
        System.out.println("Editorial: "+miLibro.editorial);
        System.out.println("Pottada: "+miLibro.tipoPortada);
        System.out.println("Páginas "+miLibro.numeroDePaginas);
    }
}
