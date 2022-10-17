package ejercicio4;

public class Vehiculo {

    private String colorVehiculo;
    private byte numRuedas;
    private short cilindrada;
    private short potencia;

    public Vehiculo(String colorVehiculo, byte numRuedas, short cilindrada, short potencia) {
        this.colorVehiculo = colorVehiculo;
        this.numRuedas = numRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public Vehiculo(String colorVehiculo, short cilindrada, short potencia){
        this.colorVehiculo = colorVehiculo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public Vehiculo(){

    }
    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(byte numRuedas) {
        this.numRuedas = numRuedas;
    }

    public short getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(short cilindrada) {
        this.cilindrada = cilindrada;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(short potencia) {
        this.potencia = potencia;
    }
}
