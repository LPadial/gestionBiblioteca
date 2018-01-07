package GestiónBiblioteca;

import java.io.Serializable;

public class Empleado implements InterfaceEmpleado, Serializable {

    private String nombre;
    private String contrasena;


    public Empleado(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contrasena;
    }

   

    @Override
    public String informacionEmpleado() {
        return this.nombre;
    }
}
