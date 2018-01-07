
package GestiónBiblioteca;


public class BibliotecaException extends Exception{
    
    public static String PUBLICACION_PRESTADA = "LO SENTIMOS. La publicación no está disponible.";

    public static String FUERA_PLAZO = "LO SENTIMOS. Ha sobrepasado el tiempo de préstamo";

    public static String SOCIO_EXISTE = "El socio ya está registrado.";
    
    public static String SOCIO_NO_EXISTE = "El socio no existe.";
    
    public static String AUTOR_EXISTE = "El autor ya está registrado.";
    
    public static String AUTOR_NO_EXISTE = "El autor no existe.";
    
    public static String EMPLEADO_EXISTE = "El nombre del empleado ya está registrado, pruebe con otro.";
    
    public static String EMPLEADO_NO_EXISTE = "El empleado no existe.";

    public BibliotecaException() {

      super();
  }   

    public BibliotecaException(String txt) {

        super();
    }
}
    

