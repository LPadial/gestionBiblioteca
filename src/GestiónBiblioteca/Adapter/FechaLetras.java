package GestiónBiblioteca.Adapter;

import java.util.StringTokenizer;

/**
 * Clase para manejar fechas en formato de letras: DDD MMM DD HH:mm:ss CET YYYY
 */
public class FechaLetras {

    /**
     * 3 primeras letras del día de la semana en inglés
     */
    private String dayLetters;

    /**
     * 3 primeras letras del mes en inglés
     */
    private String monthLetters;

    /**
     * Entero que representa el día.
     */
    private Integer day;

    /**
     * Hora en formato HH:mm:ss
     */
    private String hour;

    /**
     * Zona horaria CET (CENTRAL EUROPEAN TIME)
     */
    private String timeZone;

    /**
     * Entero que representa el año.
     */
    private Integer year;

    /**
     * Constructor
     *
     * @param dayLetters String Las tres primeras letras del día de la semana
     * @param monthLetters String Las tres primeras letras del mes
     * @param day Entero que representa el día.
     * @param hour String Hora en formato HH:mm:ss
     * @param timeZone String Zona horaria CET (CENTRAL EUROPEAN TIME)
     * @param year Entero que representa el año.
     */
    public FechaLetras(String dayLetters, String monthLetters, Integer day, String hour, String timeZone, Integer year) {
        this.dayLetters = dayLetters;
        this.monthLetters = monthLetters;
        this.day = day;
        this.hour = hour;
        this.timeZone = timeZone;
        this.year = year;
    }

    /**
     * Constructor
     *
     * @param date Fecha en formato de letras: DDD MMM DD HH:mm:ss CET YYYY
     */
    public FechaLetras(String date) {
        StringTokenizer st = new StringTokenizer(date, " ");
        this.dayLetters = st.nextToken();
        this.monthLetters = st.nextToken();
        String dd = st.nextToken();
        this.hour = st.nextToken();
        this.timeZone = st.nextToken();
        String aaaa = st.nextToken();

        this.day = Integer.parseInt(dd);
        this.year = Integer.parseInt(aaaa);
    }

    /**
     * Devuelve una cadena con la fecha en formato de letras: DDD MMM DD HH:mm:ss CET YYYY.
     *
     * @return String en formato de letras: DDD MMM DD HH:mm:ss CET YYYY.
     */
    @Override
    public String toString() {
        return dayLetters + " " + monthLetters + " " + day + " " + hour + " " + timeZone + " " + year;
    }

    /**
     * Devuelve las tres primeras letras del día de la semana.
     *
     * @return String que representa el día de la semana.
     */
    public String getDayLetters() {
        return this.dayLetters;
    }

    /**
     * Establece el día de la semana.
     *
     * @param dayLetters String que representa el día de la semana.
     */
    public void setDayLetters(String dayLetters) {
        this.dayLetters = dayLetters;
    }

    /**
     * Devuelve las tres primeras letras del mes.
     *
     * @return String que representa el mes.
     */
    public String getMonthLetters() {
        return this.monthLetters;
    }

    /**
     * Establece el mes.
     *
     * @param monthLetters String que representa el mes.
     */
    public void setMonthLetters(String monthLetters) {
        this.monthLetters = monthLetters;
    }

    /**
     * Devuelve el día.
     *
     * @return Entero que representa el día.
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Establece el día.
     *
     * @param day Entero que representa el día.
     */
    public void setDay(int day) {
        this.day = day;
    }
    
    /**
     * Devuelve la hora.
     *
     * @return String que representa la hora.
     */
    public String getHour() {
        return this.hour;
    }

    /**
     * Establece la hora.
     *
     * @param hour String que representa la hora.
     */
    public void setHour(String hour) {
        this.hour = hour;
    }
    
    /**
     * Devuelve la zona horaria.
     *
     * @return String que representa la zona horaria.
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * Establece la zona horaria.
     *
     * @param timeZone String que representa la zona horaria.
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Devuelve el año.
     *
     * @return Entero que representa el año.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Establece el año.
     *
     * @param year Entero que representa el año.
     */
    public void setYear(int year) {
        this.year = year;
    }
}
