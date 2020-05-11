package arreglos;

public class Jugador {

    private String nombre;
    private int posicion, nroCamiseta, pj, porcEstadoFis;

    public Jugador(String nombre, int posicion, int nroCamiseta, int pj, int porcEstadoFis) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.pj = pj;
        this.porcEstadoFis = porcEstadoFis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getPorcEstadoFis() {
        return porcEstadoFis;
    }

    public void setPorcEstadoFis(int porcEstadoFis) {
        this.porcEstadoFis = porcEstadoFis;
    }
    
    

    public String leerPosicion() {
        String txtPosicion;

        switch (posicion) {
            case 1:
                txtPosicion = "Arquero";
                break;
            case 2:
                txtPosicion = "Defensor";
                break;
            case 3:
                txtPosicion = "Mediocampo";
                break;
            case 4:
                txtPosicion = "Delantero";
                break;
            default:
                txtPosicion = "Posicion intexistente";
                break;
        }

        return txtPosicion;
    }

    
    
    @Override
    public String toString() {
        return "Jugador{" + "Nombre: " + nombre + ", Posicion: " + leerPosicion() + ", Camiseta Nº: " +
                nroCamiseta + ", Partidos Jugados: " + pj + ", Estado Fisico: " + porcEstadoFis + '}';
    }

}
