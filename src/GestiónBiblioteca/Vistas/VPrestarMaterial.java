package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.AbstractFactory.MacFactory;
import GestiónBiblioteca.AbstractFactory.MaterialFactory;
import GestiónBiblioteca.AbstractFactory.Ordenador;
import GestiónBiblioteca.AbstractFactory.Tablet;
import GestiónBiblioteca.AbstractFactory.WindowsFactory;
import GestiónBiblioteca.Biblioteca;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VPrestarMaterial extends javax.swing.JFrame {

    private final JFrame principal;

    public VPrestarMaterial(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        prestar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigos = new javax.swing.JTextField();
        material = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        marca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Préstamo de material:");

        prestar.setText("PRESTAR");
        prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarActionPerformed(evt);
            }
        });

        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Material solicitado:");

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Código de Socio:");

        codigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigosActionPerformed(evt);
            }
        });

        material.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ordenador", "Tablet" }));
        material.setSelectedItem(material);
        material.setToolTipText("");
        material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Marca:");

        marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Windows", "Mac" }));
        marca.setSelectedItem(material);
        marca.setToolTipText("");
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codigos)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Material solicitado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(prestar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prestar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(volver)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(596, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void prestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarActionPerformed
        // BOTÓN Q TE PERMITE PRESTAR.
        try {
            String codigosocio = codigos.getText();
            GregorianCalendar fprestar = new GregorianCalendar();
            fprestar.setTime(new Date());
            String auxMaterial = (String) material.getSelectedItem();
            String auxMarca = (String) marca.getSelectedItem();

            Biblioteca.prestamoMaterial(auxMaterial, auxMarca, codigosocio, fprestar);
            JOptionPane.showMessageDialog(this, "El préstamo se efectuó correctamente");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_prestarActionPerformed

    private void codigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigosActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialActionPerformed

    }//GEN-LAST:event_materialActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed

        //AbstractFactory Cliente
        MaterialFactory factory;
        Ordenador fo;
        Tablet ft;

        //SELECCIONA TIPO DE MATERIAL.
        Integer tipoMaterial = material.getSelectedIndex();
        Integer tipoMarca = marca.getSelectedIndex();

        switch (tipoMarca) {

            case 1:
                factory = new WindowsFactory(); //Creamos factoria concreta para Windows
                if (tipoMaterial == 1) {
                    fo = factory.creaPrestarOrdenador();
                    System.out.println(fo.fechaDeExpiracion());
                }

                if (tipoMaterial == 2) {
                    ft = factory.creaPrestarTablet();
                    System.out.println(ft.fechaDeExpiracion());
                }

            case 2:
                factory = new MacFactory(); //Creamos factoria concreta para Windows
                if (tipoMaterial == 1) {
                    fo = factory.creaPrestarOrdenador();
                    System.out.println(fo.fechaDeExpiracion());
                }

                if (tipoMaterial == 2) {
                    ft = factory.creaPrestarTablet();
                    System.out.println(ft.fechaDeExpiracion());
                }
        }


    }//GEN-LAST:event_marcaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> marca;
    private javax.swing.JComboBox<String> material;
    private javax.swing.JButton prestar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
