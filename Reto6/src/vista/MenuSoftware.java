
package vista;

import controlador.DAO;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.cls_Softwarevista;
import modelo.cls_equipovista;
import modelo.cls_proveedor;
import modelo.cls_software;


public class MenuSoftware extends javax.swing.JInternalFrame {
    DAO dao =new DAO();

    /**
     * Creates new form MenuSoftware
     */
    public MenuSoftware() {
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

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtVersion = new javax.swing.JTextField();
        txtInstalacionKEY = new javax.swing.JTextField();
        txtCantidadLicencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboDia = new javax.swing.JComboBox<>();
        comboMes = new javax.swing.JComboBox<>();
        comboAño = new javax.swing.JComboBox<>();
        comboEquipo = new javax.swing.JComboBox<>();
        comboProveedor = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID");

        txtID.setEditable(false);

        jLabel2.setText("Nombre");

        jLabel3.setText("Version");

        jLabel4.setText("InstalacionKEY");

        jLabel5.setText("CanidadLicencias");

        jLabel6.setText("Fecha");

        jLabel7.setText("Equipo");

        jLabel8.setText("Proveedor");

        jLabel9.setText("Dia");

        jLabel10.setText("Mes");

        jLabel11.setText("Año");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11))
                    .addComponent(txtID)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtVersion)
                    .addComponent(txtInstalacionKEY)
                    .addComponent(txtCantidadLicencia)
                    .addComponent(comboProveedor, 0, 281, Short.MAX_VALUE)
                    .addComponent(comboEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInstalacionKEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarcombobox();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        ArrayList <cls_equipovista> LstEquipo=dao.ListaEsquipo();
        ArrayList <cls_proveedor> Lstproveedor=dao.Listaproveedor();
        
        
        String Nombre=txtNombre.getText();
        String Version=txtVersion.getText();
        String InstalationKey=txtInstalacionKEY.getText();
        int CantLicencias=Integer.parseInt(txtCantidadLicencia.getText());
        LocalDate Vigencia=LocalDate.of(Integer.parseInt(comboAño.getSelectedItem().toString()),Integer.parseInt(comboMes.getSelectedItem().toString()),Integer.parseInt(comboDia.getSelectedItem().toString()));
        String SerialEquipo=comboEquipo.getSelectedItem().toString();
        String RazonSocial=comboProveedor.getSelectedItem().toString();
        int EquipoID=0;
        int ProveedorID=0;
        
        for (cls_equipovista equipo : LstEquipo) {
            if(equipo.getSerial().equals(SerialEquipo)){
                EquipoID=equipo.getEquipoid();
            }
            
        }
        for (cls_proveedor proveedor : Lstproveedor) {
            if(proveedor.getRazonsocial().equals(RazonSocial)){
                ProveedorID=proveedor.getProveedorid();
            }
            
        }
        
        cls_software software=new cls_software(Nombre, Version, InstalationKey, CantLicencias, Vigencia, EquipoID, ProveedorID);
        dao.CrearSoftware(software);
        Limpiar();
        
       
        
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String Nombre = txtNombre.getText();
        cls_Softwarevista software=dao.BuscarSoftware(Nombre);
        if(software!=null){
            txtID.setText(""+software.getSoftwareid());;
            txtNombre.setText(software.getNombre());
            txtVersion.setText(software.getVersion());
            txtInstalacionKEY.setText(software.getInstalacionkey());
            txtCantidadLicencia.setText(""+software.getCantLicencias());
            comboDia.setSelectedItem(""+software.getVigencia().getDayOfMonth());
            comboMes.setSelectedItem(""+software.getVigencia().getMonthValue());
            comboAño.setSelectedItem(""+software.getVigencia().getYear());
            comboEquipo.setSelectedItem(software.getSerial());
            comboProveedor.setSelectedItem(software.getRazonSocial());
            
            
        }else{
            JOptionPane.showMessageDialog(null, "no encontrado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        ArrayList <cls_equipovista> LstEquipo=dao.ListaEsquipo();
        ArrayList <cls_proveedor> Lstproveedor=dao.Listaproveedor();
        
        int ID=Integer.parseInt(txtID.getText());
        String Nombre=txtNombre.getText();
        String Version=txtVersion.getText();
        String InstalationKey=txtInstalacionKEY.getText();
        int CantLicencias=Integer.parseInt(txtCantidadLicencia.getText());
        LocalDate Vigencia=LocalDate.of(Integer.parseInt(comboAño.getSelectedItem().toString()),Integer.parseInt(comboMes.getSelectedItem().toString()),Integer.parseInt(comboDia.getSelectedItem().toString()));
        String SerialEquipo=comboEquipo.getSelectedItem().toString();
        String RazonSocial=comboProveedor.getSelectedItem().toString();
        int EquipoID=0;
        int ProveedorID=0;
        
        for (cls_equipovista equipo : LstEquipo) {
            if(equipo.getSerial().equals(SerialEquipo)){
                EquipoID=equipo.getEquipoid();
            }
            
        }
        for (cls_proveedor proveedor : Lstproveedor) {
            if(proveedor.getRazonsocial().equals(RazonSocial)){
                ProveedorID=proveedor.getProveedorid();
            }
            
        }
        
        cls_software software=new cls_software(ID, Nombre, Version, InstalationKey, CantLicencias, Vigencia, EquipoID, ProveedorID);
        dao.EditarSoftware(software);
        Limpiar();
        
       
     
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int ID =Integer.parseInt(txtID.getText());
        dao.EliminarSoftware(ID);
        Limpiar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void Limpiar (){
        txtCantidadLicencia.setText("");
        txtID.setText("");
        txtInstalacionKEY.setText("");
        txtNombre.setText("");
        txtVersion.setText("");
        
    }
    
    
    private void llenarcombobox (){
        ArrayList <cls_equipovista> LstEquipo=dao.ListaEsquipo();
        ArrayList <cls_proveedor> Lstproveedor=dao.Listaproveedor();
        LocalDate FechaActual=LocalDate.now();
        int año2010=2010;
        
        for (int i = 1; i < 32; i++) {
            comboDia.addItem(""+i);
            
        }
        for (int i = 1; i < 13; i++) {
            comboMes.addItem(""+i);
            
        }
        while (año2010<=FechaActual.getYear()){
            comboAño.addItem(""+año2010);
            año2010+=1;
        }
        
        for (cls_equipovista equ : LstEquipo) {
            comboEquipo.addItem(equ.getSerial());
            
            
        }
        for (cls_proveedor pro : Lstproveedor) {
            comboProveedor.addItem(pro.getRazonsocial());
           
            
        }
       
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboAño;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboEquipo;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantidadLicencia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInstalacionKEY;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVersion;
    // End of variables declaration//GEN-END:variables
}
