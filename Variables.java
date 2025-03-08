public class Variables {
    /* Java nos permite usar variables asi que crearemos algunas para poder usarlas */

    /* Declaramos las variables */
    public int edad;
    public String nombre;
    public float estatura;
    public boolean activo;

    public static void main(String[] args) {
        Variables persona = new Variables();
        persona.edad = 21;
        persona.nombre = "Leonardo";
        persona.estatura = 1.70f;
        persona.activo = false;
        System.out.printf("%d %s %.2f %b%n", persona.edad, persona.nombre, persona.estatura,
            persona.activo);
    }

}
