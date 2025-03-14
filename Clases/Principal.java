package Clases;

public class Principal {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Charger", 100);
        System.out.println(auto);
        System.out.printf("%s %s %d\n", auto.getMarca(), auto.getModelo(), auto.getVelocidad());
        auto.acelerar(50);
        auto.setModelo("Charger 68");
        System.out.printf("%s %s %d\n", auto.getMarca(), auto.getModelo(), auto.getVelocidad());
        
        // Velocidad sin encapsulación
        auto.velocidad = 30;
        System.out.printf("%s %s %d\n", auto.getMarca(), auto.getModelo(), auto.getVelocidad());

        AutoModificada auto2 = new AutoModificada("Chevrolet", "Camaro", 70);
        // imposible por encapsulación
        // auto2.velocidad = 40;

        auto2.getVelocidad();
        auto2.setVelocidad(300);
        System.out.print("Auto Dos: ");
        System.out.printf("%s %s %d\n", auto2.getMarca(), auto2.getModelo(), auto2.getVelocidad());

    }
}
