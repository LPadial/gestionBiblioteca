package GestiónBiblioteca;

import java.util.HashMap;

public class EmpleadosBD {

    private static HashMap<String, Empleado> instance = new HashMap<>();

    protected EmpleadosBD() {
        Empleado e1 = new Empleado("admin", "1234");
        instance.put(e1.getNombre(), e1);
    }

    public HashMap<String, Empleado> getEmpleados() {
        return instance;
    }

    public Empleado getEmpleado(String nombre) {
        return instance.get(nombre);
    }

    public static HashMap<String, Empleado> getInstance() {
        if (instance == null) {
            instance = new HashMap();
        }
        return instance;
    }
}
