/*
 * ATRIBUTOS :
− Tribunal: Se indica el tribunal del proyecto.
− Entidad: Nombre del Organismo o Universidad.
− Departamento: Indica el departamento responsable.
− Calificación: Indica la nota sacada.
− Fecha Lectura: Indica la fecha de lectura.
 */
package GestiónBiblioteca;

import java.util.GregorianCalendar;

public abstract class ProyectosTesis extends Publicacion {
    
    private String tribunal;
    private String entidad;
    private String departamento;
    private double calificacion;
    private GregorianCalendar fechaLectura;
    
    //CONSTRUCTOR.
    public ProyectosTesis(String tribunal, String entidad, String departamento, double calificacion, GregorianCalendar fechaLectura, String codigo, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicación, String fotografia, int paginas, boolean coleccion, String materia, String observaciones) {
        super(codigo, ISBN, titulo, autores, fechaPublicación, fotografia, paginas, coleccion, materia, observaciones);
        this.tribunal = tribunal;
        this.entidad = entidad;
        this.departamento = departamento;
        this.calificacion = calificacion;
        this.fechaLectura = fechaLectura;
    }
    

    public GregorianCalendar getFechaLectura() {
        return fechaLectura;
    }

    public void setFechaLectura(GregorianCalendar fechaLectura) {
        this.fechaLectura = fechaLectura;
    }


    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }


    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

}
