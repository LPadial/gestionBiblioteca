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
 * Factoría concreta de material para Windows
 */
public class WindowsFactory implements MaterialFactory {

    @Override
    public Ordenador creaPrestarOrdenador() {
        return new WindowsOrdenador();
    }

    @Override
    public Tablet creaPrestarTablet() {
        return new WindowsTablet();
    }

}
