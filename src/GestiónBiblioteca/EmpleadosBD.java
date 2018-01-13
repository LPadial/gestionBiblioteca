package GestiónBiblioteca;

import java.util.*;
import java.io.*;

public class EmpleadosBD {

    private static HashMap<String, Empleado> instance = new HashMap<>();

    protected EmpleadosBD() {
        this.recuperar();
        /*
        Empleado e1 = new Empleado("admin", "1234");
        instance.put(e1.getNombre(), e1);
         */
    }
    
    private void recuperar(){
        try {
            FileInputStream empl = new FileInputStream("empleados.dat");
            ObjectInputStream emplr = new ObjectInputStream(empl);
            instance = (HashMap<String, Empleado>) emplr.readObject();
            empl.close();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("No se ha posiso recuperar los empleados" + e);
        }
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
