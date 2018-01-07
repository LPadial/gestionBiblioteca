
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VDevolverPublicacion extends javax.swing.JFrame {
private JFrame principal;
    public VDevolverPublicacion(JFrame ventana) {
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
        DEVOLVER = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CPUBLI = new javax.swing.JTextField();
        CSOCIO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FECHAD = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
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
        jLabel1.setText("DEVOLUCIÓN:");

        DEVOLVER.setText("DEVOLVER");
        DEVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEVOLVERActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CPUBLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPUBLIActionPerformed(evt);
            }
        });

        CSOCIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSOCIOActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("CÓDIGO SOCIO:");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("FECHA DEVOLUCIÓN:");

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("CÓDIGO PUBLICACIÓN:");

        FECHAD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        FECHAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FECHADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FECHAD, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPUBLI, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CSOCIO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CSOCIO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CPUBLI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FECHAD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VOLVER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DEVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DEVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VOLVER)
                        .addGap(41, 41, 41))))
        );

        setSize(new java.awt.Dimension(567, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void CSOCIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSOCIOActionPerformed
        // 
    }//GEN-LAST:event_CSOCIOActionPerformed

    private void CPUBLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPUBLIActionPerformed
       
    }//GEN-LAST:event_CPUBLIActionPerformed

    private void FECHADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FECHADActionPerformed
        
    }//GEN-LAST:event_FECHADActionPerformed

    private void DEVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEVOLVERActionPerformed
        //
        try {
        String codigosocio = CSOCIO.getText();
        String codigopubli = CPUBLI.getText();
        GregorianCalendar fdevolver = new GregorianCalendar();
        fdevolver.setTime((Date)FECHAD.getValue());
        
           int dias =    Biblioteca.DevolverPublicación(codigopubli, fdevolver);
            JOptionPane.showMessageDialog(this, "Devolución efectuada Correctamente."+"/n"+"Dias de retraso"+dias, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la Operación"+ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DEVOLVERActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPUBLI;
    private javax.swing.JTextField CSOCIO;
    private javax.swing.JButton DEVOLVER;
    private javax.swing.JFormattedTextField FECHAD;
    private javax.swing.JButton VOLVER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
