/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestiónBiblioteca.State;

import GestiónBiblioteca.Autor;
import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Publicacion;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author ES00564023
 */
public class Estado {
    
    /*
        Devuelve la siguiente publicación que se tiene que mostrar
    */
    public static Publicacion obtenerPublicacion(ArrayList<Publicacion> publica){
        publica = Biblioteca.getPublicacion();
        ListIterator li = publica.listIterator();
        Publicacion objpubli;
        
        do{
            objpubli = (Publicacion) li.next();     //se mira cada uno de los objetos de tipo publicación del arraylist.
        }while (!checkAutor(objpubli));
        
        return objpubli;
    }
    
     /*
        Devuelve la publicación anterior que se tiene que mostrar
    */
    public static Publicacion obtenerPublicacionAnterior(ArrayList<Publicacion> publica){
        publica = Biblioteca.getPublicacion();
        ListIterator li = publica.listIterator();
        Publicacion objpubli;
        
        do{
            objpubli = (Publicacion) li.previous();     //se mira cada uno de los objetos de tipo publicación del arraylist.
        }while (!checkAutor(objpubli));
        
        return objpubli;
    }
    
    /*
     Obtiene el estado del autor de una publicación
    */
    private static boolean checkAutor(Publicacion publicacion){
        String codAutor = publicacion.getCodAutor();
        Autor autorO = Biblioteca.getAutor(codAutor);
        
        return autorO.getActivo();
    }
}
