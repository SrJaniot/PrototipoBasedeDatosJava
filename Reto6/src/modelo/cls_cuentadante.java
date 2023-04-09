
package modelo;

public class cls_cuentadante {
   private int Cuentadanteid;
   private String Documento;
   private String Nombre;
   private String Apellido;
   private String Correo;
   private String Celular;

    public cls_cuentadante() {
    }

    public cls_cuentadante(int Cuentadanteid, String Documento, String Nombre, String Apellido, String Correo, String Celular) {
        this.Cuentadanteid = Cuentadanteid;
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Celular = Celular;
    }

    public cls_cuentadante(String Documento, String Nombre, String Apellido, String Correo, String Celular) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Celular = Celular;
    }
    
    
    
    
    
    
    

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public int getCuentadanteid() {
        return Cuentadanteid;
    }

    public void setCuentadanteid(int Cuentadanteid) {
        this.Cuentadanteid = Cuentadanteid;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    
    
    
    
    
   
   
   
   
   
   
   

   
    
    
}
