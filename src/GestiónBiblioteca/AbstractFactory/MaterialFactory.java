/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestiónBiblioteca.AbstractFactory;

/**
 *
 * @author laura
 */
/**
 * Factoria abstracta para prestar material
 */
public interface MaterialFactory {

    /**
     * Crea un objeto de tipo Ordenador.
     *
     * @return Objeto de tipo Ordenador.
     */
    public Ordenador creaPrestarOrdenador();

    /**
     * Crea un objeto de tipo Tablet.
     *
     * @return Objeto de tipo Tablets.
     */
    public Tablet creaPrestarTablet();

}
