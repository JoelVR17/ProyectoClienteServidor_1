
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Annadir_producto extends javax.swing.JFrame {

    //jsadjsdjias
    
    //SE ESTABLECE EL ARRAYLIST
    ArrayList<Annadir_producto> array_ropa = new ArrayList<Annadir_producto>();
    
    //SE ESTABLECEN LOS ATRIBUTOS
    protected int precio;
    protected int cantidad;
    protected String americana_nueva;
    protected String fecha_ingreso;
    protected String categoria;
    protected String tipo_ropa;
    
    //SE ESTABLECE LOS GET AND SET
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAmericana_nueva() {
        return americana_nueva;
    }

    public void setAmericana_nueva(String americana_nueva) {
        this.americana_nueva = americana_nueva;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo_ropa() {
        return tipo_ropa;
    }

    public void setTipo_ropa(String tipo_ropa) {
        this.tipo_ropa = tipo_ropa;
    }

    public ArrayList<Annadir_producto> getArray_ropa() {
        return array_ropa;
    }

    public void setArray_ropa(ArrayList<Annadir_producto> array_ropa) {
        this.array_ropa = array_ropa;
    }
    
    //SE ESTABLECE EL CONSTRUCTOR
    public Annadir_producto(int precio, int cantidad, String americana_nueva, String fecha_ingreso, String categoria, String tipo_ropa) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.americana_nueva = americana_nueva;
        this.fecha_ingreso = fecha_ingreso;
        this.categoria = categoria;
        this.tipo_ropa = tipo_ropa;
        initComponents();
        this.jlblCheck.setVisible(false);
    }
    public Annadir_producto() {
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblPrecio = new javax.swing.JLabel();
        jlblCantidad = new javax.swing.JLabel();
        jlblFIngreso1 = new javax.swing.JLabel();
        jlblCategoria = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jtxtCantidad = new javax.swing.JTextField();
        jtxtIngreso = new javax.swing.JTextField();
        jtbnAtras = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jlblTipoR = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbTipoRopa = new javax.swing.JComboBox<>();
        jrbUsado = new javax.swing.JRadioButton();
        jrbNuevo = new javax.swing.JRadioButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEliminarTodo = new javax.swing.JButton();
        jlblCheck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblPrecio.setText("Precio");
        jPanel1.add(jlblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 41, -1));

        jlblCantidad.setText("Cantidad");
        jPanel1.add(jlblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 61, -1));

        jlblFIngreso1.setText("Fecha Ingreso");
        jPanel1.add(jlblFIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 86, -1));

        jlblCategoria.setText("Categoría");
        jPanel1.add(jlblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));
        jPanel1.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 202, 30));
        jPanel1.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 202, 30));
        jPanel1.add(jtxtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 202, 30));

        jtbnAtras.setText("Atrás");
        jtbnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jtbnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jlblTipoR.setText("Tipo Ropa");
        jPanel1.add(jlblTipoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisas", "Blusas", "Pantalones", "Capas", "Vestidos", "Joggers", "Abrigos", "Sábanas", "Pantalonetas", "Mamelucos" }));
        jPanel1.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 30));

        jcbTipoRopa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombres", "Mujeres", "Niños", "Niñas", "Bebés" }));
        jPanel1.add(jcbTipoRopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, -1));

        buttonGroup1.add(jrbUsado);
        jrbUsado.setText("Usado");
        jPanel1.add(jrbUsado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        buttonGroup1.add(jrbNuevo);
        jrbNuevo.setText("Nuevo");
        jPanel1.add(jrbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 100, -1));

        jbtnEliminarTodo.setText("Eliminar Datos");
        jbtnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, -1));

        jlblCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.jpg"))); // NOI18N
        jPanel1.add(jlblCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 130, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnAtrasActionPerformed
        
        //CUANDO EL USUARIO PRESIONA ATRAS
        this.setVisible(false); //se oculta la pantalla de agregar producto

    }//GEN-LAST:event_jtbnAtrasActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        
        //CUANDO EL USUARIO PRESIONA LIMPIAR
        this.jtxtCantidad.setText(""); //se borra la info del txt
        this.jtxtIngreso.setText(""); //se borra la info del txt
        this.jtxtPrecio.setText(""); //se borra la info del txt
        this.jlblCheck.setVisible(false);
        
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        
        //CUANDO EL USUARIO PRESIONA AGREGAR
        //SE EXTRAEN LOS VALORES DIGITADOS PARA GUARDARLOS EN VARIABLES
        if(this.jtxtCantidad.getText().equals("") || this.jtxtPrecio.getText().equals("") ||  this.jtxtIngreso.getText().equals("") ||
          (this.jrbUsado.isSelected() && this.jrbNuevo.isSelected())){  //se verifica si deja campos vacios
            JOptionPane.showMessageDialog(null, "Falta Información","¡Asegúrese de completar todo!",JOptionPane.ERROR_MESSAGE);
        }else{   //de lo contrario, guarda la infromacion
            
            //se guarda la informacion de lo que digita el usuario
            this.cantidad = Integer.parseInt(this.jtxtCantidad.getText());  
            this.precio = Integer.parseInt(this.jtxtPrecio.getText());
            this.fecha_ingreso = this.jtxtIngreso.getText();
            //se guarda la iformaciond de lo que seleccione el usuario
            categoria = (String)jcbCategoria.getSelectedItem();
            tipo_ropa = (String)jcbTipoRopa.getSelectedItem();
            //se guarda la informacion de lo que seleciionale usaurio
            this.americana_nueva = "";
            if(this.jrbUsado.isSelected()){
                this.americana_nueva = "Usada";
            }else if(this.jrbNuevo.isSelected()){
                this.americana_nueva = "Nueva";
            }
            array_ropa.add(new Annadir_producto(precio, cantidad, americana_nueva, fecha_ingreso, categoria, tipo_ropa));  //se guarda los datos en un arraylist
        }   
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        
        //CUANDO EL USUARIO PRECIOSA GUARDAR
        ArchivoRopa miarchivo = new ArchivoRopa();
        miarchivo.agregarLineasArchivo(array_ropa);
        this.jlblCheck.setVisible(true);
        array_ropa.clear();
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarTodoActionPerformed
        
        //CUANDO EL USUARIO PRECIOSA ELIMINAR DATOS
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Está seguro de borrar todos los datos de forma PERMANENTE?\n\n"
                                                                     + "1 - Continuar\n"
                                                                     + "2 - Atrás\n"
                                                                      ,"¡¡ALERTA!!",JOptionPane.WARNING_MESSAGE));
        switch(opcion){
            case 1: 
                ArchivoRopa miarchivo = new ArchivoRopa();
                miarchivo.borrar_archivo(array_ropa);
                JOptionPane.showMessageDialog(null,"¡!","Datos borrados exitosamente.",JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 2:
                
                break;
        }
        
    }//GEN-LAST:event_jbtnEliminarTodoActionPerformed

    //SE ESTABLECE EL ToSTRING
    @Override
    public String toString() {
        return "Precio : " + precio + "\nCantidad : " + cantidad + "\nTipo de Ropa : " + americana_nueva + "\nFecha de Ingreso : " + fecha_ingreso + "\nCategoria : " + categoria + "\nTipo de Ropa : " + tipo_ropa  ;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminarTodo;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbTipoRopa;
    private javax.swing.JLabel jlblCantidad;
    private javax.swing.JLabel jlblCategoria;
    private javax.swing.JLabel jlblCheck;
    private javax.swing.JLabel jlblFIngreso1;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JLabel jlblTipoR;
    private javax.swing.JRadioButton jrbNuevo;
    private javax.swing.JRadioButton jrbUsado;
    private javax.swing.JButton jtbnAtras;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtIngreso;
    private javax.swing.JTextField jtxtPrecio;
    // End of variables declaration//GEN-END:variables
}
