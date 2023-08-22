package WorkShop2;

public class Yate extends Embarcaciones {

    private int camarotes;

    public Yate(double precioBase, double valorAdicional, int ahoFrabicacion, double eslora, Capitan capitan, int camarotes) {
        super(precioBase, valorAdicional, ahoFrabicacion, eslora, capitan);
        this.camarotes = camarotes;

    }

    public boolean Comprar() {

        return true;
    }

    public boolean esLujoso() {

        return camarotes > 7;
    }

    public boolean noEsLujoso() {
        if (camarotes < 7) {
            return true;
        } else {
        return false;
        }
    }



}


