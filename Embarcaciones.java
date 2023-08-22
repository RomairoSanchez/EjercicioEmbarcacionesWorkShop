package WorkShop2;

public class Embarcaciones {
    private double precioBase;
    private double valorAdicional;
    private int ahoDeFabricacion;
    private double eslora;
    private Capitan capitan;


    public Embarcaciones(double precioBase, double valorAdicional, int ahoDeFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.ahoDeFabricacion = ahoDeFabricacion;
        this.eslora = eslora;

                }

    ;

    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (ahoDeFabricacion > 2020) {
            monto += valorAdicional;
        }
        return monto;
    }



}
