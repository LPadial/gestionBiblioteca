package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Alumno;
import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.BibliotecaException;
import GestiónBiblioteca.Profesor;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VAltaSocio extends javax.swing.JFrame {

    private final JFrame principal;

    public VAltaSocio(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ALTA NUEVO SOCIO:");

        alta.setText("DAR DE ALTA");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("DNI :");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("CATEGORIA :");

        categoria.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "PROFESOR", "ALUMNO" }));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("NOMBRE :");

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dni)
                    .addComponent(nombre)
                    .addComponent(categoria, 0, 241, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        nombre.getAccessibleContext().setAccessibleName("name");
        nombre.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(alta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(volver)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(550, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        // BOTÓN QUE DA DE ALTA:
        int tipo = categoria.getSelectedIndex();

        //PROFESOR.
        if (tipo == 1) {
            try {

                String auxNombre = nombre.getText();
                String auxDni = dni.getText();

                Profesor objsocio = new Profesor(auxNombre, auxDni);
                Biblioteca.altaSocio(objsocio);
                JOptionPane.showMessageDialog(this, "PROFESOR dado de alta.APUNTE SU NUEVO CÓDIGO DE SOCIO:" + objsocio.getCodigoSocio(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Valor Incorrecto" + nfe.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            } catch (BibliotecaException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Error en alta" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
        //ALUMNO.
        if (tipo == 2) {
            try {
                String auxNombre = nombre.getText();
                String auxDni = dni.getText();

                Alumno objsocio = new Alumno(auxNombre, auxDni);
                Biblioteca.altaSocio(objsocio);
                JOptionPane.showMessageDialog(this, "ALUMNO dado de alta.APUNTE SU NUEVO CÓDIGO DE SOCIO:" + objsocio.getCodigoSocio(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Valor Incorrecto" + nfe.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            } catch (BibliotecaException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Error en alta" + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_altaActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // Selecciona si es PROFESOR Y ALUMNO.       
    }//GEN-LAST:event_categoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
