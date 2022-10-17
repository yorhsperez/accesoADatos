package ejercicio4;

public class Motocicleta extends Vehiculo {
    private byte numeroDePlazas;

    public Motocicleta(byte numeroDePlazas){
        this.numeroDePlazas=numeroDePlazas;
    }

    public  Motocicleta(String color,short cilindrada,short potencia){
        super(color,cilindrada,potencia);
    }

    public byte getNumeroDePlazas() {
        return numeroDePlazas;
    }

    public void setNumeroDePlazas(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }
}
