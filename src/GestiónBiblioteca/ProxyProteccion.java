package GestiónBiblioteca;

public class ProxyProteccion implements InterfaceEmpleado {

    private EmpleadosBD empleados = new EmpleadosBD();
    private Empleado emp;

    public ProxyProteccion(Empleado emp) {
        this.emp = emp;

    }

    @Override
    public String informacionEmpleado() {
        Empleado empaux = empleados.getEmpleado(emp.getNombre());
        boolean b = (empaux != null) && empaux.getNombre().equals(emp.getNombre()) && empaux.getContraseña().equals(emp.getContraseña());
        return this.emp.toString() + b;
    }
    
    public boolean logueo(){
        Empleado empaux = empleados.getEmpleado(emp.getNombre());
        return (empaux != null) && empaux.getNombre().equals(emp.getNombre()) && empaux.getContraseña().equals(emp.getContraseña());
        
    }
}
