
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Revista;
import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VRevista extends javax.swing.JFrame {
    private JFrame principal;

    public VRevista(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ALTA = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VOLUMEN = new javax.swing.JTextField();
        NUMERO = new javax.swing.JTextField();
        PAGINAS = new javax.swing.JTextField();
        CODIGO = new javax.swing.JTextField();
        AUTORES = new javax.swing.JTextField();
        LOCALIZACION = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FECHA = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        COLLECTION = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TITULO = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FOTO1 = new javax.swing.JTextField();
        EXAMINAR = new javax.swing.JButton();
        ov = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        MATERIA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        NPUBLICACION = new javax.swing.JTextField();
        PERIODICIDAD = new javax.swing.JComboBox();
        ADISPONIBLE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ALTA REVISTA:");

        ALTA.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        ALTA.setText("DAR DE ALTA");
        ALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTAActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("ISBN:");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("TÍTULO:");

        VOLUMEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLUMENActionPerformed(evt);
            }
        });

        NUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMEROActionPerformed(evt);
            }
        });

        PAGINAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGINASActionPerformed(evt);
            }
        });

        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
            }
        });

        AUTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUTORESActionPerformed(evt);
            }
        });

        LOCALIZACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALIZACIONActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("FECHA DE PUBLICACIÓN:");

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("PÁGINAS:");

        FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel8.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("COLECCIÓN:");

        jLabel9.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("PERIODICIDAD:");

        COLLECTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLLECTIONActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("AUTORES:");

        ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("CÓDIGO:");

        TITULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITULOActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("VOLUMEN:");

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("NÚMERO:");

        jLabel12.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("AÑO DISPONIBLE:");

        jLabel13.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("LOCALIZACIÓN:");

        FOTO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOTO1ActionPerformed(evt);
            }
        });

        EXAMINAR.setText("Examinar");
        EXAMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXAMINARActionPerformed(evt);
            }
        });

        ov.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        ov.setForeground(new java.awt.Color(0, 51, 102));
        ov.setText("OBSERVACIONES:");

        observaciones.setColumns(20);
        observaciones.setRows(5);
        jScrollPane1.setViewportView(observaciones);

        jLabel15.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("FOTOGRAFIA:");

        getImagen();

        jLabel18.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("MATERIA:");

        MATERIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATERIAActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("N.PUBLICACIÓN:");

        PERIODICIDAD.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        PERIODICIDAD.setForeground(new java.awt.Color(0, 51, 102));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(FECHA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CODIGO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TITULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUTORES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MATERIA)
                            .addComponent(PAGINAS)
                            .addComponent(VOLUMEN)
                            .addComponent(NUMERO)
                            .addComponent(LOCALIZACION)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(COLLECTION)
                                .addGap(63, 63, 63))
                            .addComponent(NPUBLICACION, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(PERIODICIDAD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADISPONIBLE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(FOTO1)
                    .addComponent(ov)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXAMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(PAGINAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(COLLECTION)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(PERIODICIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(VOLUMEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(5, 5, 5))
                            .addComponent(ADISPONIBLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LOCALIZACION, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ov)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(EXAMINAR))
                                .addGap(18, 18, 18)
                                .addComponent(FOTO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(NPUBLICACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(667, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNActionPerformed

    private void TITULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITULOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TITULOActionPerformed

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGOActionPerformed

    private void PAGINASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGINASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAGINASActionPerformed

    private void AUTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUTORESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AUTORESActionPerformed

    private void NUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMEROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMEROActionPerformed

    private void VOLUMENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLUMENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VOLUMENActionPerformed

    private void LOCALIZACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALIZACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOCALIZACIONActionPerformed

    private void ALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTAActionPerformed
        // DA DE ALTA LAS PUBLICACIÓN:
        
         try{
                
            String periodo = (String) PERIODICIDAD.getSelectedItem(); 
            String volumen1 = VOLUMEN.getText();
            Integer volumen = Integer.parseInt(volumen1);
            String npublicacion1 = NPUBLICACION.getText();
            Integer npublicacion = Integer.parseInt(npublicacion1);
            String añoDisponible1 = ADISPONIBLE.getText();
            Integer añoDisponible = Integer.parseInt(añoDisponible1);
            String localizacion = LOCALIZACION.getText();
            String codigo = CODIGO.getText();
            String isbn = ISBN.getText();
            String titulo = TITULO.getText();
            String autores = AUTORES.getText();
            
            GregorianCalendar fecha = new GregorianCalendar();
            fecha.setTime((Date)FECHA.getValue());
            
            String foto = FOTO1.getText();
            String paginas1 = PAGINAS.getText();
            Integer paginas = Integer.parseInt(paginas1);
            boolean coleccion = COLLECTION.isSelected();
            String materia = MATERIA.getText();
            String observacion = observaciones.getText();
            
            Revista publi = new Revista(periodo,volumen,npublicacion,añoDisponible,localizacion,codigo,isbn,titulo,autores,fecha,foto,paginas,coleccion,materia,observacion);
            
            Biblioteca.altaPublicacion(publi); 
            
            JOptionPane.showMessageDialog(this, "Revista dada de alta.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alta"+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ALTAActionPerformed

    private void FOTO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOTO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOTO1ActionPerformed

    private void EXAMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXAMINARActionPerformed
        // BOTÓN CON EL QUE SELECCIONAMOS LA IMAGEN QUE DESEAMOS MOSTRAR.
          String adr="";
                
          JFileChooser examinar = new JFileChooser();                //creamos la ventana .
          FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
          examinar.setFileFilter(filtroImagen);                      //Filtro para que sólo se muestren archivos con una determinada extensión.
          int seleccion = examinar.showSaveDialog(examinar);
          //Comprobar si se ha pulsado EXAMINAR.      
          if (seleccion == JFileChooser.APPROVE_OPTION){
                
                File fichero = examinar.getSelectedFile();          //Crear un objeto File con el archivo elegido
                adr =fichero.getAbsolutePath();
                FOTO1.setText(adr);                                 //Mostrar el nombre del archvivo en un campo de texto
          } 
    }//GEN-LAST:event_EXAMINARActionPerformed

    private void COLLECTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLLECTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLLECTIONActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void MATERIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATERIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATERIAActionPerformed

    private void PERIODICIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERIODICIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PERIODICIDADActionPerformed

    private void ADISPONIBLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADISPONIBLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADISPONIBLEActionPerformed
 private void getImagen() {
        try {
            jLabel17.setSize(214, 162);
            ImageIcon imagen = new ImageIcon("UAH.jpg");
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), 1));
            jLabel17.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADISPONIBLE;
    private javax.swing.JToggleButton ALTA;
    private javax.swing.JTextField AUTORES;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JCheckBox COLLECTION;
    private javax.swing.JButton EXAMINAR;
    private javax.swing.JFormattedTextField FECHA;
    private javax.swing.JTextField FOTO1;
    private javax.swing.JTextField ISBN;
    private javax.swing.JTextField LOCALIZACION;
    private javax.swing.JTextField MATERIA;
    private javax.swing.JTextField NPUBLICACION;
    private javax.swing.JTextField NUMERO;
    private javax.swing.JTextField PAGINAS;
    private javax.swing.JComboBox PERIODICIDAD;
    private javax.swing.JTextField TITULO;
    private javax.swing.JTextField VOLUMEN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel ov;
    // End of variables declaration//GEN-END:variables
}
