
package GestiónBiblioteca;

import java.io.Serializable;
import java.util.GregorianCalendar;

/*- Nombre del socio: Nombre y apellidos del profesor o el alumno.
  - DNI: DNI del socio profesor o alumno.
  - Código de socio: La Biblioteca Universitaria debe asignar un código único a cada
    socio. El código debe estar formado por cinco cifras (empezando por 10000) y una
    letra P si se trata de un profesor o A si se trata de un alumno.
  - Categoría del socio: Se indicara si se trata de alumno o profesor.
  - Fecha de Inscripción: La fecha en que el socio se ha dado de alta.*/
public abstract class Socio implements Serializable{

    protected String Nombre;
    protected String DNI;
    protected String codigoSocio;
    protected GregorianCalendar fechaInscripción;

    //CONSTRUCTOR:
    public Socio(String Nombre, String DNI) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.codigoSocio = Integer.toString(Biblioteca.getNSocio()+10000); //Para generar el código de socio.
        this.fechaInscripción = new GregorianCalendar();
        Biblioteca.masSocios();
    }

    //MÉTODOS GET Y SET.
    public GregorianCalendar getFechaInscripción() {
        return fechaInscripción;
    }
    
    public String getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(String codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Socio:" + "Nombre=" + Nombre + ", DNI=" + DNI + ", codigoSocio=" + codigoSocio + ", fechaInscripción=" + fechaInscripción ;
    }
    
    
    //FUNCIONES PARA SABER EL MÁXIMO DE DIAS QUE PUEDE TENER UNA PUBLICACIÓN.
    public abstract int MaxDiasLibros(int dias);
    public abstract int MaxDiasRevistas(int dias);
    public abstract int MaxDiasProyectos(int dias);


}

