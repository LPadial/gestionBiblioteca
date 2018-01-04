
package GestiónBiblioteca;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaBiblioteca extends javax.swing.JFrame {
 
     
public VentanaBiblioteca(JFrame ventana) {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ALTA = new javax.swing.JButton();
        BAJA = new javax.swing.JButton();
        CONSULTA = new javax.swing.JButton();
        PRESTAR = new javax.swing.JButton();
        DEVOLVER = new javax.swing.JButton();
        AltaSocio = new javax.swing.JButton();
        BajaSocio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                guardar(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                recuperar(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("BIBLIOTECA UAH");

        getImagen();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ALTA.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        ALTA.setText("Alta Publicación");
        ALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTAActionPerformed(evt);
            }
        });

        BAJA.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        BAJA.setText("Baja Publicación");
        BAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJAActionPerformed(evt);
            }
        });

        CONSULTA.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        CONSULTA.setText("Consulta Publicaciones");
        CONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTAActionPerformed(evt);
            }
        });

        PRESTAR.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        PRESTAR.setText("Préstamo");
        PRESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESTARActionPerformed(evt);
            }
        });

        DEVOLVER.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        DEVOLVER.setText("Devolución");
        DEVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEVOLVERActionPerformed(evt);
            }
        });

        AltaSocio.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        AltaSocio.setText("Alta Socio");
        AltaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaSocioActionPerformed(evt);
            }
        });

        BajaSocio.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        BajaSocio.setText("Baja Socio");
        BajaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PRESTAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AltaSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BAJA, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(DEVOLVER, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BajaSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(CONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ALTA, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(BAJA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PRESTAR, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BajaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-573)/2, (screenSize.height-541)/2, 573, 541);
    }// </editor-fold>//GEN-END:initComponents

    private void ALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTAActionPerformed
        // TODO add your handling code here:
        VAltaPublicacion a = new VAltaPublicacion(this);
    }//GEN-LAST:event_ALTAActionPerformed

    private void BAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJAActionPerformed
        // TODO add your handling code here:
        VBajaPublicacion b = new VBajaPublicacion(this);
    }//GEN-LAST:event_BAJAActionPerformed

    private void CONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTAActionPerformed
        // TODO add your handling code here:
        VConsultaPublicacion c = new VConsultaPublicacion(this);
    }//GEN-LAST:event_CONSULTAActionPerformed

    private void PRESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTARActionPerformed
        // TODO add your handling code here:
        VPrestarPublicacion p = new VPrestarPublicacion(this);
    }//GEN-LAST:event_PRESTARActionPerformed

    private void DEVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEVOLVERActionPerformed
        // TODO add your handling code here:
        VDevolverPublicacion d = new VDevolverPublicacion(this);
    }//GEN-LAST:event_DEVOLVERActionPerformed

    private void AltaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaSocioActionPerformed
        // TODO add your handling code here:
        VAltaSocio s = new VAltaSocio(this);
    }//GEN-LAST:event_AltaSocioActionPerformed

    private void BajaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaSocioActionPerformed
        // TODO add your handling code here:
        VBajaSocio f = new VBajaSocio(this);
    }//GEN-LAST:event_BajaSocioActionPerformed

    private void recuperar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_recuperar
        Biblioteca.recuperar();
    }//GEN-LAST:event_recuperar

    private void guardar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardar
        Biblioteca.guardar();
    }//GEN-LAST:event_guardar

    
     private void getImagen() {
        try {
            jLabel2.setSize(164, 139);
            ImageIcon imagen = new ImageIcon("UAH.jpg");
            //Se redimensiona
            ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), 1));
            jLabel2.setIcon(imgRedimensionada);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTA;
    private javax.swing.JButton AltaSocio;
    private javax.swing.JButton BAJA;
    private javax.swing.JButton BajaSocio;
    private javax.swing.JButton CONSULTA;
    private javax.swing.JButton DEVOLVER;
    private javax.swing.JButton PRESTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
