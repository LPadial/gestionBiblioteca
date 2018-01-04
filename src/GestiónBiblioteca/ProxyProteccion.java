package GestiónBiblioteca;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProxyProteccion implements InterfaceEmpleado {

    private EmpleadosBD empleados = new EmpleadosBD();
    private Empleado emp;

    public ProxyProteccion(Empleado emp) {
        this.emp = emp;

    }

    @Override
    public boolean informacionEmpleado() {
     /*   Empleado empaux = empleados.getEmpleado(emp.getId());
        if ((empaux != null) && empaux.getId().equals(emp.getId()) && empaux.getContraseña().equals(emp.getContraseña())) {
            return empaux.getId();
        } else {
            return "mal";
        }*/
        Empleado empaux = empleados.getEmpleado(emp.getId());
        return (empaux != null) && empaux.getId().equals(emp.getId()) && empaux.getContraseña().equals(emp.getContraseña());
    }
}
