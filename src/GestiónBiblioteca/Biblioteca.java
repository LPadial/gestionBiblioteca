package GestiónBiblioteca;

import java.io.*;
import java.util.*;

public class Biblioteca {

    private static ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
    private static HashMap<String, Socio> socios = new HashMap<>();
    private static HashMap<String, Empleado> empleados = new HashMap<>();
    private static HashMap<String, Autor> autores = new HashMap<>();
    private static HashMap<String, Prestar> prestar = new HashMap<>();
    private static ArrayList<Libro> libro;
    private static ArrayList<Revista> revista;
    private static ArrayList<ProyectoFinal> proyecto;
    private static ArrayList<Tesis> tesis;
    private static int nSocio = 1;

    public static HashMap<String, Socio> getSocios() {
        return socios;
    }

    public static int getNSocio() {
        return nSocio;
    }

    public static void setNSocio(int nSocio) {
        Biblioteca.nSocio = nSocio;
    }

    //FUNCIÓN AUMENTAR SOCIOS.
    public static void masSocios() {
        nSocio++;
    }

    //FUNCIÓN QUE VERIFICA SI EL ARRAY ESTÁ VACIO.
    public static boolean vacia() {
        return publicaciones.isEmpty();
    }

    public static ArrayList<Publicacion> getPublicacion() {

        Comparator CodigoPublicación = new Comparator() {
            //COMPARADOR PARA ORDNAR LAS Publicación POR SU CODIGO.
            public int compare(Object n1, Object n2) {

                Publicacion p1 = (Publicacion) n1;
                Publicacion p2 = (Publicacion) n2;
                return p1.getCodigoPubli().compareTo(p2.getCodigoPubli());
            }
        };

        //ORDENAMOS EL ARRAY.
        Collections.sort(publicaciones, CodigoPublicación);
        return publicaciones;
    }

    //FUNCIÓN PARA DAR DE ALTA UN PUBLICACIÓN.
    public static boolean altaPublicacion(Publicacion publi) {
        if (!publicaciones.contains(publi)) {
            publicaciones.add(publi);
            return true;
        } else {
            return false;
        }
    }

    // FUNCIÓN PARA DAR DE BAJA FUNCIONES.
    public static boolean bajaPublicacion(Publicacion publi) {
        if (publicaciones.contains(publi)) {
            publicaciones.remove(publi);
            return true;
        } else {
            return false;
        }
    }

    //FUNCIÓN PARA BUSCAR LAS PUBLICACIONES.
    private static Publicacion buscarPublicacion(String Codigo) {

        Publicacion publicación;
        ListIterator g = publicaciones.listIterator();

        while (g.hasNext()) {
            publicación = (Publicacion) g.next();
            if (Codigo.equals(publicación.getCodigoPubli())) {
                return publicación;
            }
        }
        return null;
    }

    //Función que modifica Las PUBLICACIONES.                                                                    
    public static boolean modificaPublicacion(Publicacion publi, String p_codigoPubli, String p_isbn, String p_titulo, String p_autores, GregorianCalendar p_fechaPublicación, int p_paginas, boolean p_coleccion, String p_materia, String p_fotografia, String p_observaciones) {
        if (publi == null || !publicaciones.contains(publi)) {
            return false;
        }
        publi.setCodigoPubli(p_codigoPubli);
        publi.setISBN(p_isbn);
        publi.setAutor(p_autores);
        publi.setFechaPublicación(p_fechaPublicación);
        publi.setFotografia(p_fotografia);
        publi.setPaginas(p_paginas);
        publi.setColeccion(p_coleccion);
        publi.setObservaciones(p_observaciones);

        return true;
    }

    public static boolean modificaLibro(Libro publi, String p_editorial, String p_localidad, String p_contenido, String p_edicion, String p_localizacion, String p_codigoPubli, String p_isbn, String p_titulo, String p_autores, GregorianCalendar p_fechaPublicación, int p_paginas, boolean p_coleccion, String p_materia, String p_fotografia, String p_observaciones) {
        if (publi == null || !libro.contains(publi)) {
            return false;
        }
        publi.setCodigoPubli(p_codigoPubli);
        publi.setISBN(p_isbn);
        publi.setAutor(p_autores);
        publi.setFechaPublicación(p_fechaPublicación);
        publi.setFotografia(p_fotografia);
        publi.setPaginas(p_paginas);
        publi.setColeccion(p_coleccion);
        publi.setObservaciones(p_observaciones);
        publi.setEditorial(p_editorial);
        publi.setLocalidad(p_localidad);
        publi.setContenido(p_contenido);
        publi.setEdicion(p_edicion);

        return true;
    }

