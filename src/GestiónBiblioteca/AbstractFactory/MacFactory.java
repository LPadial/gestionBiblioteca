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
 * Factoría concreta de material para Mac
 */
public class MacFactory implements MaterialFactory {

    @Override
    public Ordenador creaPrestarOrdenador() {
        return new MacOrdenador();
    }

    @Override
    public Tablet creaPrestarTablet() {
        return new MacTablet();
    }

}
