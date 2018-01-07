package GestiónBiblioteca;

import java.util.ArrayList;

/**
 * Es el responsable de la custodia de los recuerdos. Nunca opera o examina el
 * contenido de un recuerdo.
 *
 * @author Salvador Oton
 */
public class Conserje {

    // Lista de recuerdos.
    private ArrayList<Socio> recuerdos = new ArrayList<>();

    /**
     * Añade un recuerdo a la lista de recuerdos.
     *
     * @param recuerdo Recuerdo a añadir.
     */
    public void setRecuerdo(Socio recuerdo) {
        recuerdos.add(recuerdo);
    }

    /**
     * Recupera un recuerdo a partir del índice pasado como argumento.
     *
     * @return Socio.
     */
    public Socio getRecuerdo() {
        if (recuerdos.size() > 0) {

            Socio r = recuerdos.get(recuerdos.size() - 1);
            return r;
        } else {

            return null;
        }
    }
}
