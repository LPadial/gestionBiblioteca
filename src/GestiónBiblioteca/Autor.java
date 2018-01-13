package GestiónBiblioteca;

import java.io.Serializable;

public class Autor implements Serializable {

    protected String nombre;
    protected String fecha;
    protected int publicaciones;
    protected boolean activo;
    protected String codigo;

    //CONSTRUCTOR:
    public Autor(String nombre, String codigo, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.activo = true;
        this.codigo = codigo;
    }

    public void desactivar() {
        this.activo = false;
    }

    public void activar() {
        this.activo = true;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getFecha() {
        return this.fecha;
    }

    public int getPublicaciones() {
        return this.publicaciones;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public String getCodigo() {
        return this.codigo;
    }
    
    public void aumentarPublicaciones(){
        this.publicaciones++;
    }
}
