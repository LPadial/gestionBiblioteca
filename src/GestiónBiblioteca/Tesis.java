/*
 * ATRIBUTOS :
   Programa: Indica el programa de doctorado en el que se adscribe la tesis.
 */
package GestiónBiblioteca;

import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Tesis extends ProyectosTesis{
    
    private String programa;

    //CONSTRUCTOR.
    public Tesis(String programa, String tribunal, String entidad, String departamento, double calificacion, GregorianCalendar fechaLectura, String codigo, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicación, String fotografia, int paginas, boolean coleccion, String materia, String observaciones, String codAutor) {
        super(tribunal, entidad, departamento, calificacion, fechaLectura, codigo, ISBN, titulo, autores, fechaPublicación, fotografia, paginas, coleccion, materia, observaciones, codAutor);
        this.programa = programa;
    }
    
    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
