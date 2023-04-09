
package controlador;

import modelo.cls_cuentadante;
import modelo.cls_equipo;
import modelo.cls_parte;
import modelo.cls_proveedor;
import modelo.cls_software;
import modelo.cls_ubicacion;

/**
 *
 * @author esteb
 */
public class Filtros {

    public Filtros() {
    }
    
    
    
    
    public boolean ValidarCuentadante (cls_cuentadante cue){
        String Nombre=cue.getNombre();
        String Apellido=cue.getApellido();
        String Correo=cue.getCorreo();
        String Celular=cue.getCelular();
        String Documento=cue.getDocumento();
 
        
        boolean Resultado=false;
        boolean NombretieneNumero=TienenumeroSTR(Nombre);
        boolean ApellidotieneNumero=TienenumeroSTR(Apellido);
        boolean CorreoTienearroba=TieneArrobaSTR(Correo);
        boolean CelularTieneletra=TieneletraSTR(Celular);

        
        if ((Documento.length()>3 )&&!(NombretieneNumero)&&!(ApellidotieneNumero)&&CorreoTienearroba&&!(CelularTieneletra)){
            Resultado=true;
            
        }

        return Resultado;
    }
    public boolean ValidarUbicacion (cls_ubicacion ubi){
        boolean key=false;
        int ubicacionID=ubi.getUbicacionid();
        String Nombre=ubi.getNombre();
        String Descripcion=ubi.getDescripcion();
        
        boolean TienenumeroNombre=TienenumeroSTR(Nombre);
        
        if(!TienenumeroNombre){
            key=true;
            
        }
   

        return key;
    }
    public boolean ValidarProveedor (cls_proveedor pro){
        boolean key =false;
        String nit=pro.getNit();
        String Telefono=pro.getTelefono();
        String Email=pro.getEmail();
        
        boolean TieneletraNit=TieneletraSTR(nit);
        boolean TieneLetraNumero=TieneletraSTR(Telefono);
        boolean TienearrobaEmail=TieneArrobaSTR(Email);
        
        if(!(TieneletraNit)&&!(TieneLetraNumero)&&TienearrobaEmail){
            key=true;
        }
        
        
        
        
        return key;
    }
    public boolean ValidarEquipo (cls_equipo equ){
        boolean key=false;
        if(equ.getSerial().length()>4){
            key=true;
        }
            
        
        
        
        
        return key;
    }
    public boolean ValidarParte (cls_parte prt){
        boolean key=false;
        String Serial=prt.getSerial();
        String Nombre=prt.getSerial();
        
        if(Serial.length()>3 && Nombre.length()>3){
            key=true;
        }
        
        
        
        
        
        
        
        return key;
    }
    public boolean ValidarSoftware (cls_software sft){
        boolean key =false;
        String Nombre=sft.getNombre();
        
        if (Nombre.length()>3){
            key=true;
        }
        
        
        
        return key;
    }
    
    
    
    
    
 //------------------------------------------------------------------------------------------------------------------
    
    private boolean TienenumeroSTR(String str){
        boolean key=false;
        
        for (int i = 0; i < str.length(); i++) {
            char x=str.charAt(i);
            if(Character.isDigit(x)){
                key=true;
                return key; 
            }
            
        }
        
        
        return key;
        
    }
    private boolean TieneletraSTR(String str){
        boolean key=false;
        
        for (int i = 0; i < str.length(); i++) {
            char x=str.charAt(i);
            if(Character.isLetter(x)){
                key=true;
                return key; 
            }
            
            
            
        }
        
        
        return key;
    
    }
    private boolean TieneArrobaSTR(String str){
        boolean key=false;
        
        for (int i = 0; i < str.length(); i++) {
            char x=str.charAt(i);
            if(x=='@'){
                key=true;
                return key; 
            }
            
            
            
        }
        
        
        return key;
        
    }
    
    
    
    
    
    
    

    
}
