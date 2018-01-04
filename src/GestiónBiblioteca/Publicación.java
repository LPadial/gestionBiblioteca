/*
  ATRIBUTOS :
 Código: Código de control interno de la publicación.
ISBN: Es la identificación única para una publicación.
Titulo: Titulo de la publicación.
Autores: Nombre y apellidos de los autores.
Fecha de publicación: La fecha en que fue publicada.
Fotografía: De la caratula de la publicación.
Páginas: Número de páginas.
Colección: Indica si la publicación pertenece a una colección.
  Materia: Indica la materia de la publicación
Observaciones: Texto libre para indicar cualquier dato de interés relativo a la publicación.
 */
package GestiónBiblioteca;

import java.io.IOException;
import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class Publicación implements Serializable{
    
    private String codigoPubli;
    private String ISBN;
    private String titulo;
    private String autor;
    private GregorianCalendar fechaPublicación;
    private String fotografia;
    private int paginas;
    private boolean coleccion;
    private String materia;
    private String observaciones;
    private boolean estado;

   //CONSTRUCTOR.
    public Publicación(String codigoPubli, String ISBN, String titulo, String autor, GregorianCalendar fechaPublicación, String fotografia, int paginas, boolean coleccion, String materia, String observaciones) {
        this.codigoPubli = codigoPubli;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicación = fechaPublicación;
        this.fotografia = fotografia;
        this.paginas = paginas;
        this.coleccion = coleccion;
        this.materia = materia;
        this.observaciones = observaciones;
        
    }
    
     public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    public boolean isColeccion() {
        return coleccion;
    }

    public void setColeccion(boolean coleccion) {
        this.coleccion = coleccion;
    }


    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }


    public GregorianCalendar getFechaPublicación() {
        return fechaPublicación;
    }

    public void setFechaPublicación(GregorianCalendar fechaPublicación) {
        this.fechaPublicación = fechaPublicación;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCodigoPubli() {
        return codigoPubli;
    }

    public void setCodigoPubli(String codigoPubli) {
        this.codigoPubli = codigoPubli;
    }

    @Override
    public String toString() {
        return "Publicación:" + "Código=" + codigoPubli + ", ISBN=" + ISBN + ", Título=" + titulo + ", Autor=" + autor + ", Fecha Publicación" + fechaPublicación + ", Fotografia=" + fotografia + ", Paginas=" + paginas + ", Coleccion=" + coleccion + ", Materia=" + materia + ", Observaciones=" + observaciones + ", Estado=" + estado ;
    }
    
    
      public Prestar PrestarPublicación(Socio socio,GregorianCalendar fechaPrestamo)throws IOException{   
          Prestar prest = new Prestar(this,socio,fechaPrestamo);
          prest.Factura(true);
          return prest;
        }
      public int DevolverPublicación(Prestar vuelta) throws IOException{
          vuelta.Factura(false);
          return vuelta.calcularTardanza();
        }
}
