package ejercicio4;

public class Camion extends Vehiculo {

    private byte numeroDeEjes;

    /**
     *
     * @param numeroDeEjes Constructor con el parametro de la clase
     */
    public Camion(byte numeroDeEjes) {

        this.numeroDeEjes = numeroDeEjes;
    }

    /**
     * Constructor con contructor de clase padre que se asignan los parametros correspondientes
     * @param color
     * @param numRuedas
     * @param numeroDeEjes
     * @param cilindrada
     * @param potencia
     */
    public Camion(String color,byte numRuedas,byte numeroDeEjes,short cilindrada,short potencia){
        super(color,numeroDeEjes,cilindrada,potencia);
        this.numeroDeEjes=numeroDeEjes;
    }


    /**
     *
      * @return resultado de numero de ejes;
     */
    public byte getNumeroDeEjes() {
        return numeroDeEjes;
    }

    /**
     *
     * @param numeroDeEjes metodo que se le pasa un parametro y se asigna a la variable numeroDeEjes
     */
    public void setNumeroDeEjes(byte numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }
}
