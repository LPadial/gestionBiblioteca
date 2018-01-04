
package GestiónBiblioteca;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VBajaPublicacion extends javax.swing.JFrame {
private JFrame principal;
    public VBajaPublicacion(JFrame ventana) {
        initComponents();
        consultarTodo();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }
    
    private ArrayList<Publicación> publica; //Referencia al ArrayList de publicaciones de la clase Biblioteca.
    private ListIterator li; //Iterador para recorrer el ArrayList en ambas direcciones
    private Publicación objpubli; //Referencia a un objeto de tipo publicación del arrayList.
    
    private void consultarTodo(){
        try{
            //referenciamos al arrayList de Biblioteca.
            publica = Biblioteca.getPublicación();
            //creamos un iterador sobre el arrayList.
            li = publica.listIterator();
            
            //si no hay publicaciones.
            if(publica.size()<1){
                JOptionPane.showMessageDialog(this,"No Hay Publicaciones","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                BAJA.setEnabled(false); //No habilitamos el botón baja.
                return;
            }else{
                BAJA.setEnabled(true); //habilitamos el botón baja.
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"ERROR" + e.getMessage(),"Mensaje",JOptionPane.ERROR_MESSAGE);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BAJA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VOLVER = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\"BIBLIOTECA UNIVERSITARIA\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        BAJA.setText("DAR DE BAJA ");
        BAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAJAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("BAJA PUBLICACIÓN:");

        VOLVER.setText("VOLVER");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("ITRONDUZCA EL CODIGO DE PUBLICACIÓN:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VOLVER)
                        .addGap(150, 150, 150)
                        .addComponent(BAJA, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VOLVER))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BAJA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-600)/2, (screenSize.height-296)/2, 600, 296);
    }// </editor-fold>//GEN-END:initComponents

    private void BAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAJAActionPerformed
        // BOTÓN DE DAR BAJA.
        String code = codigo.getText();
        
        while(li.hasNext()){                            //mientras el iterador busca en el arraylist. 
            objpubli =(Publicación) li.next();          //se mira cada uno de los objetos de tipo publicación del arraylist.
            if(objpubli.getCodigoPubli().equals(code)){ //si hay un objeto del array que coincida con el codigo dado en el JTFile.
            li.remove();                                //entonces de elimina ese objeto.
            
                JOptionPane.showMessageDialog(this,"Publicación dada de Baja:","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }else{
                objpubli = (Publicación) li.next();     //De otro modo si no coinciden,,se muestra el mensaje de error.
                //JOptionPane.showMessageDialog(this,"ERROR.Publicación no encontrada","Mensaje",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_BAJAActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAJA;
    private javax.swing.JButton VOLVER;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
