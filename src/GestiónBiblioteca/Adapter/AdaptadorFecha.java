package GestiónBiblioteca.Adapter;

/**
 * Clase para adaptar fechas en formato de Tue Jan 23 13:56:22 CET 2018 a fechas
 * en formato de España (DD/MM/AAAA)
 */
public class AdaptadorFecha implements Fecha {

    /**
     * Fecha en formato letras que se va a adaptar.
     */
    private FechaLetras fletras;

    /**
     * Constructor
     *
     * @param fletras Fecha en formato de letras
     */
    public AdaptadorFecha(FechaLetras fletras) {
        this.fletras = fletras;
    }

    @Override
    public String toString() {
        String[] st = fletras.toString().split(" ");
        Integer mes = 0;
        String mesLetras = st[1];
        Integer dia = Integer.parseInt(st[2]);
        Integer ano = Integer.parseInt(st[5]);

        switch (mesLetras) {
            case "Jan":
                mes = 1;
                break;
            case "Feb":
                mes = 2;
                break;
            case "Mar":
                mes = 3;
                break;
            case "Apr":
                mes = 4;
                break;
            case "May":
                mes = 5;
                break;
            case "Jun":
                mes = 6;
                break;
            case "Jul":
                mes = 7;
                break;
            case "Aug":
                mes = 8;
                break;
            case "Sep":
                mes = 9;
                break;
            case "Oct":
                mes = 10;
                break;
            case "Nov":
                mes = 11;
                break;
            case "Dec":
                mes = 12;
                break;

        }

        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public int getAno() {
        return this.fletras.getYear();
    }

    @Override
    public void setAno(int ano) {
        this.fletras.setYear(ano);
    }

    @Override
    public int getDia() {
        return this.fletras.getDay();
    }

    @Override
    public void setDia(int dia) {
        this.fletras.setDay(dia);
    }

    @Override
    public int getMes() {
        int mes = 0;
        switch (this.fletras.getMonthLetters()) {
            case "Jan":
                mes = 1;
                break;
            case "Feb":
                mes = 2;
                break;
            case "Mar":
                mes = 3;
                break;
            case "Apr":
                mes = 4;
                break;
            case "May":
                mes = 5;
                break;
            case "Jun":
                mes = 6;
                break;
            case "Jul":
                mes = 7;
                break;
            case "Aug":
                mes = 8;
                break;
            case "Sep":
                mes = 9;
                break;
            case "Oct":
                mes = 10;
                break;
            case "Nov":
                mes = 11;
                break;
            case "Dec":
                mes = 12;
                break;

        }
        return mes;
    }

    @Override
    public void setMes(String mes) {
        this.fletras.setMonthLetters(mes);
    }
}
