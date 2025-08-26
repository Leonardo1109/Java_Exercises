package Tareas.T26_Persona;

public class T26_Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leonardo", "Olvera");
        System.out.printf("""
            Nombre: %s    
            Apellido: %s
                """, persona.getNombre(), persona.getApellido());
        persona.setNombre("Valeria");
        System.out.printf("""
            Nombre: %s    
            Apellido: %s
                """, persona.getNombre(), persona.getApellido());
    }
}
