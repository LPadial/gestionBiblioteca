package GestiónBiblioteca;

import java.util.HashMap;

public class EmpleadosBD {
   
   // private  EmpleadosBD instance = null;
  
    private static HashMap<String, Empleado> instance = new HashMap<>();
    protected EmpleadosBD() {
       Empleado e1 = new Empleado("admin", "1234");
     //   Empleado e2 = new Empleado("2", "2", "Carmen", "Personal", 1500);
        instance.put(e1.getId(), e1);
     //   empleados.put(e2.getId(), e2);   
      // Exists only to defeat instantiation.
   }

    public HashMap<String, Empleado> getEmpleados() {
        return instance;
    }

    public Empleado getEmpleado(String id) {
        return instance.get(id);
    }
    public static HashMap<String, Empleado> getInstance() {
      if(instance == null) {
         instance = new HashMap();
      }
      return instance;
   }
   // public EmpleadosBD() {
   //     Empleado e1 = new Empleado("admin", "1234");
     //   Empleado e2 = new Empleado("2", "2", "Carmen", "Personal", 1500);
   //     empleados.put(e1.getId(), e1);
     //   empleados.put(e2.getId(), e2);
  //  }
}
