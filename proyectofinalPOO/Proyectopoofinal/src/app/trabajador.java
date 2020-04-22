
package app;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class trabajador extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/proyectopoofinal"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "root"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = ""; //Password del usuario
    
    PreparedStatement ps;
    ResultSet rs;

    
    
    
 public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
 
 private void limpiarCajas(){
     
     txtid_empleado.setText(null);
     txtidentidad.setText(null);
     txtnombre.setText(null);
     txtapellido.setText(null);
     txtdireccion.setText(null);
      txtCelular.setText(null);
       txtemail.setText(null);
     txtFechanacimiento.setText(null);
     cbxGenero.setSelectedIndex(0);
      txtedad.setText(null);
     
 }
    
    public trabajador() {
        initComponents();
        //txtId.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        lblclave = new javax.swing.JLabel();
        txtid_empleado = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jblfechanacimiento = new javax.swing.JLabel();
        txtFechanacimiento = new javax.swing.JTextField();
        jlblnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jbltelefono = new javax.swing.JLabel();
        jblgenero = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jblfechaingreso = new javax.swing.JLabel();
        dateChooserCombo1fechaingreso = new datechooser.beans.DateChooserCombo();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jlblnombre1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblclave1 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jblemail1 = new javax.swing.JLabel();
        txtidentidad = new javax.swing.JTextField();
        btnlimpiar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(51, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblclave.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblclave.setForeground(new java.awt.Color(0, 102, 102));
        lblclave.setText("ID Empleado");
        getContentPane().add(lblclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, -1));

        txtid_empleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtid_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtid_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 115, -1));

        txtCelular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, -1));

        jblemail.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jblemail.setForeground(new java.awt.Color(0, 102, 102));
        jblemail.setText("Edad");
        getContentPane().add(jblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 50, -1));

        txtemail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 278, 314, 20));

        jblfechanacimiento.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jblfechanacimiento.setForeground(new java.awt.Color(0, 102, 102));
        jblfechanacimiento.setText("Fecha Nacimiento:");
        getContentPane().add(jblfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtFechanacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtFechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 190, -1));

        jlblnombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jlblnombre.setForeground(new java.awt.Color(0, 102, 102));
        jlblnombre.setText("Apellidos");
        getContentPane().add(jlblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtapellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 178, 270, 20));

        jbldireccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jbldireccion.setForeground(new java.awt.Color(0, 102, 102));
        jbldireccion.setText("Direccion");
        getContentPane().add(jbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtdireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 218, 270, 20));

        jbltelefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jbltelefono.setForeground(new java.awt.Color(0, 102, 102));
        jbltelefono.setText("Celular");
        getContentPane().add(jbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jblgenero.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jblgenero.setForeground(new java.awt.Color(0, 102, 102));
        jblgenero.setText("Genero:");
        getContentPane().add(jblgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        cbxGenero.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cbxGenero.setForeground(new java.awt.Color(0, 102, 102));
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));
        cbxGenero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(cbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 200, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 82, 31));

        btneditar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btneditar.setForeground(new java.awt.Color(0, 0, 255));
        btneditar.setText("EDITAR");
        btneditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btneditar.setPreferredSize(new java.awt.Dimension(81, 25));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, 31));

        btneliminar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(0, 0, 255));
        btneliminar.setText("ELIMINAR");
        btneliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 78, 31));

        btnsalir2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnsalir2.setForeground(new java.awt.Color(0, 0, 255));
        btnsalir2.setText("SALIR");
        btnsalir2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 70, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("   REGISTRO DE EMPLEADOS ");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 281, 30));

        jblfechaingreso.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jblfechaingreso.setForeground(new java.awt.Color(0, 102, 102));
        jblfechaingreso.setText("Fecha Ingreso:");
        getContentPane().add(jblfechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 114, 25));

        dateChooserCombo1fechaingreso.setCalendarBackground(new java.awt.Color(255, 255, 255));
        dateChooserCombo1fechaingreso.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD + java.awt.Font.ITALIC, 13));
        getContentPane().add(dateChooserCombo1fechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 120, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/personaicono.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 11, 180, 201));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setText("        FOTO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 220, 108, -1));

        btnsalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 0, 255));
        btnsalir.setText("SALIR");
        btnsalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 82, 31));

        jlblnombre1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jlblnombre1.setForeground(new java.awt.Color(0, 102, 102));
        jlblnombre1.setText("Nombre:");
        getContentPane().add(jlblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 137, -1, -1));

        txtnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 136, 270, 20));

        lblclave1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblclave1.setForeground(new java.awt.Color(0, 102, 102));
        lblclave1.setText("Identidad");
        getContentPane().add(lblclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, -1));

        txtedad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 115, -1));

        jblemail1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jblemail1.setForeground(new java.awt.Color(0, 102, 102));
        jblemail1.setText("Email:");
        getContentPane().add(jblemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtidentidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtidentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtidentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 99, 115, 20));

        btnlimpiar1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnlimpiar1.setForeground(new java.awt.Color(0, 0, 255));
        btnlimpiar1.setText("LIMPIAR");
        btnlimpiar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 70, 31));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("INSERT INTO empleados (id_empleado, identidad, nombre, apellido, direccion, celular, email, fecha_nacimiento, genero, edad) VALUES(?,?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, txtid_empleado.getText());
            ps.setString(2, txtidentidad.getText());
            ps.setString(3, txtnombre.getText());
            ps.setString(4, txtapellido.getText());
            ps.setString(5, txtdireccion.getText());
            ps.setDate(6, Date.valueOf(txtFechanacimiento.getText()));
            ps.setString(7, cbxGenero.getSelectedItem().toString());
            ps.setString(8, txtemail.getText());
            ps.setString(9, txtCelular.getText());
            ps.setString(10, txtedad.getText());
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Trabajador Guardado");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar Trabajador");
                 limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
 
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("UPDATE empleados SET id_empleado=?, identidad=?, nombre=?, apellido=?, direccion=?, fecha_nacimiento=?, genero=?, email=?, celular=?, edad=? WHERE id=?");
            
            ps.setString(1, txtid_empleado.getText());
            ps.setString(2, txtidentidad.getText());
            ps.setString(3, txtnombre.getText());
            ps.setString(4, txtapellido.getText());
            ps.setString(5, txtdireccion.getText());
            ps.setDate(6, Date.valueOf(txtFechanacimiento.getText()));
            ps.setString(7, cbxGenero.getSelectedItem().toString());
            ps.setString(8, txtemail.getText());
            ps.setString(9, txtCelular.getText());
            ps.setString(10, txtedad.getText());

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Trabajador Modificado");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar Trabajador");
                 limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("DELETE FROM persona WHERE id=?");
            //ps.setInt(1, Integer.parseInt(txtId.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Trabajador Eliminado");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar trabajador");
                 limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir2ActionPerformed
    System.exit(WIDTH);
    }//GEN-LAST:event_btnsalir2ActionPerformed

    private void txtid_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_empleadoActionPerformed
        
    }//GEN-LAST:event_txtid_empleadoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtidentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentidadActionPerformed

    private void btnlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiar1ActionPerformed

     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar1;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsalir2;
    private javax.swing.JComboBox<String> cbxGenero;
    private datechooser.beans.DateChooserCombo dateChooserCombo1fechaingreso;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jbldireccion;
    private javax.swing.JLabel jblemail;
    private javax.swing.JLabel jblemail1;
    private javax.swing.JLabel jblfechaingreso;
    private javax.swing.JLabel jblfechanacimiento;
    private javax.swing.JLabel jblgenero;
    private javax.swing.JLabel jbltelefono;
    private javax.swing.JLabel jlblnombre;
    private javax.swing.JLabel jlblnombre1;
    private javax.swing.JLabel lblclave;
    private javax.swing.JLabel lblclave1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtFechanacimiento;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid_empleado;
    private javax.swing.JTextField txtidentidad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
