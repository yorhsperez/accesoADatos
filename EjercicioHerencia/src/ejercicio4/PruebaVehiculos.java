package ejercicio4;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Motocicleta MotoBarata1 = new Motocicleta("Rojo",(short)125,(short)25);
        Motocicleta MotoBarata2 = new Motocicleta("Rojo",(short)125,(short)25);
        Motocicleta MotoCara = new Motocicleta("Amarillo",(short)1000,(short)90);
        Camion CamionNormal = new Camion("Rojo",(byte)4, (byte)2,(short)4000,(short)300);
        Camion CamionEnorme = new Camion("Rojo",(byte)24, (byte)6,(short)15000,(short)800);

        MotoBarata1.setNumeroDePlazas((byte)1);
        System.out.println(MotoBarata1.getNumeroDePlazas());
        System.out.println(MotoBarata2.getCilindrada());
        System.out.println(CamionEnorme.getNumeroDeEjes());
    }
}
