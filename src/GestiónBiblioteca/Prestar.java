
package GestiónBiblioteca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Prestar {
    
    private Publicación publicaciones;
    private Socio socio;
    private GregorianCalendar fechaPrestamo;
    private GregorianCalendar fechaDevolucion;
    
     public Prestar(Publicación publicaciones, Socio socio, GregorianCalendar fechaPrestamo) {
        this.publicaciones = publicaciones;
        this.socio = socio;
        this.fechaPrestamo = fechaPrestamo;
       
    }


    public GregorianCalendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(GregorianCalendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public GregorianCalendar getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(GregorianCalendar fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    //IMPRESIÓN DEL TICKET DE PRÉSTAMO O DEVOLUCIÓN.
    public void Factura(boolean Prestarse) throws IOException{
        
        GregorianCalendar fecha = new GregorianCalendar();
        String text = socio.getCodigoSocio()+"-"+fecha.get(Calendar.DAY_OF_MONTH)+"-"+fecha.get(Calendar.MONTH)+"-"+fecha.get(Calendar.YEAR)+".txt"; 
        BufferedWriter factura = new BufferedWriter(new FileWriter (text));
        if(Prestarse == true)
         factura.write("Factura");   
        else factura.write("Factura de devolución");          
        factura.newLine();
        factura.write("Datos de Publicación");
        factura.newLine();
        factura.write(publicaciones.toString());
        factura.newLine();
        factura.write("Datos de Socio");
        factura.newLine();
        factura.write(socio.toString());
        factura.newLine();
        factura.close();
        
    } 
   
    public int calcularTardanza(){
        int dias;
        dias =(fechaDevolucion.get(Calendar.YEAR)- fechaPrestamo.get(Calendar.YEAR))*365;
        dias =(fechaDevolucion.get(Calendar.DAY_OF_YEAR)-fechaPrestamo.get(Calendar.DAY_OF_YEAR));
        switch (publicaciones.getClass().getSimpleName()){
            case "Libro":
               dias -= socio.MaxDiasLibros(dias);
                break;
            case "Revista":
                dias -= socio.MaxDiasRevistas(dias);
                break;
            case "ProyectosFinales":
                dias -= socio.MaxDiasProyectos(dias);
                break;
            case "Tesis":
                dias -= socio.MaxDiasProyectos(dias);
                break;
        }
       return dias;
        
    }
}

