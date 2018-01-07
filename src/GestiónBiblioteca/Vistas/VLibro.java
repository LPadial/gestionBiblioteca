
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Libro;
import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VLibro extends javax.swing.JFrame {
    private JFrame principal;
    public VLibro(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ALTA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PAGINAS = new javax.swing.JTextField();
        TITULO = new javax.swing.JTextField();
        AUTORES = new javax.swing.JTextField();
        FECHA = new javax.swing.JFormattedTextField();
        CODIGO = new javax.swing.JTextField();
        COLLECTION = new javax.swing.JCheckBox();
        ISBN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LOCALIDAD = new javax.swing.JTextField();
        EDITORIAL = new javax.swing.JTextField();
        CONTENIDO = new javax.swing.JTextField();
        EDICION = new javax.swing.JTextField();
        LOCALIZACION = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FOTO = new javax.swing.JTextField();
        EXAMINAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MATERIA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("ALTA LIBRO:");

        ALTA.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        ALTA.setText("DAR DE ALTA");
        ALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTAActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PAGINAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGINASActionPerformed(evt);
            }
        });

        TITULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITULOActionPerformed(evt);
            }
        });

        AUTORES.setEditable(false);
        AUTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUTORESActionPerformed(evt);
            }
        });

        FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
            }
        });

        COLLECTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLLECTIONActionPerformed(evt);
            }
        });

        ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("EDICIÓN:");

        jLabel13.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("LOCALIZACIÓN:");

        jLabel10.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("LOCALIDAD:");

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("CONTENIDO:");

        LOCALIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIDADActionPerformed(evt);
            }
        });

        EDITORIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITORIALActionPerformed(evt);
            }
        });

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

        LOCALIZACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIZACIONActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("CÓDIGO:");

        jLabel9.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("EDITORIAL:");

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("FECHA DE PUBLICACIÓN:");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("AUTORES:");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("TÍTULO:");

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("ISBN:");

        jLabel8.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("COLECCIÓN:");

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("PÁGINAS:");

        FOTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOTOActionPerformed(evt);
            }
        });

        EXAMINAR.setText("Examinar");
        EXAMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXAMINARActionPerformed(evt);
            }
        });

        observaciones.setColumns(20);
        observaciones.setRows(5);
        jScrollPane1.setViewportView(observaciones);

        jLabel16.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("OBSERVACIONES:");

        getImagen();

        jLabel17.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("FOTOGRAFIA:");

        jLabel14.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("MATERIA:");

        MATERIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATERIAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(FECHA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EDICION)
                                    .addComponent(CONTENIDO)
                                    .addComponent(ISBN)
                                    .addComponent(AUTORES)
                                    .addComponent(PAGINAS)
                                    .addComponent(LOCALIDAD)
                                    .addComponent(EDITORIAL)
                                    .addComponent(TITULO)
                                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(COLLECTION))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(MATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LOCALIZACION, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(FOTO)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(EXAMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PAGINAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(COLLECTION)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(EDITORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(LOCALIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(EDICION, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(LOCALIZACION, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(EXAMINAR))
                                .addGap(18, 18, 18)
                                .addComponent(FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(MATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(648, 702));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGOActionPerformed

    private void ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNActionPerformed

    private void TITULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITULOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TITULOActionPerformed

    private void AUTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUTORESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AUTORESActionPerformed

    private void PAGINASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGINASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAGINASActionPerformed

    private void EDITORIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITORIALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDITORIALActionPerformed

    private void LOCALIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOCALIDADActionPerformed

    private void CONTENIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTENIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONTENIDOActionPerformed

    private void EDICIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDICIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDICIONActionPerformed

    private void LOCALIZACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIZACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOCALIZACIONActionPerformed

    private void ALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTAActionPerformed
            try{
            String codigo = CODIGO.getText();
            String isbn = ISBN.getText();
            String titulo = TITULO.getText();
            String autores = AUTORES.getText();
            
            GregorianCalendar fecha = new GregorianCalendar();
            fecha.setTime((Date)FECHA.getValue());
            
            String paginas1 = PAGINAS.getText();
            Integer paginas = Integer.parseInt(paginas1);
            boolean coleccion = COLLECTION.isSelected();
            String materia = MATERIA.getText();
            String foto = FOTO.getText();
            String observacion = observaciones.getText();            
            String editorial = EDITORIAL.getText();    
            String localidad = LOCALIDAD.getText();
            String contenido = CONTENIDO.getText();
            String edicion = EDICION.getText();
            String localizacion = LOCALIZACION.getText();
            
            Libro publi = new Libro(editorial,localidad,contenido,edicion,localizacion,codigo,isbn,titulo,autores,fecha,foto,paginas,coleccion,materia,observacion);
            
            Biblioteca.AltaPublicación(publi);
            
            JOptionPane.showMessageDialog(this, "LIBRO dado de alta.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alta"+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
            
            
    }//GEN-LAST:event_ALTAActionPerformed

    private void FOTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOTOActionPerformed

    private void MATERIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATERIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATERIAActionPerformed

    private void COLLECTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLLECTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLLECTIONActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void EXAMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXAMINARActionPerformed
        // BOTÓN CON EL QUE SELECCIONAMOS LA IMAGEN QUE DESEAMOS MOSTRAR.
          String adr="";
                
          JFileChooser examinar = new JFileChooser();       //creamos la ventana .
          FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
          examinar.setFileFilter(filtroImagen); //Filtro para que sólo se muestren archivos con una determinada extensión.
          int seleccion = examinar.showSaveDialog(examinar);
          //Comprobar si se ha pulsado EXAMINAR.      
          if (seleccion == JFileChooser.APPROVE_OPTION){
                
                File fichero = examinar.getSelectedFile(); //Crear un objeto File con el archivo elegido
                adr =fichero.getAbsolutePath();
                FOTO.setText(adr);                         //Mostrar el nombre del archvivo en un campo de texto
          } 
        
    }//GEN-LAST:event_EXAMINARActionPerformed
 private void getImagen() {
        try {
            jLabel18.setSize(214, 162);
            ImageIcon imagen = new ImageIcon("UAH.jpg");
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), 1));
            jLabel18.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA;
    private javax.swing.JTextField AUTORES;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JCheckBox COLLECTION;
    private javax.swing.JTextField CONTENIDO;
    private javax.swing.JTextField EDICION;
    private javax.swing.JTextField EDITORIAL;
    private javax.swing.JButton EXAMINAR;
    private javax.swing.JFormattedTextField FECHA;
    private javax.swing.JTextField FOTO;
    private javax.swing.JTextField ISBN;
    private javax.swing.JTextField LOCALIDAD;
    private javax.swing.JTextField LOCALIZACION;
    private javax.swing.JTextField MATERIA;
    private javax.swing.JTextField PAGINAS;
    private javax.swing.JTextField TITULO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observaciones;
    // End of variables declaration//GEN-END:variables
}
 
