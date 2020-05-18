package comercio;

public class ClientePreferencial extends Cliente {

    private double saldo, limite;
    private String domicilio;

    public ClientePreferencial(String nombre, int numero, String telefono) {
        super(nombre, numero, telefono);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString() + "Saldo: " + saldo + ", Límite: " + limite + ", Domicilio: " + domicilio + '}';
    }

}
