package GestiónBiblioteca.Adapter;

/**
 * Interface para manejar fechas en formato de España (ES): DD/MM/AAAA.
 */
public interface Fecha {

    /**
     * Devuelve una cadena con la fecha en formato de España (DD/MM/AAAA).
     *
     * @return Fecha en formato de España (DD/MM/AAAA)
     */
    @Override
    public String toString();

    /**
     * Devuelve el año.
     *
     * @return Entero que representa el año.
     */
    public int getAno();

    /**
     * Estable el año.
     *
     * @param ano Entero que representa el año.
     */
    public void setAno(int ano);

    /**
     * Devuelve el día.
     *
     * @return Entero que representa el día.
     */
    public int getDia();

    /**
     * Establece el día.
     *
     * @param dia Entero que representa el día.
     */
    public void setDia(int dia);

    /**
     * Devuelve el mes.
     *
     * @return Entero que representa el mes.
     */
    public int getMes();

    /**
     * Establece el mes.
     *
     * @param mes Entero que representa el mes.
     */
    public void setMes(String mes);
}
