package WorkShop2;

public class Velero extends Embarcaciones {
    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional, int ahoFrabicacion, double eslora, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdicional, ahoFrabicacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;

    }


    public String tamano() {
        if (cantidadMastiles < 4) {
            return "Pequeño";
        } else if (cantidadMastiles > 4) {
            return "Grande";
        } else {
            return "Mediano";
        }
    }

}