/*
 * ATRIBUTOS :
Periodicidad: Se indica si es trimestral, semestral o anual.
Volumen: Número del volumen.
Número: Indica el número de la publicación.
Año Disponible: Se indicara el año desde el cual esta disponible la revista.
Localización: En este apartado se reflejara la ubicación del ejemplar físicamente.
 */
package GestiónBiblioteca;

import java.util.GregorianCalendar;


public class Revista extends Publicación {
    
    private String periodicidad;
    private int volumen;
    private int numeroPublicacion;
    private int añoDisponible;
    private String localizacion;

    //CONSTRUCTOR.
    public Revista(String periodicidad, int volumen, int numeroPublicacion, int añoDisponible, String localizacion, String codigo, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicación, String fotografia, int paginas, boolean coleccion, String materia, String observaciones) {
        super(codigo, ISBN, titulo, autores, fechaPublicación, fotografia, paginas, coleccion, materia, observaciones);
        this.periodicidad = periodicidad;
        this.volumen = volumen;
        this.numeroPublicacion = numeroPublicacion;
        this.añoDisponible = añoDisponible;
        this.localizacion = localizacion;
    }
    
    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }


    public int getAñoDisponible() {
        return añoDisponible;
    }

    public void setAñoDisponible(int añoDisponible) {
        this.añoDisponible = añoDisponible;
    }


    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(int numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }


    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    } 
}
