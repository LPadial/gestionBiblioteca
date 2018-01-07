
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Alumno;
import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Profesor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VAltaSocio extends javax.swing.JFrame {
private JFrame principal;
    public VAltaSocio(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VOLVER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ALTAS = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        VOLVER.setText("VOLVER");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ALTA NUEVO SOCIO:");

        ALTAS.setText("DAR DE ALTA");
        ALTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTASActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("DNI :");

        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
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

        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
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
                    .addComponent(DNI)
                    .addComponent(NOMBRE)
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
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        NOMBRE.getAccessibleContext().setAccessibleName("name");
        NOMBRE.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VOLVER))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(ALTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(ALTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(VOLVER)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(550, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIActionPerformed

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREActionPerformed

    private void ALTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTASActionPerformed
        // BOTÓN QUE DA DE ALTA:
         int tipo =  categoria.getSelectedIndex();
         
         //PROFESOR.
         if (tipo == 1) {       
             try{
                 
            String nombre = DNI.getText();
            String dni = NOMBRE.getText();
            
            Profesor objsocio = new Profesor(nombre,dni);
            Biblioteca.AltaSocio(objsocio);
            JOptionPane.showMessageDialog(this, "PROFESOR dado de alta.APUNTE SU NUEVO CÓDIGO DE SOCIO:"+objsocio.getCodigoSocio(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Valor Incorrecto"+nfe.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alta"+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
       }            
        } 
        //ALUMNO.
        if (tipo ==2){        
            try{
            String nombre = DNI.getText();
            String dni = NOMBRE.getText();
            
            Alumno objsocio = new Alumno(nombre,dni);
            Biblioteca.AltaSocio(objsocio);
            JOptionPane.showMessageDialog(this, "ALUMNO dado de alta.APUNTE SU NUEVO CÓDIGO DE SOCIO:"+objsocio.getCodigoSocio(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Valor Incorrecto"+nfe.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alta"+e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }            
        }
        

    }//GEN-LAST:event_ALTASActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // Selecciona si es PROFESOR Y ALUMNO.       
    }//GEN-LAST:event_categoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTAS;
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton VOLVER;
    private javax.swing.JComboBox categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
