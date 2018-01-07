
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Libro;
import GestiónBiblioteca.ProyectoFinal;
import GestiónBiblioteca.Publicación;
import GestiónBiblioteca.Revista;
import GestiónBiblioteca.Tesis;
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

   private JFrame principal;
    public VConsultaPublicacion(JFrame ventana) {
        initComponents();
        consultarTodo();
        
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }
    
    private ArrayList<Publicación> publica; //Referencia al ArrayList de publicaciones de la clase UtilTienda
    private ListIterator li; //Iterador para recorrer el ArrayList en ambas direcciones
    private Publicación objpubli; //Referencia a un objeto de tipo publicación del arrayList.
    private Libro lib;
    private Revista rev;
    private ProyectoFinal pro;
    private Tesis tes;
    
    private void consultarTodo(){
        try{
            //referenciamos al arrayList de Biblioteca.
            publica = Biblioteca.getPublicación();
            //creamos un iterador sobre el arrayList.
            li = publica.listIterator();
            
            //si no hay publicaciones.
            if(publica.size()<1){
                JOptionPane.showMessageDialog(this,"No Hay Publicaciones","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                modificar.setEnabled(false); //DESHABILITAMOS LOS BOTONES.
                SIG.setEnabled(false);
                ANTES.setEnabled(false);
            }else{
                modificar.setEnabled(true); //HABILITAMOS LOS BOTONES.
                SIG.setEnabled(true);
                ANTES.setEnabled(true);
            }
            
             //PRESENTAMOS LA PRIMERA PUBLICACIÓN.
            if (li.hasNext()) {
                objpubli = (Publicación) li.next();     //se mira cada uno de los objetos de tipo publicación del arraylist.
            }
            if (objpubli != null) {
                presenta(objpubli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay Publicaciones.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"ERROR" + e.getMessage(),"Mensaje",JOptionPane.ERROR_MESSAGE);
    }
    }
    
    //FUNCIÓN QUE PRESENTA LOS DATOS DE CADA PUBLICACIÓN.
    private void presenta(Publicación objpubli){
        Limpiar(objpubli);
        getImagen();
        CODIGO.setText(objpubli.getCodigoPubli());
        ISBN.setText(objpubli.getISBN());
        TITULO.setText(objpubli.getTitulo());
        AUTORES.setText(objpubli.getAutor());     
        FECHA.setValue(objpubli.getFechaPublicación().getTime());        
        PAGINAS.setText(String.valueOf(objpubli.getPaginas()));                 
        COLECCION.setSelected(objpubli.isColeccion()); 
        MATERIA.setText(objpubli.getMateria());
        comentario.setText(objpubli.getObservaciones());
        RUTA.setText(objpubli.getFotografia());
        
        if (objpubli.getClass().getSimpleName().equals("Libro")) {
            EDITORIAL.setText(((Libro)objpubli).getEditorial());
            LOCALIDAD.setText(((Libro)objpubli).getLocalidad());
            CONTENIDO.setText(((Libro)objpubli).getContenido());
            EDICION.setText(((Libro)objpubli).getEdicion());
            LOCALIZACION.setText(((Libro)objpubli).getLocalizacion());
        }
        else if (objpubli.getClass().getSimpleName().equals("Revista")){
            PERIODICIDAD.setSelectedItem(String.valueOf(((Revista)objpubli).getPeriodicidad()));
            VOLUMEN.setText(String.valueOf(((Revista)objpubli).getVolumen()));
            NUMERO.setText(String.valueOf(((Revista)objpubli).getNumeroPublicacion()));
            ADISPONIBLE.setText(String.valueOf(((Revista)objpubli).getAñoDisponible()));
            LOCALIZACION.setText(((Revista)objpubli).getLocalizacion());
        }
        else if (objpubli.getClass().getSimpleName().equals("ProyectoFinal")){
            TRIBUNAL.setText(((ProyectoFinal)objpubli).getTribunal());
            ENTIDAD.setText(((ProyectoFinal)objpubli).getEntidad());
            DEPARTAMENTO.setText(((ProyectoFinal)objpubli).getDepartamento());
            CALIFICACION.setText(String.valueOf(((ProyectoFinal)objpubli).getCalificacion()));
            LECTURA.setValue(objpubli.getFechaPublicación().getTime());  
            TITULACION.setText(((ProyectoFinal)objpubli).getTitulacion());
        }
        else if (objpubli.getClass().getSimpleName().equals("Tesis"))  {
            TRIBUNAL.setText(((Tesis)objpubli).getTribunal());
            ENTIDAD.setText(((Tesis)objpubli).getEntidad());
            DEPARTAMENTO.setText(((Tesis)objpubli).getDepartamento());
            CALIFICACION.setText(String.valueOf(((Tesis)objpubli).getCalificacion()));
            LECTURA.setText(DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(((Tesis)objpubli).getFechaLectura().getTime()));
            PROGRAMA.setText(((Tesis)objpubli).getPrograma());
        }
    }
    
    //FUNCIÓN QUE LIMPIA LOS DATOS DE LA ANTERIOR PUBLICACIÓN PARA MOSTRAR LA SIGUIENTE.
     private void Limpiar(Publicación objpubli){
        
        if (objpubli.getClass().getSimpleName().equals("Libro")) {
            PERIODICIDAD.setSelectedItem("");
            VOLUMEN.setText("");
            NUMERO.setText("");
            ADISPONIBLE.setText("");
            LOCALIZACION.setText("");
            TRIBUNAL.setText("");
            ENTIDAD.setText("");
            DEPARTAMENTO.setText("");
            CALIFICACION.setText("");
            LECTURA.setText("");
            TITULACION.setText("");
            TRIBUNAL.setText("");
            ENTIDAD.setText("");
            DEPARTAMENTO.setText("");
            CALIFICACION.setText("");
            LECTURA.setText("");
            PROGRAMA.setText("");
        }
        else if (objpubli.getClass().getSimpleName().equals("Revista")){
            EDITORIAL.setText("");
            LOCALIDAD.setText("");
            CONTENIDO.setText("");
            EDICION.setText("");
            LOCALIZACION.setText("");
            TRIBUNAL.setText("");
            ENTIDAD.setText("");
            DEPARTAMENTO.setText("");
            CALIFICACION.setText("");
            LECTURA.setText("");
            TITULACION.setText("");
            TRIBUNAL.setText("");
            ENTIDAD.setText("");
            DEPARTAMENTO.setText("");
            CALIFICACION.setText("");
            LECTURA.setText("");
            PROGRAMA.setText("");
           
        }
        else if (objpubli.getClass().getSimpleName().equals("ProyectoFinal")){
            EDITORIAL.setText("");
            LOCALIDAD.setText("");
            CONTENIDO.setText("");
            EDICION.setText("");
            LOCALIZACION.setText("");
            PERIODICIDAD.setSelectedItem("");
            VOLUMEN.setText("");
            NUMERO.setText("");
            ADISPONIBLE.setText("");
            LOCALIZACION.setText("");
            PROGRAMA.setText("");
        }
        else if (objpubli.getClass().getSimpleName().equals("Tesis"))  {
            EDITORIAL.setText("");
            LOCALIDAD.setText("");
            CONTENIDO.setText("");
            EDICION.setText("");
            LOCALIZACION.setText("");
            PERIODICIDAD.setSelectedItem("");
            VOLUMEN.setText("");
            NUMERO.setText("");
            ADISPONIBLE.setText("");
            LOCALIZACION.setText("");
            TITULACION.setText("");
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CONTENIDO = new javax.swing.JTextField();
        EDICION = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AUTORES = new javax.swing.JTextField();
        ISBN = new javax.swing.JTextField();
        TITULO = new javax.swing.JTextField();
        EDITORIAL = new javax.swing.JTextField();
        LOCALIDAD = new javax.swing.JTextField();
        PAGINAS = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LOCALIZACION = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CALIFICACION = new javax.swing.JTextField();
        DEPARTAMENTO = new javax.swing.JTextField();
        TRIBUNAL = new javax.swing.JTextField();
        ENTIDAD = new javax.swing.JTextField();
        TITULACION = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PROGRAMA = new javax.swing.JTextField();
        NUMERO = new javax.swing.JTextField();
        VOLUMEN = new javax.swing.JTextField();
        LOCALIZACIÓN = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentario = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        ANTES = new javax.swing.JButton();
        SIG = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        MATERIA = new javax.swing.JTextField();
        FECHA = new javax.swing.JFormattedTextField();
        LECTURA = new javax.swing.JFormattedTextField();
        COLECCION = new javax.swing.JCheckBox();
        EXAMINAR = new javax.swing.JButton();
        RUTA = new javax.swing.JTextField();
        PERIODICIDAD = new javax.swing.JComboBox();
        fotos = new javax.swing.JLabel();
        ADISPONIBLE = new javax.swing.JTextField();
        NPUBLICACION = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

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

        CONTENIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTENIDOActionPerformed(evt);
            }
        });

        EDICION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDICIONActionPerformed(evt);
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

        AUTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUTORESActionPerformed(evt);
            }
        });

        ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNActionPerformed(evt);
            }
        });

        TITULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITULOActionPerformed(evt);
            }
        });

        EDITORIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITORIALActionPerformed(evt);
            }
        });

        LOCALIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIDADActionPerformed(evt);
            }
        });

        PAGINAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGINASActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("EDICIÓN:");

        jLabel13.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("LOCALIZACIÓN:");

        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
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

        LOCALIZACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIZACIONActionPerformed(evt);
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

        CALIFICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALIFICACIONActionPerformed(evt);
            }
        });

        DEPARTAMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPARTAMENTOActionPerformed(evt);
            }
        });

        TRIBUNAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRIBUNALActionPerformed(evt);
            }
        });

        ENTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTIDADActionPerformed(evt);
            }
        });

        TITULACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITULACIONActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("TITULACIÓN:");

        jLabel20.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 102));
        jLabel20.setText("PROGRAMA:");

        PROGRAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROGRAMAActionPerformed(evt);
            }
        });

        NUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMEROActionPerformed(evt);
            }
        });

        VOLUMEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLUMENActionPerformed(evt);
            }
        });

        LOCALIZACIÓN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIZACIÓNActionPerformed(evt);
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

        comentario.setColumns(20);
        comentario.setRows(5);
        jScrollPane1.setViewportView(comentario);

        jLabel28.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 102));
        jLabel28.setText("CONTENIDO:");

        ANTES.setText("<<");
        ANTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANTESActionPerformed(evt);
            }
        });

        SIG.setText(">>");
        SIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGActionPerformed(evt);
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

        MATERIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATERIAActionPerformed(evt);
            }
        });

        FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        LECTURA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        EXAMINAR.setText("Examinar");
        EXAMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXAMINARActionPerformed(evt);
            }
        });

        RUTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUTAActionPerformed(evt);
            }
        });

        PERIODICIDAD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "TRIMESTRAL", "SEMESTRAL", "ANUAL" }));
        PERIODICIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERIODICIDADActionPerformed(evt);
            }
        });

        ADISPONIBLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADISPONIBLEActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 102));
        jLabel26.setText("N.PUBLICACIÓN:");

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
                        .addComponent(NPUBLICACION))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FECHA))
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
                                .addComponent(MATERIA)
                                .addComponent(LOCALIZACION)
                                .addComponent(EDICION)
                                .addComponent(CONTENIDO)
                                .addComponent(ISBN)
                                .addComponent(AUTORES)
                                .addComponent(PAGINAS)
                                .addComponent(LOCALIDAD)
                                .addComponent(EDITORIAL)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ANTES)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(COLECCION))))
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
                                                .addComponent(LOCALIZACIÓN))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(PERIODICIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ADISPONIBLE, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addGap(57, 57, 57)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(NUMERO, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                .addComponent(VOLUMEN)))
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
                        .addComponent(SIG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TITULACION, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PROGRAMA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CALIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LECTURA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEPARTAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TRIBUNAL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(46, 46, 46)
                            .addComponent(ENTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(RUTA, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(EXAMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))))
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
                    .addComponent(SIG)
                    .addComponent(ANTES))
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
                                        .addComponent(PERIODICIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PROGRAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TITULACION, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(LECTURA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(CALIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(DEPARTAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(ENTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(TRIBUNAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EXAMINAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(VOLUMEN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RUTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(ADISPONIBLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(LOCALIZACIÓN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PAGINAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(COLECCION))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EDITORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LOCALIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(EDICION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(LOCALIZACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(NPUBLICACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(979, 771));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CONTENIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTENIDOActionPerformed
       
    }//GEN-LAST:event_CONTENIDOActionPerformed

    private void EDICIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDICIONActionPerformed
        
    }//GEN-LAST:event_EDICIONActionPerformed

    private void AUTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUTORESActionPerformed
        
    }//GEN-LAST:event_AUTORESActionPerformed

    private void ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNActionPerformed
        
    }//GEN-LAST:event_ISBNActionPerformed

    private void TITULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITULOActionPerformed
        
    }//GEN-LAST:event_TITULOActionPerformed

    private void EDITORIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITORIALActionPerformed
        
    }//GEN-LAST:event_EDITORIALActionPerformed

    private void LOCALIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIDADActionPerformed
        
    }//GEN-LAST:event_LOCALIDADActionPerformed

    private void PAGINASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGINASActionPerformed
        
    }//GEN-LAST:event_PAGINASActionPerformed

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        
    }//GEN-LAST:event_CODIGOActionPerformed

    private void LOCALIZACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIZACIONActionPerformed
        
    }//GEN-LAST:event_LOCALIZACIONActionPerformed

    private void CALIFICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALIFICACIONActionPerformed
       
    }//GEN-LAST:event_CALIFICACIONActionPerformed

    private void DEPARTAMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPARTAMENTOActionPerformed
        
    }//GEN-LAST:event_DEPARTAMENTOActionPerformed

    private void TRIBUNALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRIBUNALActionPerformed
        
    }//GEN-LAST:event_TRIBUNALActionPerformed

    private void ENTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTIDADActionPerformed
        
    }//GEN-LAST:event_ENTIDADActionPerformed

    private void TITULACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITULACIONActionPerformed
        
    }//GEN-LAST:event_TITULACIONActionPerformed

    private void PROGRAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROGRAMAActionPerformed
        
    }//GEN-LAST:event_PROGRAMAActionPerformed

    private void LOCALIZACIÓNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIZACIÓNActionPerformed
        
    }//GEN-LAST:event_LOCALIZACIÓNActionPerformed

    private void NUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMEROActionPerformed
        
    }//GEN-LAST:event_NUMEROActionPerformed

    private void VOLUMENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLUMENActionPerformed
        
    }//GEN-LAST:event_VOLUMENActionPerformed

    
    private void ANTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANTESActionPerformed
        // BOTON PARA PASAR A AL LA ANTERIOR PUBLICACIÓN.
        if (li.hasPrevious()) {
            objpubli = (Publicación) li.previous();
            if (objpubli != null) {
                presenta(objpubli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay Publicaciones.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_ANTESActionPerformed

    
    private void SIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGActionPerformed
        // BOTON PARA PASAR A AL LA SIGUIENTE PUBLICACIÓN.
        if (li.hasNext()) {
            objpubli = (Publicación) li.next();
            if (objpubli != null) {
                presenta(objpubli);
            } else {
                JOptionPane.showMessageDialog(this, "No hay Publicaciones.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_SIGActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // BOTÓN PARA MODIFICAR.
    
          try {
            
            if (objpubli != null) {
            //capturamos la nueva información y modificamos el objeto 
            String codigo = CODIGO.getText();
            String isbn = ISBN.getText();
            String titulo = TITULO.getText();
            String autores = AUTORES.getText();
            int paginas = Integer.parseInt(PAGINAS.getText());
            boolean coleccion = COLECCION.isSelected(); 
            String materia = MATERIA.getText();
            String foto = RUTA.getText();
            GregorianCalendar fecha = new GregorianCalendar();
            fecha.setTime((Date)FECHA.getValue()); 
            String observacion = comentario.getText();
           
            
            if (objpubli.getClass().getSimpleName().equals("Libro")){
                     
            String editorial = EDITORIAL.getText();    
            String localidad = LOCALIDAD.getText();
            String contenido = CONTENIDO.getText();
            String edicion = EDICION.getText();
            String localizacion = LOCALIZACION.getText();
            Biblioteca.modificaLibro(lib,editorial,localidad,contenido,edicion,localizacion,codigo,isbn,titulo,autores,fecha,paginas,coleccion,materia,foto,observacion);
            }
            
            if (objpubli.getClass().getSimpleName().equals("Revista")){
             String periodo = (String) PERIODICIDAD.getSelectedItem(); 
            String volumen1 = VOLUMEN.getText();
            Integer volumen = Integer.parseInt(volumen1);
            String npublicacion1 = NPUBLICACION.getText();
            Integer npublicacion = Integer.parseInt(npublicacion1);
            String añoDisponible1 = ADISPONIBLE.getText();
            Integer añoDisponible = Integer.parseInt(añoDisponible1);
            Biblioteca.modificaRevista(rev,codigo,isbn,titulo,autores,fecha,paginas,coleccion,materia,foto,observacion,periodo,volumen,añoDisponible,npublicacion); 
            }
            
            if (objpubli.getClass().getSimpleName().equals("ProyectoFinal")){
             
            String titulacion = TITULACION.getText(); 
            String tribunal = TRIBUNAL.getText();    
            String entidad = ENTIDAD.getText();
            String departamento = DEPARTAMENTO.getText();
            String calificacion1 = CALIFICACION.getText();
            Double calificacion = Double.parseDouble(calificacion1);  
            GregorianCalendar lectura = new GregorianCalendar();
            lectura.setTime((Date)LECTURA.getValue());
            Biblioteca.modificaProyecto(pro,codigo,isbn,titulo,autores,fecha,paginas,coleccion,materia,foto,observacion,titulacion,tribunal,entidad,departamento,calificacion,(GregorianCalendar)LECTURA.getValue());  
            }
            
            if (objpubli.getClass().getSimpleName().equals("Tesis")){
            String programa = PROGRAMA.getText(); 
            String tribunal = TRIBUNAL.getText();    
            String entidad = ENTIDAD.getText();
            String departamento = DEPARTAMENTO.getText();
            String calificacion1 = CALIFICACION.getText();
            Double calificacion = Double.parseDouble(calificacion1);  
            GregorianCalendar lectura = new GregorianCalendar();
            lectura.setTime((Date)LECTURA.getValue());     
   
            Biblioteca.modificaTesis(tes,codigo,isbn,titulo,autores,fecha,paginas,coleccion,materia,foto,observacion,tribunal,entidad,departamento,calificacion,(GregorianCalendar)LECTURA.getValue(),programa); 

            }
             Biblioteca.modificaPublicación(objpubli,codigo,isbn,titulo,autores,fecha,paginas,coleccion,materia,foto,observacion); 
             
                JOptionPane.showMessageDialog(this, "Publicación modificada: ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
                JOptionPane.showMessageDialog(this, " Error: - Publicación no encontrada - ", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Valor incorrecto"+nfe.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar"+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
   
    }//GEN-LAST:event_modificarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
         principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void MATERIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATERIAActionPerformed
        // 
    }//GEN-LAST:event_MATERIAActionPerformed

    private void EXAMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXAMINARActionPerformed
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

    }//GEN-LAST:event_EXAMINARActionPerformed

    private void RUTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RUTAActionPerformed

    private void PERIODICIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERIODICIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PERIODICIDADActionPerformed

    private void ADISPONIBLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADISPONIBLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADISPONIBLEActionPerformed

    private void getImagen() {
        try {
            fotos.setSize(230, 270);
            ImageIcon imagen = new ImageIcon(objpubli.getFotografia());
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), 1));
            fotos.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADISPONIBLE;
    private javax.swing.JButton ANTES;
    private javax.swing.JTextField AUTORES;
    private javax.swing.JTextField CALIFICACION;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JCheckBox COLECCION;
    private javax.swing.JTextField CONTENIDO;
    private javax.swing.JTextField DEPARTAMENTO;
    private javax.swing.JTextField EDICION;
    private javax.swing.JTextField EDITORIAL;
    private javax.swing.JTextField ENTIDAD;
    private javax.swing.JButton EXAMINAR;
    private javax.swing.JFormattedTextField FECHA;
    private javax.swing.JTextField ISBN;
    private javax.swing.JFormattedTextField LECTURA;
    private javax.swing.JTextField LOCALIDAD;
    private javax.swing.JTextField LOCALIZACION;
    private javax.swing.JTextField LOCALIZACIÓN;
    private javax.swing.JTextField MATERIA;
    private javax.swing.JTextField NPUBLICACION;
    private javax.swing.JTextField NUMERO;
    private javax.swing.JTextField PAGINAS;
    private javax.swing.JComboBox PERIODICIDAD;
    private javax.swing.JTextField PROGRAMA;
    private javax.swing.JTextField RUTA;
    private javax.swing.JButton SIG;
    private javax.swing.JTextField TITULACION;
    private javax.swing.JTextField TITULO;
    private javax.swing.JTextField TRIBUNAL;
    private javax.swing.JTextField VOLUMEN;
    private javax.swing.JTextArea comentario;
    private javax.swing.JLabel fotos;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables
}
