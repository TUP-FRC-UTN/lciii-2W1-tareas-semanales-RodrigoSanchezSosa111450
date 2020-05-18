package fabricacanos;

public class Producto {

    private String descripcion;
    private Material[] materiales;

    public Producto(String descripcion, int cantMateriales) {
        this.descripcion = descripcion;
        materiales = new Material[cantMateriales];
    }

    public void agregarMaterial(Material mat) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = mat;
                break;
            }
        }
    }

    public double costoTotal() {
        double sumatoriaMontos = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                sumatoriaMontos += materiales[i].getValorUnitario();
            }
        }
        return sumatoriaMontos;
    }

    public boolean existeMaterial(int codigo) {
        boolean existe = false;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getCodigo() == codigo) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public Material[] materialesMenoresParam(double valorMax) {
        Material[] materialesMenores = new Material[materiales.length];
        int proximaPosicion = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getValorUnitario() < valorMax) {
                materialesMenores[proximaPosicion] = materiales[i];
                proximaPosicion++;
            }
        }
        return materialesMenores;
    }
    
    /*
    public int[] cantidaPorPrecio() {
        int[] cantidadesPorPrecio = new int[4];
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                if (materiales[i].getValorUnitario() > 0 && materiales[i].getValorUnitario() <= 10) {
                    cantidadesPorPrecio[0]++;
                } else if (materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20) {
                    cantidadesPorPrecio[1]++;
                } else if (materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30) {
                    cantidadesPorPrecio[2]++;
                } else {
                    cantidadesPorPrecio[3]++;
                }
            }
        }
        return cantidadesPorPrecio;
    }*/
    
    public String cantPorPrecio(){
        String cantPorPrecio;        
        int[] cantidadesPorPrecio = new int[4];
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                if (materiales[i].getValorUnitario() > 0 && materiales[i].getValorUnitario() <= 10) {
                    cantidadesPorPrecio[0]++;
                } else if (materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20) {
                    cantidadesPorPrecio[1]++;
                } else if (materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30) {
                    cantidadesPorPrecio[2]++;
                } else {
                    cantidadesPorPrecio[3]++;
                }
            }
        }
        
        cantPorPrecio = "Entre $0 y $10: " + cantidadesPorPrecio[0] + "\n" + "Entre $10 y $20: " + cantidadesPorPrecio[1] + "\n" +
                        "Entre $20 y $30: " + cantidadesPorPrecio[2] + "\n" + "Mayor a $30: " + cantidadesPorPrecio[3];
        return cantPorPrecio;
    }

    @Override
    public String toString() {
        return "Producto" + descripcion + ", materiales: " + materiales + '}';
    }
    
    

}
