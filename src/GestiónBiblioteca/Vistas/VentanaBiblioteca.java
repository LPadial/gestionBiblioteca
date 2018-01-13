package GestiónBiblioteca.Vistas;

import GestiónBiblioteca.Biblioteca;
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
        alta = new javax.swing.JButton();
        baja = new javax.swing.JButton();
        consulta = new javax.swing.JButton();
        prestar = new javax.swing.JButton();
        devolver = new javax.swing.JButton();
        altaSocio = new javax.swing.JButton();
        bajaSocio = new javax.swing.JButton();
        altaAutor = new javax.swing.JButton();
        bajaEmpleado = new javax.swing.JButton();
        altaEmpleado = new javax.swing.JButton();
        desactivarAutor = new javax.swing.JButton();

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

        alta.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        alta.setText("Alta Publicación");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });

        baja.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        baja.setText("Baja Publicación");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        consulta.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        consulta.setText("Consulta Publicaciones");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        prestar.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        prestar.setText("Préstamo");
        prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarActionPerformed(evt);
            }
        });

        devolver.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        devolver.setText("Devolución");
        devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverActionPerformed(evt);
            }
        });

        altaSocio.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        altaSocio.setText("Alta Socio");
        altaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaSocioActionPerformed(evt);
            }
        });

        bajaSocio.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        bajaSocio.setText("Baja Socio");
        bajaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaSocioActionPerformed(evt);
            }
        });

        altaAutor.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        altaAutor.setText("Alta Autor");
        altaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaAutorActionPerformed(evt);
            }
        });

        bajaEmpleado.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        bajaEmpleado.setText("Baja empleado");
        bajaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaEmpleadoActionPerformed(evt);
            }
        });

        altaEmpleado.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        altaEmpleado.setText("Alta Empleado");
        altaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEmpleadoActionPerformed(evt);
            }
        });

        desactivarAutor.setFont(new java.awt.Font("Cantarell", 3, 14)); // NOI18N
        desactivarAutor.setText("Desactivar Autor");
        desactivarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desactivarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(altaEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altaAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altaSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(baja, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addComponent(devolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bajaSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desactivarAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bajaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alta, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(baja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(prestar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bajaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desactivarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bajaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(573, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        // TODO add your handling code here:
        VAltaPublicacion a = new VAltaPublicacion(this);
    }//GEN-LAST:event_altaActionPerformed

    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        // TODO add your handling code here:
        VBajaPublicacion b = new VBajaPublicacion(this);
    }//GEN-LAST:event_bajaActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        // TODO add your handling code here:
        VConsultaPublicacion c = new VConsultaPublicacion(this);
    }//GEN-LAST:event_consultaActionPerformed

    private void prestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarActionPerformed
        // TODO add your handling code here:
        VPrestamo p = new VPrestamo(this);
    }//GEN-LAST:event_prestarActionPerformed

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverActionPerformed
        // TODO add your handling code here:
        VDevolverPublicacion d = new VDevolverPublicacion(this);
    }//GEN-LAST:event_devolverActionPerformed

    private void altaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaSocioActionPerformed
        // TODO add your handling code here:
        VAltaSocio s = new VAltaSocio(this);
    }//GEN-LAST:event_altaSocioActionPerformed

    private void bajaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaSocioActionPerformed
        // TODO add your handling code here:
        VBajaSocio f = new VBajaSocio(this);
    }//GEN-LAST:event_bajaSocioActionPerformed

    private void recuperar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_recuperar
        Biblioteca.recuperar();
    }//GEN-LAST:event_recuperar

    private void guardar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardar
        Biblioteca.guardar();
    }//GEN-LAST:event_guardar

    private void altaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaAutorActionPerformed
        VAltaAutor aa = new VAltaAutor(this);
    }//GEN-LAST:event_altaAutorActionPerformed

    private void bajaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaEmpleadoActionPerformed
        VBajaEmpleado be = new VBajaEmpleado(this);
    }//GEN-LAST:event_bajaEmpleadoActionPerformed

    private void altaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEmpleadoActionPerformed
        VAltaEmpleado ae = new VAltaEmpleado(this);
    }//GEN-LAST:event_altaEmpleadoActionPerformed

    private void desactivarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desactivarAutorActionPerformed
        VDesactivarAutor da = new VDesactivarAutor(this);
    }//GEN-LAST:event_desactivarAutorActionPerformed

    
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
    private javax.swing.JButton alta;
    private javax.swing.JButton altaAutor;
    private javax.swing.JButton altaEmpleado;
    private javax.swing.JButton altaSocio;
    private javax.swing.JButton baja;
    private javax.swing.JButton bajaEmpleado;
    private javax.swing.JButton bajaSocio;
    private javax.swing.JButton consulta;
    private javax.swing.JButton desactivarAutor;
    private javax.swing.JButton devolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prestar;
    // End of variables declaration//GEN-END:variables
}
