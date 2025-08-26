package Tareas.T25_Artimetica;

public class T25_1_Aritmetica {
    private double operando1;
    private double operando2;
    
    public T25_1_Aritmetica (double operando1, double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    double sumar() {
        return operando1 + operando2;
    }

    double restar() {
        return operando1 - operando2;
    }

    double multiplicar() {
        return operando1 * operando2;
    }

    double dividir() {
        return operando1 / operando2;
    }
}
