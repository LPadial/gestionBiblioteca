
package GestiónBiblioteca;


public class BibliotecaException extends Exception{
    
    public static String PUBLICACION_PRESTADA = "LO SENTIMOS. La publicación no está disponible.";

    public static String FUERA_PLAZO = "LO SENTIMOS. Ha sobrepasado el tiempo de préstamo";

    public static String SOCIO_EXISTE = "Aviso. El sacio ya está registrado.";

    public BibliotecaException() {

      super();
  }   

    public BibliotecaException(String txt) {

        super();
    }
}
    