    public static boolean modificaRevista(Revista publi, String p_codigoPubli, String p_isbn, String p_titulo, String p_autores, GregorianCalendar p_fechaPublicación, int p_paginas, boolean p_coleccion, String p_materia, String p_fotografia, String p_observaciones, String p_periodo, int p_volumen, int p_añoDisponible, int p_npublicacion) {
        if (publi == null || !revista.contains(publi)) {
            return false;
        }
        publi.setCodigoPubli(p_codigoPubli);
        publi.setISBN(p_isbn);
        publi.setAutor(p_autores);
        publi.setFechaPublicación(p_fechaPublicación);
        publi.setFotografia(p_fotografia);
        publi.setPaginas(p_paginas);
        publi.setColeccion(p_coleccion);
        publi.setObservaciones(p_observaciones);
        publi.setPeriodicidad(p_periodo);
        publi.setVolumen(p_volumen);
        publi.setAñoDisponible(p_añoDisponible);
        publi.setNumeroPublicacion(p_npublicacion);
        return true;
    }

    public static boolean modificaTesis(Tesis publi, String p_codigoPubli, String p_isbn, String p_titulo, String p_autores, GregorianCalendar p_fechaPublicación, int p_paginas, boolean p_coleccion, String p_materia, String p_fotografia, String p_observaciones, String p_tribunal, String p_entidad, String p_departamento, double p_calificacion, GregorianCalendar p_lectura, String p_programa) {
        if (publi == null || !tesis.contains(publi)) {
            return false;
        }
        publi.setCodigoPubli(p_codigoPubli);
        publi.setISBN(p_isbn);
        publi.setAutor(p_autores);
        publi.setFechaPublicación(p_fechaPublicación);
        publi.setFotografia(p_fotografia);
        publi.setPaginas(p_paginas);
        publi.setColeccion(p_coleccion);
        publi.setObservaciones(p_observaciones);
        publi.setTribunal(p_tribunal);
        publi.setEntidad(p_entidad);
        publi.setDepartamento(p_departamento);
        publi.setCalificacion(p_calificacion);
        publi.setFechaLectura(p_lectura);
        publi.setPrograma(p_programa);
        return true;
    }

    public static boolean modificaProyecto(ProyectoFinal publi, String p_codigoPubli, String p_isbn, String p_titulo, String p_autores, GregorianCalendar p_fechaPublicación, int p_paginas, boolean p_coleccion, String p_materia, String p_fotografia, String p_observaciones, String p_titulacion, String p_tribunal, String p_entidad, String p_departamento, double p_calificacion, GregorianCalendar p_lectura) {
        if (publi == null || !proyecto.contains(publi)) {
            return false;
        }
        publi.setCodigoPubli(p_codigoPubli);
        publi.setISBN(p_isbn);
        publi.setAutor(p_autores);
        publi.setFechaPublicación(p_fechaPublicación);
        publi.setFotografia(p_fotografia);
        publi.setPaginas(p_paginas);
        publi.setColeccion(p_coleccion);
        publi.setObservaciones(p_observaciones);
        publi.setTribunal(p_tribunal);
        publi.setEntidad(p_entidad);
        publi.setDepartamento(p_departamento);
        publi.setCalificacion(p_calificacion);
        publi.setFechaLectura(p_lectura);
        publi.setTitulacion(p_titulacion);

        return true;
    }
    //Función PARA EL PRESTAMO DE PUBLICACIONES.

    public static void prestamoPublicacion(String codigoPubli, String codigosocio, GregorianCalendar fprestar) throws IOException {
        Publicacion m = buscarPublicacion(codigoPubli);
        Prestar prest = m.prestarPublicacion(socios.get(codigosocio), fprestar);
        prestar.put(m.getCodigoPubli(), prest);

    }

    //FUNCION PARA LA DEVOLUCIÓN DE PUBLICACIONES.
    public static int devolverPublicacion(String codigoPubli, GregorianCalendar fdevolver) throws IOException {
        Publicacion m = buscarPublicacion(codigoPubli);
        Prestar prest = prestar.get(codigoPubli);
        prest.setFechaDevolucion(fdevolver);
        return m.devolverPublicacion(prest);

    }
    //FUNCIÓN PARA DAR DE ALTA A LOS SOCIOS.

    public static boolean altaSocio(Socio person) throws BibliotecaException {
        if (!socios.containsKey(person.getCodigoSocio())) {
            socios.put(person.getCodigoSocio(), person);
            return true;
        } else {
            throw new BibliotecaException(BibliotecaException.SOCIO_EXISTE);
        }
    }

    //FUNCIÓN PARA DAR DE ALTA A LOS SOCIOS.
    public static boolean altaAutor(Autor autorO) throws BibliotecaException {
        if (!autores.containsKey(autorO.getCodigo())) {
            autores.put(autorO.getCodigo(), autorO);
            return true;
        } else {
            throw new BibliotecaException(BibliotecaException.AUTOR_EXISTE);
        }
    }

