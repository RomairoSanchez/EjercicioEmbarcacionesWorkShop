package WorkShop2;



public class Main {
    public static void main(String[] args) {

        Capitan capitanVelero = new Capitan("Cristiano", "Ronaldo", 123456);
        Capitan capitanYate = new Capitan("Leonel", "Messi", 654321);


        Velero veleroPiratas = new Velero(300000, 20000, 2023, 5, capitanVelero, 9);
        Yate yateDelCaribe = new Yate (500000, 20000, 2000, 8, capitanYate, 5);


        System.out.println("Monto de alquiler del velero: $" + veleroPiratas.calcularMontoAlquiler());
        System.out.println("Es velero grande: " + veleroPiratas.tamano());


        System.out.println("Monto de alquiler del yate: $" + yateDelCaribe.calcularMontoAlquiler());
        System.out.println("Se puede comprar el yate: " + yateDelCaribe.Comprar());
        System.out.println("Tiene mayor lujo el yate: " + yateDelCaribe.esLujoso());
        System.out.println("Tiene menor lujo el yate: " + yateDelCaribe.noEsLujoso());

    }
}
