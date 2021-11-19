
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class Login extends javax.swing.JFrame {

    //SE ESTABLECE VARIABLE PARA LOS INTENTOS
    public int intentos = 4;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblUsuario = new javax.swing.JLabel();
        jlblContrasena = new javax.swing.JLabel();
        jlblErroUser = new javax.swing.JLabel();
        jlblBienvenido = new javax.swing.JLabel();
        jlblIngresaCuenta = new javax.swing.JLabel();
        jbtnIngresar = new javax.swing.JButton();
        jbtnVaciar = new javax.swing.JButton();
        jpwdPassword = new javax.swing.JPasswordField();
        jtxtUsuario = new javax.swing.JTextField();
        jlblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblUsuario.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(112, 53, 0));
        jlblUsuario.setText("Usuario");
        jPanel1.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 120, 20));

        jlblContrasena.setFont(new java.awt.Font("Gotham", 0, 25)); // NOI18N
        jlblContrasena.setForeground(new java.awt.Color(112, 53, 0));
        jlblContrasena.setText("Contraseña");
        jPanel1.add(jlblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 140, 30));

        jlblErroUser.setForeground(new java.awt.Color(183, 9, 9));
        jPanel1.add(jlblErroUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 310, 20));

        jlblBienvenido.setFont(new java.awt.Font("Gotham", 1, 36)); // NOI18N
        jlblBienvenido.setForeground(new java.awt.Color(112, 53, 0));
        jlblBienvenido.setText("BIENVENIDO");
        jPanel1.add(jlblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 240, 50));

        jlblIngresaCuenta.setFont(new java.awt.Font("Gotham", 0, 30)); // NOI18N
        jlblIngresaCuenta.setForeground(new java.awt.Color(202, 101, 0));
        jlblIngresaCuenta.setText("Ingresá a tu cuenta");
        jPanel1.add(jlblIngresaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 40));

        jbtnIngresar.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 140, 40));

        jbtnVaciar.setFont(new java.awt.Font("Gotham", 0, 18)); // NOI18N
        jbtnVaciar.setText("Vaciar");
        jbtnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVaciarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 140, 40));

        jpwdPassword.setBackground(new java.awt.Color(255, 255, 255));
        jpwdPassword.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        jpwdPassword.setForeground(new java.awt.Color(112, 53, 0));
        jPanel1.add(jpwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 330, 30));

        jtxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setFont(new java.awt.Font("Gotham", 0, 14)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(112, 53, 0));
        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 330, 330, 30));

        jlblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.jpg"))); // NOI18N
        jPanel1.add(jlblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        
        //SE HACE EL CÓDIGO DE CUANDO EL USUARIO PULSA "INGRESAR"
        String usuario = jtxtUsuario.getText(); //se guarda lo que digito el usuario en una variable
        String password = new String(jpwdPassword.getPassword());  //se guarda lo que digito el usuario en una variable
        intentos = intentos - 1;  //se le quita 1 intento
        if(this.intentos > 0){  //entra a hacer el login hasta que sea 0 = 0
            if(usuario.equals("a") && password.equals("123")){  //valida las creenciales
                this.setVisible(false); //se oculta la pantalla del login
                Menu_principal menu = new Menu_principal();  //se llama a la pantalla de menu principal (PROBANDO)
                menu.setVisible(true);  //se hace visible la pantalla del menu
                menu.setLocationRelativeTo(null); //se pone en el centro
            }else{
                JOptionPane.showMessageDialog(null,"Usuario/Contraseña incorrectos.","Tiene " + this.intentos + " intentos restantes.",JOptionPane.ERROR_MESSAGE); //credenciales incorrectas
            }
        }else{
            JOptionPane.showMessageDialog(null,"Se acabaron los intentos, vuelva a iniciar el Sistema.","Lo sentimos",JOptionPane.ERROR_MESSAGE);  //se acaban los 3 intentos
            System.exit(0);   //se sale del sistema
        }  
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private void jbtnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVaciarActionPerformed
        
        //SE ESTABLECE CUANDO EL USUARIO SELECCIONA VACIAR
        this.jtxtUsuario.setText("");
        this.jpwdPassword.setText("");
    }//GEN-LAST:event_jbtnVaciarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JButton jbtnVaciar;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblContrasena;
    private javax.swing.JLabel jlblErroUser;
    private javax.swing.JLabel jlblImagen;
    private javax.swing.JLabel jlblIngresaCuenta;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPasswordField jpwdPassword;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
