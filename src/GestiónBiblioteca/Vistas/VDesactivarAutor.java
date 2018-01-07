
package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
import GestiónBiblioteca.Autor;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VDesactivarAutor extends javax.swing.JFrame {
private JFrame principal;
    public VDesactivarAutor(JFrame ventana) {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        CODIG = new javax.swing.JTextField();
        BUSCAR = new javax.swing.JButton();
        DESACTIVAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CODIG2 = new javax.swing.JTextField();
        ACTIVAR = new javax.swing.JButton();

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
        jLabel1.setText("DESACTIVAR AUTOR");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Desactivar Autor:");

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Buscar Autor:");

        CODIGO.setText("Código del autor");
        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
            }
        });

        CODIG.setText("Código del Autor");

        BUSCAR.setText("Buscar");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        DESACTIVAR.setText("Desactivar");
        DESACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESACTIVARActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Activar Autor:");

        CODIG2.setText("Código de Autor");

        ACTIVAR.setText("Activar");
        ACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTIVARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CODIGO)
                            .addComponent(CODIG, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(CODIG2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(BUSCAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DESACTIVAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ACTIVAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUSCAR)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(CODIG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DESACTIVAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CODIG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(ACTIVAR)
                .addContainerGap())
        );

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
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGOActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
       
        if (Biblioteca.buscarAutor(CODIGO.getText())){
            Autor aut = Biblioteca.getAutor(CODIGO.getText());
            String activo;
            if (aut.getActivo()){ activo = "Activo";}
            else {activo = "Inactivo";}
            JOptionPane.showMessageDialog(this, "El autor existe, está " + activo + " y tiene: " + aut.getPublicaciones() +" publicaciones");
        } else{
            JOptionPane.showMessageDialog(this, "El no autor existe");
        }
    }//GEN-LAST:event_BUSCARActionPerformed

    private void DESACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESACTIVARActionPerformed
        // TODO add your handling code here:
        if (Biblioteca.buscarAutor(CODIGO.getText())){
            Autor aut = Biblioteca.getAutor(CODIGO.getText());
            aut.desactivar();
            
            Biblioteca.quitarAutor(aut.getCodigo());
            Biblioteca.añadirAutor(aut);
            
            JOptionPane.showMessageDialog(this, "El autor está ahora inactivo");
        } else{
            JOptionPane.showMessageDialog(this, "El no autor existe");
        }
    }//GEN-LAST:event_DESACTIVARActionPerformed

    private void ACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTIVARActionPerformed
        // TODO add your handling code here:
        if (Biblioteca.buscarAutor(CODIGO.getText())){
            Autor aut = Biblioteca.getAutor(CODIGO.getText());
            aut.activar();
            
            Biblioteca.quitarAutor(aut.getCodigo());
            Biblioteca.añadirAutor(aut);
            
            JOptionPane.showMessageDialog(this, "El autor está ahora activo");
        } else{
            JOptionPane.showMessageDialog(this, "El no autor existe");
        }
    }//GEN-LAST:event_ACTIVARActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTIVAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JTextField CODIG;
    private javax.swing.JTextField CODIG2;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JButton DESACTIVAR;
    private javax.swing.JButton VOLVER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
