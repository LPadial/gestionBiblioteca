
package GestiónBiblioteca;

public class Alumno extends Socio {

    public Alumno(String Nombre, String DNI) {
        super(Nombre, DNI);
        codigoSocio += "A";         //CIFRA DEL CODIGO QUE INDICA SI SE ES PROFESOR O ALUMNO.
    }
    @Override
        public int MaxDiasLibros(int dias){
            return 6;
        }
    @Override
        public int MaxDiasRevistas(int dias){
            return 3;
        }
    @Override
        public int MaxDiasProyectos(int dias){
            return 10;
        }
}

/*
o Libros – 6 días
o Revistas – 3 días
o Proyectos o Tesis – 10 días*/