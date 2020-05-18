package comercio;

public class Cliente {

    protected String nombre;
    protected int numero;
    protected String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(String nombre, int numero, String telefono) {
        this.nombre = nombre;
        this.numero = numero;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Número: " + numero + ", Teléfono: " + telefono;
    }

}
