package ejercicio4;

public class Camion extends Vehiculo {

    private byte numeroDeEjes;
    public Camion(byte numeroDeEjes) {

        this.numeroDeEjes = numeroDeEjes;
    }

    public Camion(String color,byte numRuedas,byte numeroDeEjes,short cilindrada,short potencia){
        super(color,numeroDeEjes,cilindrada,potencia);
        this.numeroDeEjes=numeroDeEjes;
    }



    public byte getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(byte numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }
}
