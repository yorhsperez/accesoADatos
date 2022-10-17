package ejercicio2;

public class PruebaPeriodico {
    public static void main(String[] args) {
        Periodico2 miPeriodico = new Periodico2();
        miPeriodico.ponNombre("El quijote");
        miPeriodico.ponPrecio(0.9f);
        miPeriodico.ponNumeroDePaginas(65);
        miPeriodico.ponPrecio(0.9f);

        System.out.println("Nombre: "+miPeriodico.dimeNombre());
        System.out.println("Precio: "+miPeriodico.dimePrecio());
        System.out.println("Numero de Paginas: "+miPeriodico.dimeNumeroDePaginas());
        System.out.println("Precio: "+miPeriodico.dimePrecio());
    }

}
