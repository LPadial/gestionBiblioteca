/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestiónBiblioteca.AbstractFactory;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author laura
 */
/**
 * Clase concreta (producto concreto) que representa un material de tipo
 * ordenador para Mac.
 */
public class MacOrdenador extends Ordenador {

    public MacOrdenador() {
    }

    /**
     *
     * @return String
     */
    @Override
    public String fechaDeExpiracion() {
        Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, 15);
        
        return calendar.getTime().toString();
    }


}
