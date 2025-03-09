package Clases;

public class Principal {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Charger", 100);
        System.out.println(auto);
        System.out.printf("%s %s %d\n", auto.getMarca(), auto.getModelo(), auto.getVelocidad());
        auto.acelerar(50);
        auto.setModelo("Charger 68");
        System.out.printf("%s %s %d\n", auto.getMarca(), auto.getModelo(), auto.getVelocidad());
    }
}
