package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Libro;
import GestiónBiblioteca.ProyectoFinal;
import GestiónBiblioteca.Publicacion;
import GestiónBiblioteca.Revista;
import GestiónBiblioteca.Tesis;
import java.awt.HeadlessException;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VConsultaPublicacion extends javax.swing.JFrame {

    private final JFrame principal;

    public VConsultaPublicacion(JFrame ventana) {
        initComponents();
        consultarTodo();

        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    private ArrayList<Publicacion> publica; //Referencia al ArrayList de publicaciones de la clase UtilTienda
    private ListIterator li; //Iterador para recorrer el ArrayList en ambas direcciones
    private Publicacion objpubli; //Referencia a un objeto de tipo publicación del arrayList.
    private Libro lib;
    private Revista rev;
    private ProyectoFinal pro;
    private Tesis tes;

    private void consultarTodo() {
        try {
            //referenciamos al arrayList de Biblioteca.
            publica = Biblioteca.getPublicacion();
            //creamos un iterador sobre el arrayList.
            li = publica.listIterator();

            //si no hay publicaciones.
            if (publica.size() < 1) {
                JOptionPane.showMessageDialog(this, "No Hay Publicaciones", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                modificar.setEnabled(false); //DESHABILITAMOS LOS BOTONES.
                sig.setEnabled(false);
                antes.setEnabled(false);
            } else {
                modificar.setEnabled(true); //HABILITAMOS LOS BOTONES.
                sig.setEnabled(true);
                antes.setEnabled(true);
            }

            //PRESENTAMOS LA PRIMERA PUBLICACIÓN.
            if (li.hasNext()) {
                objpubli = (Publicacion) li.next();     //se mira cada uno de los objetos de tipo publicación del arraylist.
            }
            if (objpubli != null) {
                presenta(objpubli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay Publicaciones.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "ERROR" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    //FUNCIÓN QUE PRESENTA LOS DATOS DE CADA PUBLICACIÓN.
    private void presenta(Publicacion objpubli) {
        Limpiar(objpubli);
        getImagen();
        codigo.setText(objpubli.getCodigoPubli());
        isbn.setText(objpubli.getISBN());
        titulo.setText(objpubli.getTitulo());
        autores.setText(objpubli.getAutor());
        fecha.setValue(objpubli.getFechaPublicación().getTime());
        paginas.setText(String.valueOf(objpubli.getPaginas()));
        coleccion.setSelected(objpubli.isColeccion());
        materia.setText(objpubli.getMateria());
        contenido.setText(objpubli.getObservaciones());
        ruta.setText(objpubli.getFotografia());

        switch (objpubli.getClass().getSimpleName()) {
            case "Libro":
                editorial.setText(((Libro) objpubli).getEditorial());
                localidad.setText(((Libro) objpubli).getLocalidad());
                observaciones.setText(((Libro) objpubli).getContenido());
                edicion.setText(((Libro) objpubli).getEdicion());
                localizacion.setText(((Libro) objpubli).getLocalizacion());
                break;
            case "Revista":
                periocidad.setSelectedItem(String.valueOf(((Revista) objpubli).getPeriodicidad()));
                volumen.setText(String.valueOf(((Revista) objpubli).getVolumen()));
                numero.setText(String.valueOf(((Revista) objpubli).getNumeroPublicacion()));
                adisponible.setText(String.valueOf(((Revista) objpubli).getAñoDisponible()));
                localizacion.setText(((Revista) objpubli).getLocalizacion());
                break;
            case "ProyectoFinal":
                tribunal.setText(((ProyectoFinal) objpubli).getTribunal());
                entidad.setText(((ProyectoFinal) objpubli).getEntidad());
                departamento.setText(((ProyectoFinal) objpubli).getDepartamento());
                calificacion.setText(String.valueOf(((ProyectoFinal) objpubli).getCalificacion()));
                lectura.setValue(objpubli.getFechaPublicación().getTime());
                titulacion.setText(((ProyectoFinal) objpubli).getTitulacion());
                break;
            case "Tesis":
                tribunal.setText(((Tesis) objpubli).getTribunal());
                entidad.setText(((Tesis) objpubli).getEntidad());
                departamento.setText(((Tesis) objpubli).getDepartamento());
                calificacion.setText(String.valueOf(((Tesis) objpubli).getCalificacion()));
                lectura.setText(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(((Tesis) objpubli).getFechaLectura().getTime()));
                programa.setText(((Tesis) objpubli).getPrograma());
                break;
            default:
                break;
        }
    }

    //FUNCIÓN QUE LIMPIA LOS DATOS DE LA ANTERIOR PUBLICACIÓN PARA MOSTRAR LA SIGUIENTE.
    private void Limpiar(Publicacion objpubli) {

        switch (objpubli.getClass().getSimpleName()) {
            case "Libro":
                periocidad.setSelectedItem("");
                volumen.setText("");
                numero.setText("");
                adisponible.setText("");
                localizacion.setText("");
                tribunal.setText("");
                entidad.setText("");
                departamento.setText("");
                calificacion.setText("");
                lectura.setText("");
                titulacion.setText("");
                tribunal.setText("");
                entidad.setText("");
                departamento.setText("");
                calificacion.setText("");
                lectura.setText("");
                programa.setText("");
                break;
            case "Revista":
                editorial.setText("");
                localidad.setText("");
                observaciones.setText("");
                edicion.setText("");
                localizacion.setText("");
                tribunal.setText("");
                entidad.setText("");
                departamento.setText("");
                calificacion.setText("");
                lectura.setText("");
                titulacion.setText("");
                tribunal.setText("");
                entidad.setText("");
                departamento.setText("");
                calificacion.setText("");
                lectura.setText("");
                programa.setText("");
                break;
            case "ProyectoFinal":
                editorial.setText("");
                localidad.setText("");
                observaciones.setText("");
                edicion.setText("");
                localizacion.setText("");
                periocidad.setSelectedItem("");
                volumen.setText("");
                numero.setText("");
                adisponible.setText("");
                localizacion.setText("");
                programa.setText("");
                break;
            case "Tesis":
                editorial.setText("");
                localidad.setText("");
                observaciones.setText("");
                edicion.setText("");
                localizacion.setText("");
                periocidad.setSelectedItem("");
                volumen.setText("");
                numero.setText("");
                adisponible.setText("");
                localizacion.setText("");
                titulacion.setText("");
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        observaciones = new javax.swing.JTextField();
        edicion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        autores = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        localidad = new javax.swing.JTextField();
        paginas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        localizacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        calificacion = new javax.swing.JTextField();
        departamento = new javax.swing.JTextField();
        tribunal = new javax.swing.JTextField();
        entidad = new javax.swing.JTextField();
        titulacion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        programa = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        volumen = new javax.swing.JTextField();
        localizacion1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        antes = new javax.swing.JButton();
        sig = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        materia = new javax.swing.JTextField();
        fecha = new javax.swing.JFormattedTextField();
        lectura = new javax.swing.JFormattedTextField();
        coleccion = new javax.swing.JCheckBox();
        examinar = new javax.swing.JButton();
        ruta = new javax.swing.JTextField();
        periocidad = new javax.swing.JComboBox();
        fotos = new javax.swing.JLabel();
        adisponible = new javax.swing.JTextField();
        npublicacion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        codAutor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CONSULTA:");

        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });

        edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("ISBN:");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("TÍTULO:");

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("CÓDIGO:");

        autores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoresActionPerformed(evt);
            }
        });

        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorialActionPerformed(evt);
            }
        });

        localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadActionPerformed(evt);
            }
        });

        paginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginasActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("EDICIÓN:");

        jLabel13.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("LOCALIZACIÓN:");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("COLECCIÓN:");

        jLabel9.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("EDITORIAL:");

        jLabel10.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("LOCALIDAD:");

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("OBSERVACIONES:");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("AUTORES:");

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("FECHA DE PUBLICACIÓN:");

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("PÁGINAS:");

        localizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localizacionActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("CALIFICACIÓN:");

        jLabel15.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("DEPARTAMENTO:");

        jLabel16.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("FECHA LECTURA:");

        jLabel17.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("TRIBUNAL:");

        jLabel18.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("ENTIDAD:");

        calificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calificacionActionPerformed(evt);
            }
        });

        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });

        tribunal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tribunalActionPerformed(evt);
            }
        });

        entidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entidadActionPerformed(evt);
            }
        });

        titulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulacionActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("TITULACIÓN:");

        jLabel20.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 102));
        jLabel20.setText("PROGRAMA:");

        programa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programaActionPerformed(evt);
            }
        });

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        volumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumenActionPerformed(evt);
            }
        });

        localizacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localizacion1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 102));
        jLabel21.setText("PERIODICIDAD:");

        jLabel22.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 102));
        jLabel22.setText("VOLUMEN:");

        jLabel23.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 102));
        jLabel23.setText("NÚMERO:");

        jLabel24.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 102));
        jLabel24.setText("AÑO DISPONIBLE:");

        jLabel25.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 102));
        jLabel25.setText("LOCALIZACIÓN:");

        jLabel27.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 102));
        jLabel27.setText("FOTOGRAFIA:");

        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane1.setViewportView(contenido);

        jLabel28.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 102));
        jLabel28.setText("CONTENIDO:");

        antes.setText("<<");
        antes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antesActionPerformed(evt);
            }
        });

        sig.setText(">>");
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 102));
        jLabel29.setText("MATERIA:");

        materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaActionPerformed(evt);
            }
        });

        fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        lectura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        examinar.setText("Examinar");
        examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinarActionPerformed(evt);
            }
        });

        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        periocidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "TRIMESTRAL", "SEMESTRAL", "ANUAL" }));
        periocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periocidadActionPerformed(evt);
            }
        });

        adisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adisponibleActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 102));
        jLabel26.setText("N.PUBLICACIÓN:");

        jLabel30.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 102));
        jLabel30.setText("CÓDIGO AUTOR:");

        codAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(npublicacion))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fecha))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(16, 16, 16)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(materia)
                                .addComponent(localizacion)
                                .addComponent(edicion)
                                .addComponent(observaciones)
                                .addComponent(isbn)
                                .addComponent(autores)
                                .addComponent(paginas)
                                .addComponent(localidad)
                                .addComponent(editorial)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(antes)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(coleccion))))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(localizacion1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(periocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(adisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addGap(57, 57, 57)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                .addComponent(volumen)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(123, 123, 123)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(programa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lectura, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tribunal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(46, 46, 46)
                            .addComponent(entidad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(sig)
                    .addComponent(antes))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(fotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(periocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(programa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(lectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(entidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(tribunal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(codAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(examinar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(adisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(localizacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(coleccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(localizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(npublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(979, 771));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed

    }//GEN-LAST:event_observacionesActionPerformed

    private void edicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionActionPerformed

    }//GEN-LAST:event_edicionActionPerformed

    private void autoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoresActionPerformed

    }//GEN-LAST:event_autoresActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed

    }//GEN-LAST:event_isbnActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed

    }//GEN-LAST:event_tituloActionPerformed

    private void editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorialActionPerformed

    }//GEN-LAST:event_editorialActionPerformed

    private void localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadActionPerformed

    }//GEN-LAST:event_localidadActionPerformed

    private void paginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginasActionPerformed

    }//GEN-LAST:event_paginasActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed

    }//GEN-LAST:event_codigoActionPerformed

    private void localizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localizacionActionPerformed

    }//GEN-LAST:event_localizacionActionPerformed

    private void calificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calificacionActionPerformed

    }//GEN-LAST:event_calificacionActionPerformed

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed

    }//GEN-LAST:event_departamentoActionPerformed

    private void tribunalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tribunalActionPerformed

    }//GEN-LAST:event_tribunalActionPerformed

    private void entidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entidadActionPerformed

    }//GEN-LAST:event_entidadActionPerformed

    private void titulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulacionActionPerformed

    }//GEN-LAST:event_titulacionActionPerformed

    private void programaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programaActionPerformed

    }//GEN-LAST:event_programaActionPerformed

    private void localizacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localizacion1ActionPerformed

    }//GEN-LAST:event_localizacion1ActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed

    }//GEN-LAST:event_numeroActionPerformed

    private void volumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumenActionPerformed

    }//GEN-LAST:event_volumenActionPerformed


    private void antesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antesActionPerformed
        // BOTON PARA PASAR A AL LA ANTERIOR PUBLICACIÓN.
        if (li.hasPrevious()) {
            objpubli = (Publicacion) li.previous();
            if (objpubli != null) {
                presenta(objpubli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay Publicaciones.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_antesActionPerformed


    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        // BOTON PARA PASAR A AL LA SIGUIENTE PUBLICACIÓN.
        if (li.hasNext()) {
            objpubli = (Publicacion) li.next();
            if (objpubli != null) {
                presenta(objpubli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay Publicaciones.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_sigActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // BOTÓN PARA MODIFICAR.

        try {

            if (objpubli != null) {
                //capturamos la nueva información y modificamos el objeto 
                String auxCodigo = codigo.getText();
                String auxIsbn = isbn.getText();
                String auxTitulo = titulo.getText();
                String auxAutores = autores.getText();
                int auxPaginas = Integer.parseInt(paginas.getText());
                boolean auxColeccion = coleccion.isSelected();
                String auxMateria = materia.getText();
                String foto = ruta.getText();
                GregorianCalendar auxFecha = new GregorianCalendar();
                auxFecha.setTime((Date) fecha.getValue());
                String auxObservaciones = observaciones.getText();
                String auxCodAutor = codAutor.getText();

                if (objpubli.getClass().getSimpleName().equals("Libro")) {

                    String auxEditorial = editorial.getText();
                    String auxLocalidad = localidad.getText();
                    String auxContenido = contenido.getText();
                    String auxEdicion = edicion.getText();
                    String auxLocalizacion = localizacion.getText();
                    
                    Biblioteca.modificaLibro(lib, auxEditorial, auxLocalidad, auxContenido, auxEdicion, auxLocalizacion, auxCodigo, auxIsbn, auxTitulo, auxAutores, auxFecha, auxPaginas, auxColeccion, auxMateria, foto, auxObservaciones, auxCodAutor);
                }

                if (objpubli.getClass().getSimpleName().equals("Revista")) {
                    String auxPeriocidad = (String) periocidad.getSelectedItem();
                    String auxVolumen1 = volumen.getText();
                    Integer auxVolumen = Integer.parseInt(auxVolumen1);
                    String auxNpublicacion1 = npublicacion.getText();
                    Integer auxNpublicacion = Integer.parseInt(auxNpublicacion1);
                    String auxADisponible1 = adisponible.getText();
                    Integer auxADisponible = Integer.parseInt(auxADisponible1);
                    Biblioteca.modificaRevista(rev, auxCodigo, auxIsbn, auxTitulo, auxAutores, auxFecha, auxPaginas, auxColeccion, auxMateria, foto, auxObservaciones, auxPeriocidad, auxVolumen, auxADisponible, auxNpublicacion, auxCodAutor);
                }

                if (objpubli.getClass().getSimpleName().equals("ProyectoFinal")) {

                    String auxTitulacion = titulacion.getText();
                    String auxTribunal = tribunal.getText();
                    String auxEntidad = entidad.getText();
                    String auxDepartamento = departamento.getText();
                    String auxCalificacion = calificacion.getText();
                    Double auxCalificacion1 = Double.parseDouble(auxCalificacion);
                    GregorianCalendar auxLectura = new GregorianCalendar();
                    auxLectura.setTime((Date) lectura.getValue());
                    Biblioteca.modificaProyecto(pro, auxCodigo, auxIsbn, auxTitulo, auxAutores, auxFecha, auxPaginas, auxColeccion, auxMateria, foto, auxObservaciones, auxTitulacion, auxTribunal, auxEntidad, auxDepartamento, auxCalificacion1, auxLectura, auxCodAutor);
                }

                if (objpubli.getClass().getSimpleName().equals("Tesis")) {
                    String auxPrograma = programa.getText();
                    String auxTribunal = tribunal.getText();
                    String auxEntidad = entidad.getText();
                    String auxDepartamento = departamento.getText();
                    String auxCalificacion = calificacion.getText();
                    Double auxCalificacion1 = Double.parseDouble(auxCalificacion);
                    GregorianCalendar auxLectura = new GregorianCalendar();
                    auxLectura.setTime((Date) lectura.getValue());

                    Biblioteca.modificaTesis(tes, auxCodigo, auxIsbn, auxTitulo, auxAutores, auxFecha, auxPaginas, auxColeccion, auxMateria, foto, auxObservaciones, auxTribunal, auxEntidad, auxDepartamento, auxCalificacion1, auxLectura, auxPrograma, auxCodAutor);

                }
                Biblioteca.modificaPublicacion(objpubli, auxCodigo, auxIsbn, auxTitulo, auxAutores, auxFecha, auxPaginas, auxColeccion, auxMateria, foto, auxObservaciones, auxCodAutor);

                JOptionPane.showMessageDialog(this, "Publicación modificada: ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, " Error: - Publicación no encontrada - ", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Valor incorrecto" + nfe.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaActionPerformed
        // 
    }//GEN-LAST:event_materiaActionPerformed

    private void examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinarActionPerformed
        // BOTÓN CON EL QUE SELECCIONAMOS LA IMAGEN QUE DESEAMOS MOSTRAR.
        String adr = "";

        JFileChooser examinar = new JFileChooser();       //creamos la ventana .
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        examinar.setFileFilter(filtroImagen); //Filtro para que sólo se muestren archivos con una determinada extensión.
        int seleccion = examinar.showSaveDialog(examinar);
        //Comprobar si se ha pulsado EXAMINAR.      
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = examinar.getSelectedFile(); //Crear un objeto File con el archivo elegido
            adr = fichero.getAbsolutePath();
            fotos.setText(adr);                         //Mostrar el nombre del archvivo en un campo de texto
        }

    }//GEN-LAST:event_examinarActionPerformed

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaActionPerformed

    private void periocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periocidadActionPerformed

    private void adisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adisponibleActionPerformed

    private void codAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codAutorActionPerformed

    private void getImagen() {
        try {
            fotos.setSize(230, 270);
            ImageIcon imagen = new ImageIcon(objpubli.getFotografia());
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), 1));
            fotos.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adisponible;
    private javax.swing.JButton antes;
    private javax.swing.JTextField autores;
    private javax.swing.JTextField calificacion;
    private javax.swing.JTextField codAutor;
    private javax.swing.JTextField codigo;
    private javax.swing.JCheckBox coleccion;
    private javax.swing.JTextArea contenido;
    private javax.swing.JTextField departamento;
    private javax.swing.JTextField edicion;
    private javax.swing.JTextField editorial;
    private javax.swing.JTextField entidad;
    private javax.swing.JButton examinar;
    private javax.swing.JFormattedTextField fecha;
    private javax.swing.JLabel fotos;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField lectura;
    private javax.swing.JTextField localidad;
    private javax.swing.JTextField localizacion;
    private javax.swing.JTextField localizacion1;
    private javax.swing.JTextField materia;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField npublicacion;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTextField paginas;
    private javax.swing.JComboBox periocidad;
    private javax.swing.JTextField programa;
    private javax.swing.JTextField ruta;
    private javax.swing.JButton sig;
    private javax.swing.JTextField titulacion;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField tribunal;
    private javax.swing.JTextField volumen;
    // End of variables declaration//GEN-END:variables
}
