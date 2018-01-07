
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Tesis;
import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VTesis extends javax.swing.JFrame {
    private JFrame principal;

    public VTesis(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALTA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EXAMINAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        JLabel = new javax.swing.JLabel();
        FOTO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PROGRAMA = new javax.swing.JTextField();
        CODIGO = new javax.swing.JTextField();
        ENTIDAD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TRIBUNAL = new javax.swing.JTextField();
        DEPARTAMENTO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FECHA = new javax.swing.JFormattedTextField();
        COLLECTION = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        AUTORES = new javax.swing.JTextField();
        CALIFICACION = new javax.swing.JTextField();
        PAGINAS = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TITULO = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        MATERIA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        LECTURA = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        ALTA.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        ALTA.setText("DAR DE ALTA");
        ALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("ALTA TESIS:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EXAMINAR.setText("Examinar");
        EXAMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXAMINARActionPerformed(evt);
            }
        });

        observaciones.setColumns(20);
        observaciones.setRows(5);
        jScrollPane1.setViewportView(observaciones);

        jLabel14.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("FOTOGRAFIA:");

        JLabel.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        JLabel.setForeground(new java.awt.Color(0, 51, 102));
        JLabel.setText("OBSERVACIONES:");

        FOTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOTOActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("TÍTULO:");

        ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("ISBN:");

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("FECHA DE PUBLICACIÓN:");

        jLabel15.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("PROGRAMA:");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("AUTORES:");

        PROGRAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROGRAMAActionPerformed(evt);
            }
        });

        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
            }
        });

        ENTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTIDADActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("TRIBUNAL:");

        TRIBUNAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRIBUNALActionPerformed(evt);
            }
        });

        DEPARTAMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPARTAMENTOActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("PÁGINAS:");

        jLabel8.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("COLECCIÓN:");

        jLabel10.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("ENTIDAD:");

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("CÓDIGO:");

        FECHA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        COLLECTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLLECTIONActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("DEPARTAMENTO:");

        AUTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUTORESActionPerformed(evt);
            }
        });

        CALIFICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALIFICACIONActionPerformed(evt);
            }
        });

        PAGINAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGINASActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("CALIFICACIÓN:");

        jLabel13.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("FECHA LECTURA:");

        TITULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TITULOActionPerformed(evt);
            }
        });

        getImagen();

        MATERIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATERIAActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("MATERIA:");

        LECTURA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        LECTURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LECTURAActionPerformed(evt);
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FECHA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(ENTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LECTURA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TRIBUNAL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DEPARTAMENTO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CALIFICACION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PAGINAS, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(122, 122, 122)
                        .addComponent(COLLECTION))
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PROGRAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EXAMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
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
                            .addComponent(AUTORES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PAGINAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(COLLECTION)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TRIBUNAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ENTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(DEPARTAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CALIFICACION)
                            .addComponent(jLabel12))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(EXAMINAR)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LECTURA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PROGRAMA, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(FOTO))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MATERIA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(608, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DEPARTAMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPARTAMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPARTAMENTOActionPerformed

    private void ENTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENTIDADActionPerformed

    private void TRIBUNALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRIBUNALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRIBUNALActionPerformed

    private void PROGRAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROGRAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROGRAMAActionPerformed

    private void TITULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TITULOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TITULOActionPerformed

    private void CALIFICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALIFICACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CALIFICACIONActionPerformed

    private void AUTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUTORESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AUTORESActionPerformed

    private void PAGINASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGINASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAGINASActionPerformed

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGOActionPerformed

    private void ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNActionPerformed

    private void FOTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOTOActionPerformed

    private void COLLECTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLLECTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLLECTIONActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void ALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTAActionPerformed
        // TODO add your handling code here:
        try{
            String programa = PROGRAMA.getText(); 
            String tribunal = TRIBUNAL.getText();    
            String entidad = ENTIDAD.getText();
            String departamento = DEPARTAMENTO.getText();
            String calificacion1 = CALIFICACION.getText();
            Double calificacion = Double.parseDouble(calificacion1);  
           
            GregorianCalendar lectura = new GregorianCalendar();
            lectura.setTime((Date)LECTURA.getValue());
            
            String codigo = CODIGO.getText();
            String isbn = ISBN.getText();
            String titulo = TITULO.getText();  
            String autores = AUTORES.getText();
            
            GregorianCalendar fecha = new GregorianCalendar();
            fecha.setTime((Date)FECHA.getValue());
            
            String foto = FOTO.getText();
            String paginas1 = PAGINAS.getText();
            Integer paginas = Integer.parseInt(paginas1);
            boolean coleccion = COLLECTION.isSelected();                           //VER!!!!!!!!!!!!!!!!!!
            String materia = MATERIA.getText();
            String observacion = observaciones.getText();
            
            /*String programa, String tribunal, String entidad, String departamento, double calificacion, 
             * GregorianCalendar fechaLectura, String codigo, String ISBN, String titulo, String autores,
             * GregorianCalendar fechaPublicación, String fotografia, int paginas, boolean coleccion, 
             * String materia, String observaciones*/
            Tesis publi = new Tesis(programa,tribunal,entidad,departamento,calificacion,lectura,codigo,isbn,titulo,autores,fecha,foto,paginas,coleccion,materia,observacion);
            
            Biblioteca.altaPublicacion(publi);
            
            JOptionPane.showMessageDialog(this, "TESIS dada de alta.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alta"+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_ALTAActionPerformed

    private void MATERIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATERIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATERIAActionPerformed

    private void LECTURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LECTURAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LECTURAActionPerformed

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
            jLabel17.setSize(214, 162);
            ImageIcon imagen = new ImageIcon("UAH.jpg");
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), 1));
            jLabel17.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA;
    private javax.swing.JTextField AUTORES;
    private javax.swing.JTextField CALIFICACION;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JCheckBox COLLECTION;
    private javax.swing.JTextField DEPARTAMENTO;
    private javax.swing.JTextField ENTIDAD;
    private javax.swing.JButton EXAMINAR;
    private javax.swing.JFormattedTextField FECHA;
    private javax.swing.JTextField FOTO;
    private javax.swing.JTextField ISBN;
    private javax.swing.JLabel JLabel;
    private javax.swing.JFormattedTextField LECTURA;
    private javax.swing.JTextField MATERIA;
    private javax.swing.JTextField PAGINAS;
    private javax.swing.JTextField PROGRAMA;
    private javax.swing.JTextField TITULO;
    private javax.swing.JTextField TRIBUNAL;
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
    // End of variables declaration//GEN-END:variables
}
