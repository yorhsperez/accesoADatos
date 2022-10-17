package ejercicio4;

public class Motocicleta extends Vehiculo {
    private byte numeroDePlazas;

    /**
     * Contructor con la variable de la clase
     * @param numeroDePlazas
     */
    public Motocicleta(byte numeroDePlazas){
        this.numeroDePlazas=numeroDePlazas;
    }

    /**
     *Constructor con constructor de clase padre que se le asignan los parametros correspondientes.
     * @param color
     * @param cilindrada
     * @param potencia
     */
    public  Motocicleta(String color,short cilindrada,short potencia){
        super(color,cilindrada,potencia);
    }

    /**
     *
     * @return el resultado de numeroDePlazas
     */
    public byte getNumeroDePlazas() {
        return numeroDePlazas;
    }

    /**
     *
     * @param numeroDePlazas metodo que se le pasa un parametro y se asigna a la variable numeroDePlazas
     */
    public void setNumeroDePlazas(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }
}
