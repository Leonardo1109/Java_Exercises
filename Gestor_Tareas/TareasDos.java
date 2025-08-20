package Gestor_Tareas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TareasDos {
    public String tituloTarea;
    public String descripcionTarea;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    
    public TareasDos(String tituloTarea, String descripcionTarea, LocalDate fechaInicio, LocalDate fechaFin) {
        this.tituloTarea = tituloTarea;
        this.descripcionTarea = descripcionTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


}