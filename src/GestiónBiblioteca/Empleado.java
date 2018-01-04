package GestiónBiblioteca;

public class Empleado implements InterfaceEmpleado {

    private String id;
    private String contraseña;


    public Empleado(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

   
    public String getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

   

    @Override
    public boolean informacionEmpleado() {
        return true;
       // return this.id ;
    }
}
