
package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.cls_Softwarevista;
import modelo.cls_cuentadante;
import modelo.cls_equipo;
import modelo.cls_equipovista;
import modelo.cls_parte;
import modelo.cls_partevista;
import modelo.cls_proveedor;
import modelo.cls_software;
import modelo.cls_ubicacion;






public class DAO extends conexion{
    private conexion cn;

    public DAO() {
        this.cn=new conexion();
    }
    //fUNCIONES DE TRADUCCION.
    
    //esta funcion ejecutar solamente sirve para acciones que editen la base de datos es decir INSERT, UPDATE, DELETE.
     private void EjecutarIUD(String sql){
         try{
             con=this.cn.getConnection();
             ps=con.prepareStatement(sql);
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "Exito");
             
             
             
             
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
             
             
         }
               
         
     }
     
    
    
    //-----------------------------------------------------------------------------------------------------------------------
     
    public void CrearUbicacion(cls_ubicacion ubi){
        String insert="INSERT INTO `ubicacion`( `NombreUbicacion`, `Descripcion`) VALUES ('"+ubi.getNombre()+"',"
                + "'"+ubi.getDescripcion()+"')";
        EjecutarIUD(insert);
        JOptionPane.showMessageDialog(null, "Ubicacion Creada ");
    }
    public void ActualizarUbicacion(cls_ubicacion ubi){
        String Update="UPDATE `ubicacion` SET `NombreUbicacion`='"+ubi.getNombre()+"',`Descripcion`='"+ubi.getDescripcion()+"' WHERE UbicacionID="+ubi.getUbicacionid()+" ";
        EjecutarIUD(Update);
        JOptionPane.showMessageDialog(null, "Ubicacion Actualizada");
    }
    public void EliminarUbicacion(cls_ubicacion ubi){
        String Delete="DELETE FROM `ubicacion` WHERE UbicacionID="+ubi.getUbicacionid()+"  ";
        EjecutarIUD(Delete);
        JOptionPane.showMessageDialog(null, "Ubicacion Eliminada"); 
    }    
    public cls_ubicacion BuscarUbicacion(String Nombre){
        cls_ubicacion ubicacion=null;
        String SELECT="SELECT `UbicacionID`, `NombreUbicacion`, `Descripcion` FROM `ubicacion` WHERE NombreUbicacion='"+Nombre+"'";
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            
            if(rs.next()){
                
                int Id=rs.getInt("UbicacionID");
                String name =rs.getString("NombreUbicacion");
                String Descripcion=rs.getString("Descripcion");
                ubicacion=new cls_ubicacion(Id, name, Descripcion);
                
                return ubicacion;
                
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra en la base de datos");
            }
            
            
            
            
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, E.getMessage());
        }
        
        
        
        
        
        
        return ubicacion;
        
    }
    
    public ArrayList <cls_ubicacion> ListaUbicacion (){
        ArrayList <cls_ubicacion> lstUbicacion=new ArrayList<>();
        cls_ubicacion ubicacion=null;
        String SELECT ="SELECT * FROM `ubicacion` ";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            
            while (rs.next()){
                int Id=rs.getInt("UbicacionID");
                String Nombre=rs.getString("NombreUbicacion");
                String Descripcion=rs.getString("Descripcion");
                ubicacion= new cls_ubicacion(Id, Nombre, Descripcion);
                lstUbicacion.add(ubicacion);
            }
  
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, E.getMessage());
        }
        
        return lstUbicacion;
        
       
       
    }
    //----------------------------------------------------------------------------------------------------------------------------------
    
  
    public void CrearCuentadante(cls_cuentadante cue){
    String INSERT ="INSERT INTO `cuentadante`( `Documento`, `NombreCuentadante`, `Apellido`, `Correo`,"
            + " `Celular`) VALUES ('"+cue.getDocumento()+"','"+cue.getNombre()+"',"
            + "'"+cue.getApellido()+"','"+cue.getCorreo()+"','"+cue.getCelular()+"') ";
        EjecutarIUD(INSERT);
        JOptionPane.showMessageDialog(null, "Cuentadante creado");
    }
    public void ActualizarCuentadante (cls_cuentadante cue){
        String UPDATE=" UPDATE `cuentadante` SET `Documento`='"+cue.getDocumento()+"',`NombreCuentadante`='"+cue.getNombre()+"',`Apellido`='"+cue.getApellido()+"',`Correo`='"+cue.getCorreo()+"',`Celular`='"+cue.getCelular()+"' WHERE CuentadanteID ="+cue.getCuentadanteid()+"     ";
        EjecutarIUD(UPDATE);
        JOptionPane.showMessageDialog(null, "Cuentadante Actualizado");
    }
    public void EliminarCuentadante (cls_cuentadante cue){
        String DELETE ="DELETE FROM `cuentadante` WHERE CuentadanteID="+cue.getCuentadanteid()+"            ";
        EjecutarIUD(DELETE);
        JOptionPane.showMessageDialog(null, "cuentadante Eliminado");
        
    }
    public cls_cuentadante BuscarCuentadante(String Doc){
        cls_cuentadante cuentadante=null;
        String SELECT =" SELECT `CuentadanteID`, `Documento`, `NombreCuentadante`, `Apellido`, `Correo`, `Celular` FROM `cuentadante` WHERE Documento='"+Doc+"'";
        
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            if(rs.next()){
                int ID=rs.getInt("CuentadanteID");
                String Documento=rs.getString("Documento");
                String Nombre=rs.getString("NombreCuentadante");
                String Apellido=rs.getString("Apellido");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                cuentadante=new cls_cuentadante(ID, Documento, Nombre, Apellido, Correo, Celular);
                return cuentadante;
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro en la base de datos ");
            }
               
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, E.getMessage());
        }

        return cuentadante;
    }
    
    public ArrayList <cls_cuentadante> ListaCuentadante(){
        ArrayList <cls_cuentadante> lstCuentadante=new ArrayList<>();
        cls_cuentadante cuentadante =null;
        String SELECT=" SELECT * FROM `cuentadante`";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            
            while (rs.next()){
                int Id=rs.getInt("CuentadanteID");
                String Documento=rs.getString("Documento");
                String Nombre=rs.getString("NombreCuentadante");
                String Apellido=rs.getString("Apellido");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                cuentadante=new cls_cuentadante(Id, Documento, Nombre, Apellido, Correo, Celular);
                lstCuentadante.add(cuentadante);
     
            }
            
            
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, E.getMessage());
        }
        
 
       return lstCuentadante; 
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public void CrearProveedor(cls_proveedor pro){
        String INSERT ="  INSERT INTO `proveedor`( `Nit`, `RazonSocial`, `Direccion`, `Telefono`,"
                + " `Email`) VALUES ('"+pro.getNit()+"','"+pro.getRazonsocial()+"','"+pro.getDireccion()+"','"+pro.getTelefono()+"','"+pro.getEmail()+"')";
        EjecutarIUD(INSERT);
        JOptionPane.showMessageDialog(null, "Proveedor Creado");
        
    }
    public void ActualizarProveedor(cls_proveedor pro){
        String UPDATE ="UPDATE `proveedor` SET `Nit`='"+pro.getNit()+"',`RazonSocial`='"+pro.getRazonsocial()+"',"
                + "`Direccion`='"+pro.getDireccion()+"',`Telefono`='"+pro.getTelefono()+"',`Email`='"+pro.getEmail()+"' WHERE ProveedorID="+pro.getProveedorid()+"";
        EjecutarIUD(UPDATE);
        JOptionPane.showMessageDialog(null, "Proveedor Actualizado"); 
    }
    public void EliminarProveedor(String Nit){
        String DELETE =" DELETE FROM `proveedor` WHERE Nit='"+Nit+"'   ";
        EjecutarIUD(DELETE);
        JOptionPane.showMessageDialog(null, "Proveedor Eliminado ");
        
    }
    public cls_proveedor BuscarProveedor (String nit){
        cls_proveedor proveedor =null;
        
        String SELECT ="  SELECT `ProveedorID`, `Nit`, `RazonSocial`, `Direccion`, `Telefono`, `Email` FROM `proveedor` WHERE Nit= '"+nit+"'";
        
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            
            if (rs.next()){
                int ID=rs.getInt("ProveedorID");
                String Nit=rs.getString("Nit");
                String RazonSocial=rs.getString("RazonSocial");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Email=rs.getString("Email");
                
                proveedor=new cls_proveedor(ID, Nit, RazonSocial, Direccion, Telefono, Email);
                
                return proveedor;
            }
        }catch (Exception E){
            JOptionPane.showMessageDialog(null , E.getMessage());
            
        }
        return proveedor; 
        
    }
    
    public ArrayList <cls_proveedor> Listaproveedor(){
        ArrayList <cls_proveedor> lstproveedor=new ArrayList<>();
        cls_proveedor proveedor=null;
        String SELECT=" SELECT * FROM `proveedor`   ";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            while(rs.next()){
                int ID=rs.getInt("ProveedorID");
                String Nit=rs.getString("Nit");
                String RazonSocial=rs.getString("RazonSocial");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Email=rs.getString("Email");
                proveedor=new cls_proveedor(ID, Nit, RazonSocial, Direccion, Telefono, Email);
                lstproveedor.add(proveedor);  
            }
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, E.getMessage());
            
        }
        return lstproveedor;
    }
    
   
    
    //--------------------------------------------------------------------------------------------------------------------------

    public void CrearEquipo (cls_equipo  equ){
        String INSERT=" INSERT INTO `equipo`( `Serial`, `Marca`, `Modelo`, `Tipo`, `fecha`, `Garantia`, `Clasificacion`, `CuentadanteID`, `UbicacionID`, `ProveedorID`) VALUES ('"+equ.getSerial()+"','"+equ.getMarca()+"','"+equ.getModelo()+"','"+equ.getTipo()+"','"+equ.getFechacompra()+"','"+equ.getGarantia()+"','"+equ.getClasificacion()+"','"+equ.getCuentadanteid()+"','"+equ.getUbicacionid()+"','"+equ.getProveedorid()+"')   " ;
        EjecutarIUD(INSERT);
        JOptionPane.showMessageDialog(null, "Equipo creado");

    }
    public void ActualizarEquipo (cls_equipo equ){
        String UPDATE=" UPDATE `equipo` SET `Serial`='"+equ.getSerial()+"',`Marca`='"+equ.getMarca()+"',`Modelo`='"+equ.getModelo()+"',`Tipo`='"+equ.getTipo()+"',`fecha`='"+equ.getFechacompra()+"',`Garantia`='"+equ.getGarantia()+"',`Clasificacion`='"+equ.getClasificacion()+"',`CuentadanteID`='"+equ.getCuentadanteid()+"',`UbicacionID`='"+equ.getUbicacionid()+"',`ProveedorID`='"+equ.getProveedorid()+"' WHERE EquipoID='"+equ.getEquipoid()+"'     ";
        EjecutarIUD(UPDATE);
        JOptionPane.showMessageDialog(null, "Equipo actualizado");



    }
    public void EliminarEquipo (cls_equipo equ){
        String DELETE=" DELETE FROM `equipo` WHERE EquipoID='"+equ.getEquipoid()+"'   ";
        EjecutarIUD(DELETE);
        JOptionPane.showMessageDialog(null, "Equipo Eliminado ");

    }

    public cls_equipovista BuscarEquipo (String Serial){
        cls_equipovista equipo =null;
        String SELECT =" SELECT `EquipoID`, `Serial`, `Marca`, `Modelo`, `Tipo`, `fecha`, `Garantia`, `Clasificacion`, `NombreCuentadante`, `NombreUbicacion`, `RazonSocial` \n" +
                        "FROM `equipo` \n" +
                        "INNER JOIN cuentadante\n" +
                        "ON equipo.CuentadanteID=cuentadante.CuentadanteID\n" +
                        "INNER JOIN ubicacion\n" +
                        "on equipo.UbicacionID=ubicacion.UbicacionID\n" +
                        "INNER JOIN proveedor\n" +
                        "ON equipo.ProveedorID=proveedor.ProveedorID\n" +
                        "WHERE Serial='"+Serial+"'   ";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            if(rs.next()){
                int ID=rs.getInt("EquipoID");
                String serial=rs.getString("Serial");
                String Marca=rs.getString("Marca");
                String Modelo=rs.getString("Modelo");
                String Tipo=rs.getString("Tipo");
                LocalDate fecha=LocalDate.parse(rs.getString("fecha"));
                int Garantia=rs.getInt("Garantia");
                String Clasificacion=rs.getString("Clasificacion");
                String NombreCuentadante=rs.getString("NombreCuentadante");
                String NombreUbicacion=rs.getString("NombreUbicacion");
                String RazonSocial=rs.getString("RazonSocial");

                equipo=new cls_equipovista(ID, serial, Marca, Modelo, Tipo, fecha, Garantia, Clasificacion, NombreCuentadante, NombreUbicacion, RazonSocial);

            }else{
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
            }

        }catch(Exception E){
            JOptionPane.showMessageDialog(null, E.getMessage());
        }

        return equipo;
    }
    public ArrayList <cls_equipovista>  ListaEsquipo (){
        cls_equipovista equipo=null;
        ArrayList <cls_equipovista> ListaEquipo=new ArrayList<>();


        String SELECT=" SELECT *\n" +
                    "FROM `equipo`\n" +
                    "INNER JOIN cuentadante\n" +
                    "on equipo.CuentadanteID=cuentadante.CuentadanteID\n" +
                    "INNER JOIN proveedor\n" +
                    "on equipo.ProveedorID=proveedor.ProveedorID\n" +
                    "INNER JOIN ubicacion\n" +
                    "ON equipo.UbicacionID=ubicacion.UbicacionID ";

        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            while (rs.next()){
                int EquipoID=rs.getInt("EquipoID");
                String Serial=rs.getString("Serial");
                String Marca=rs.getString("Marca");
                String Modelo=rs.getString("Modelo");
                String Tipo=rs.getString("Tipo");
                LocalDate fecha=LocalDate.parse(rs.getString("fecha"));
                int Garantia=rs.getInt("Garantia");
                String Clasificacion=rs.getString("Clasificacion");
                String Cuentadante=rs.getString("NombreCuentadante");
                String Ubicacion=rs.getString("NombreUbicacion");
                String Proveedor=rs.getString("RazonSocial");

                equipo=new cls_equipovista(EquipoID, Serial, Marca, Modelo, Tipo, fecha, Garantia, Clasificacion, Cuentadante, Ubicacion, Proveedor);
                ListaEquipo.add(equipo);

            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }






        return ListaEquipo;

    }

    //--------------------------------------------------------------------------------------------------------------------------------------

    public void CrearParte (cls_parte prt){
        String INSERT="  INSERT INTO `parte`( `Serialparte`, `Nombreparte`,"
                + " `Marcaparte`, `Modeloparte`, `Descripcionparte`,"
                + " `FechaCompraparte`, `Garantiaparte`, `EquipoID`,"
                + " `ProveedorID`) VALUES ('"+prt.getSerial()+"','"+prt.getNombre()+"',"
                + "'"+prt.getMarca()+"','"+prt.getModelo()+"','"+prt.getDescripcion()+"','"+prt.getFechaCompra()+"',"
                + "'"+prt.getGarantia()+"','"+prt.getEquipoid()+"','"+prt.getProvedorid()+"')   ";
        EjecutarIUD(INSERT);
        JOptionPane.showMessageDialog(null, "Parte Creada");
        
        
    }
    public void ActualizarParte (cls_parte prt){
        String UPDATE=" UPDATE `parte` SET `Serialparte`='"+prt.getSerial()+"',`Nombreparte`='"+prt.getNombre()+"',"
                + "`Marcaparte`='"+prt.getMarca()+"',`Modeloparte`='"+prt.getModelo()+"',"
                + "`Descripcionparte`='"+prt.getDescripcion()+"',`FechaCompraparte`='"+prt.getFechaCompra()+"',"
                + "`Garantiaparte`='"+prt.getGarantia()+"',`EquipoID`='"+prt.getEquipoid()+"',"
                + "`ProveedorID`='"+prt.getProvedorid()+"' WHERE ParteID='"+prt.getParteid()+"'   ";
        EjecutarIUD(UPDATE);
        JOptionPane.showMessageDialog(null, "Parte Actualizada");
        
        
    }
    public void EliminarParte(String Serial){
        String DELETE=" DELETE FROM `parte` WHERE Serialparte= '"+Serial+"'  ";
        EjecutarIUD(DELETE);
        JOptionPane.showMessageDialog(null, "Parte Eliminada");
        
    }
    
    public cls_partevista BuscarParte (String serial){     
        cls_partevista parte=null;
        String SELECT ="  SELECT `ParteID`, `Serialparte`, `Nombreparte`, `Marcaparte`, `Modeloparte`, `Descripcionparte`, `FechaCompraparte`, `Garantiaparte`, `Serial`, `RazonSocial` \n" +
                        "FROM `parte`\n" +
                        "INNER JOIN equipo\n" +
                        "ON parte.EquipoID=equipo.EquipoID\n" +
                        "INNER JOIN proveedor\n" +
                        "ON parte.ProveedorID=proveedor.ProveedorID\n" +
                        "WHERE parte.Serialparte= '"+serial+"' ";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            if (rs.next()){
                int ParteID=rs.getInt("ParteID");
                String Serieal=rs.getString("Serialparte");
                String Nombre=rs.getString("Nombreparte");
                String Marca=rs.getString("Marcaparte");
                String Modelo=rs.getString("Modeloparte");
                String Descripcion=rs.getString("Descripcionparte");
                LocalDate Fechacompra=LocalDate.parse(rs.getString("FechaCompraparte"));
                int Garantia=rs.getInt("GarantiaParte");
                String serialEquipo=rs.getString("Serial");
                String RazonSocial=rs.getString("RazonSocial");
                
                parte=new cls_partevista(ParteID, Serieal, Nombre, Marca, Modelo, Descripcion, Fechacompra, Garantia, serialEquipo, RazonSocial);
                
                
                
                
                
                
                
                
            }else{
               JOptionPane.showMessageDialog(null, "No esta en la base de datos ");
               
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return parte; 
    }
    public ArrayList <cls_partevista> Lstparte (){
        ArrayList <cls_partevista> LstParte=new ArrayList<>();
        cls_partevista parte=null;
        String SELECT="  SELECT * FROM `parte` \n" +
                "INNER JOIN equipo\n" +
                "ON parte.EquipoID=equipo.EquipoID\n" +
                "INNER JOIN proveedor\n" +
                "ON parte.ProveedorID=proveedor.ProveedorID";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            while (rs.next()){
                int ParteID=rs.getInt("ParteID");
                String Serieal=rs.getString("Serialparte");
                String Nombre=rs.getString("Nombreparte");
                String Marca=rs.getString("Marcaparte");
                String Modelo=rs.getString("Modeloparte");
                String Descripcion=rs.getString("Descripcionparte");
                LocalDate Fechacompra=LocalDate.parse(rs.getString("FechaCompraparte"));
                int Garantia=rs.getInt("GarantiaParte");
                String serialEquipo=rs.getString("Serial");
                String RazonSocial=rs.getString("RazonSocial");
                
                parte=new cls_partevista(ParteID, Serieal, Nombre, Marca, Modelo, Descripcion, Fechacompra, Garantia, serialEquipo, RazonSocial);
                LstParte.add(parte);
                
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return LstParte;
    }
    
    //--------------------------------------------------------------------------------------------------------------------------------------
    
    public void CrearSoftware (cls_software sft){
        String INSERT =" INSERT INTO `software`( `NombreSoftware`, `VersioSoftware`, `InstalationKEYSoftware`,"
                + " `CantLicencias`, `VigenciaSoftware`, `EquipoID`,"
                + " `ProveedorID`) VALUES ('"+sft.getNombre()+"','"+sft.getVersion()+"','"+sft.getInstalacionkey()+"',"
                + "'"+sft.getCantLicencias()+"','"+sft.getVigencia()+"','"+sft.getEquipoid()+"','"+sft.getProvedorid()+"')  ";
        EjecutarIUD(INSERT);
        JOptionPane.showMessageDialog(null, "Software Creado");
    }
    public void EditarSoftware (cls_software sft){
        String UPDATE="UPDATE `software` SET `NombreSoftware`='"+sft.getNombre()+"',`VersioSoftware`='"+sft.getVersion()+"',"
                + "`InstalationKEYSoftware`='"+sft.getInstalacionkey()+"',`CantLicencias`='"+sft.getCantLicencias()+"',"
                + "`VigenciaSoftware`='"+sft.getVigencia()+"',`EquipoID`='"+sft.getEquipoid()+"',"
                + "`ProveedorID`='"+sft.getProvedorid()+"' WHERE SoftwareID= '"+sft.getSoftwareid()+"'  ";
        EjecutarIUD(UPDATE);
        JOptionPane.showMessageDialog(null, "Software Actualizado");
        
        
    }
    public void EliminarSoftware (int ID){
        String DELETE="  DELETE FROM `software` WHERE SoftwareID='"+ID+"'  ";
        EjecutarIUD(DELETE);
        JOptionPane.showMessageDialog(null, "Software Eliminado");
    }
    
    public cls_Softwarevista BuscarSoftware (String Nom){
        cls_Softwarevista software=null;
        String SELECT ="SELECT `SoftwareID`, `NombreSoftware`, `VersioSoftware`, `InstalationKEYSoftware`, `CantLicencias`, `VigenciaSoftware`, `Serial`, `RazonSocial` \n" +
                "FROM `software`\n" +
                "INNER JOIN equipo\n" +
                "ON software.EquipoID=equipo.EquipoID\n" +
                "INNER JOIN proveedor\n" +
                "ON software.ProveedorID=proveedor.ProveedorID\n" +
                "\n" +
                "\n" +
                "WHERE NombreSoftware ='"+Nom+"' ";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            if (rs.next()){
                int SoftwareID=rs.getInt("SoftwareID");
                String Nombre=rs.getString("NombreSoftware");
                String Version=rs.getString("VersioSoftware");
                String InstalationKey=rs.getString("InstalationKEYSoftware");
                int CantLicencias=rs.getInt("CantLicencias");
                LocalDate Vigencia=LocalDate.parse(rs.getString("VigenciaSoftware"));
                String Serial=rs.getString("Serial");
                String RazonSocial=rs.getString("RazonSocial");
                
                software=new cls_Softwarevista(SoftwareID, Nombre, Version, InstalationKey, CantLicencias, Vigencia, Serial, RazonSocial);
                
  
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        return software;
    }
    public ArrayList <cls_Softwarevista> ListaSoftware (){
        ArrayList <cls_Softwarevista> lstSoftware=new ArrayList<>();
        cls_Softwarevista software=null;
        String SELECT=" SELECT * FROM `software` \n" +
            "INNER JOIN equipo\n" +
            "ON software.EquipoID=equipo.EquipoID\n" +
            "INNER JOIN proveedor\n" +
            "ON software.ProveedorID=proveedor.ProveedorID  ";
        
         try{
            con=cn.getConnection();
            ps=con.prepareStatement(SELECT);
            rs=ps.executeQuery();
            while (rs.next()){
                int SoftwareID=rs.getInt("SoftwareID");
                String Nombre=rs.getString("NombreSoftware");
                String Version=rs.getString("VersioSoftware");
                String InstalationKey=rs.getString("InstalationKEYSoftware");
                int CantLicencias=rs.getInt("CantLicencias");
                LocalDate Vigencia=LocalDate.parse(rs.getString("VigenciaSoftware"));
                String Serial=rs.getString("Serial");
                String RazonSocial=rs.getString("RazonSocial");
                
                software=new cls_Softwarevista(SoftwareID, Nombre, Version, InstalationKey, CantLicencias, Vigencia, Serial, RazonSocial);
                lstSoftware.add(software);
  
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        return lstSoftware;
        
        
    }
    
    
    
    
    
  






}
