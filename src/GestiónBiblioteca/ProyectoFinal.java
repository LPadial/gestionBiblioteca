/*
 * ATRIBUTOS :
   Titulación: Indica la titulación a la que pertenece el proyecto.
 */
package GestiónBiblioteca;

import java.util.GregorianCalendar;

public class ProyectoFinal extends ProyectosTesis {
    
    private String titulacion;

    //CONSTRUCTOR.
    public ProyectoFinal(String titulacion, String tribunal, String entidad, String departamento, double calificacion, GregorianCalendar fechaLectura, String codigo, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicación, String fotografia, int paginas, boolean coleccion, String materia, String observaciones, String codAutor) {
        super(tribunal, entidad, departamento, calificacion, fechaLectura, codigo, ISBN, titulo, autores, fechaPublicación, fotografia, paginas, coleccion, materia, observaciones, codAutor);
        this.titulacion = titulacion;
    }
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

}
