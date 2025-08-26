package Tareas.T24_Clase_Persona;

public class T24_1_Persona {
    String nombre;
    String apellido;

    public T24_1_Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void mostrarPersona() {
        System.out.printf("""
                Nombre: %s
                Apellido: %s
                """, nombre, apellido);
    }

}
