package ejercicio3;

public class PruebaPeriodico3 {
    public static void main(String[] args) {
        Periodico3 p1 = new Periodico3();
        Periodico3 p2 = new Periodico3("El Mundo","25/09/2012");
        Periodico3 p3 = new Periodico3(64,0.9f);
        Periodico3 p4 = new Periodico3("El Pais","27/09/2012",45,0.9f);

        System.out.print(p1.dimeNombre()+","+p1.dimeFecha()+","+p1.dimeNumeroDePaginas()+","+p1.dimePrecio()+"\n");
        System.out.print(p2.dimeNombre()+","+p2.dimeFecha()+","+p2.dimeNumeroDePaginas()+","+p2.dimePrecio()+"\n");
        System.out.print(p3.dimeNombre()+","+p3.dimeFecha()+","+p3.dimeNumeroDePaginas()+","+p3.dimePrecio()+"\n");
        System.out.print(p4.dimeNombre()+","+p4.dimeFecha()+","+p4.dimeNumeroDePaginas()+","+p4.dimePrecio()+"\n");


    }
}
