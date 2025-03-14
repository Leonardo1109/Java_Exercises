package Clases;

public class AutoModificada {
    private String marca;   
    private String modelo;
    private int velocidad;

    public AutoModificada(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        if (velocidad < 0) {
            System.out.println("La velocidad no debe ser negativa");
        } else {
            this.velocidad = velocidad;
        }
    }

    public void acelerar(int cantidad) {
        if (cantidad > 0) {
            velocidad += cantidad;
        }else {
            System.out.println("La aceleracion debe ser positiva");
        }
    }

    public void frenar (int cantidad) {
        if (cantidad > 0) {
            if (velocidad > 0) {
                if (velocidad > cantidad) {
                    velocidad -= cantidad;
                } else {
                    velocidad = 0;
                }
            } else {
                System.out.println("La velocidad es 0");
            }      
        } else {
            System.out.println("La desaceleracion debe ser un valor positivo");
        }
    }
}
