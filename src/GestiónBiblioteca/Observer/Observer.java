/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestiónBiblioteca.Observer;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Autor;

/**
 *
 * @author Luis Mate Carmona
 */
public class Observer {
    //Observer
   public static void aumentarPublicacionesAutor(String codAutor){
       Biblioteca.getAutor(codAutor).aumentarPublicaciones();
   }
   
}
