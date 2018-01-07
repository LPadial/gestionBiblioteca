
package GestiónBiblioteca;

public class Alumno extends Socio {

    public Alumno(String nombre, String dni) {
        super(nombre, dni);
        codigoSocio += "A";         //CIFRA DEL CODIGO QUE INDICA SI SE ES PROFESOR O ALUMNO.
    }
    @Override
        public int maxDiasLibros(int dias){
            return 6;
        }
    @Override
        public int maxDiasRevistas(int dias){
            return 3;
        }
    @Override
        public int maxDiasProyectos(int dias){
            return 10;
        }
}

/*
o Libros – 6 días
o Revistas – 3 días
o Proyectos o Tesis – 10 días*/