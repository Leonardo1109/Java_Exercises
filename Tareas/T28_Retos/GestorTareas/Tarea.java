package Tareas.T28_Retos.GestorTareas;

public class Tarea {
    String asunto;
    String descripcion;
    boolean completada;
    int diaInicio;
    int mesInicio;
    int anioInicio;
    int diaFin;
    int mesFin;
    int anioFin;

    public Tarea(String asunto, String descripcion, boolean completada, int diaInicio, int mesInicio, int anioInicio,
            int diaFin, int mesFin, int anioFin) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.completada = completada;
        this.diaInicio = diaInicio;
        this.mesInicio = mesInicio;
        this.anioInicio = anioInicio;
        this.diaFin = diaFin;
        this.mesFin = mesFin;
        this.anioFin = anioFin;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public int getDiaFin() {
        return diaFin;
    }

    public int getMesFin() {
        return mesFin;
    }

    public int getAnioFin() {
        return anioFin;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