    //FUNCION PARA DAR DE BAJA A LOS SOCIOS.
    public static boolean bajaSocio(String person) throws BibliotecaException {
        if (socios.containsKey(person)) {
            socios.remove(person);
            return true;
        } else {
            throw new BibliotecaException(BibliotecaException.SOCIO_EXISTE);    ///verrr!!!!
        }
    }

    public static Socio getSocio(String person) throws BibliotecaException {
        if (socios.containsKey(person)) {

            return socios.get(person);
        } else {
            throw new BibliotecaException(BibliotecaException.SOCIO_EXISTE);
        }
    }

    //FUNCIÓN PARA DAR DE ALTA A LOS EMPLEADOS.
    public static boolean altaEmpleado(Empleado usuario) throws BibliotecaException {
        if (!empleados.containsKey(usuario.getNombre())) {
            empleados.put(usuario.getNombre(), usuario);
            guardar();
            return true;
        } else {
            throw new BibliotecaException(BibliotecaException.EMPLEADO_EXISTE);
        }
    }

    //FUNCION PARA DAR DE BAJA A LOS EMPLEADOS.
    public static boolean bajaEmpleado(String usuario) throws BibliotecaException {
        if (empleados.containsKey(usuario)) {
            empleados.remove(usuario);
            return true;
        } else {
            throw new BibliotecaException(BibliotecaException.EMPLEADO_NO_EXISTE);
        }
    }

    //GetEmpleado
    public static Empleado getEmpleado(String usuario) throws BibliotecaException {
        if (empleados.containsKey(usuario)) {
            return empleados.get(usuario);
        } else {
            throw new BibliotecaException(BibliotecaException.EMPLEADO_NO_EXISTE);
        }
    }

    //FUNCIÓN QUE SERIALIZA LAS PUBLICACIONES Y SOCIOS.
    public static void guardar() {
        try {
            System.out.println("guardando");
            FileOutputStream guar = new FileOutputStream("publicaciones.dat");
            ObjectOutputStream guar1 = new ObjectOutputStream(guar);
            guar1.writeObject(publicaciones);
            guar.close();
            FileOutputStream dar = new FileOutputStream("socios.dat");
            ObjectOutputStream dar1 = new ObjectOutputStream(dar);
            dar1.writeObject(socios);
            dar.close();
            FileOutputStream pre = new FileOutputStream("préstamo.dat");
            ObjectOutputStream pre1 = new ObjectOutputStream(pre);
            pre1.writeObject(prestar);
            pre.close();
            FileOutputStream aut = new FileOutputStream("autores.dat");
            ObjectOutputStream aut1 = new ObjectOutputStream(aut);
            aut1.writeObject(autores);
            aut.close();
            FileOutputStream empf = new FileOutputStream("empleados.dat");
            ObjectOutputStream empfr = new ObjectOutputStream(empf);
            empfr.writeObject(empleados);
            empf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //FUNCIÓN QUE RECUPERA LOS DATOS SERIALIZADOS.
    public static void recuperar() {
        try {
            FileInputStream recu = new FileInputStream("publicaciones.dat");
            ObjectInputStream recu1 = new ObjectInputStream(recu);
            publicaciones = (ArrayList<Publicacion>) recu1.readObject();
            recu.close();
            FileInputStream rar = new FileInputStream("socios.dat");
            ObjectInputStream rar1 = new ObjectInputStream(rar);
            socios = (HashMap<String, Socio>) rar1.readObject();
            rar.close();
            FileInputStream pres = new FileInputStream("préstamo.dat");
            ObjectInputStream pres1 = new ObjectInputStream(pres);
            prestar = (HashMap<String, Prestar>) pres1.readObject();
            pres.close();
            FileInputStream aut = new FileInputStream("autores.dat");
            ObjectInputStream aut1 = new ObjectInputStream(aut);
            autores = (HashMap<String, Autor>) aut1.readObject();
            aut.close();
            FileInputStream empl = new FileInputStream("empleados.dat");
            ObjectInputStream emplr = new ObjectInputStream(empl);
            empleados = (HashMap<String, Empleado>) emplr.readObject();
            empl.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se ha podido recuperar el dato: " + e);

        }
    }

    //busca un autor por el codigo
    public static boolean buscarAutor(String codigo) {
        return autores.containsKey(codigo);
    }

    //obtiene un autor del hashmap
    public static Autor getAutor(String codigo) {
        return autores.get(codigo);
    }

    public static void quitarAutor(String codigo) {
        autores.remove(codigo);
    }

    public static void añadirAutor(Autor aut) {
        autores.put(aut.getCodigo(), aut);
    }

}
