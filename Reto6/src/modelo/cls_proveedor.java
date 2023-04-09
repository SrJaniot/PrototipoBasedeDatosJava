
package modelo;


public class cls_proveedor {
    private int Proveedorid;
    private String Nit;
    private String Razonsocial;
    private String Direccion;
    private String Telefono;
    private String Email;

    public cls_proveedor() {
    }

    public cls_proveedor(int Proveedorid, String Nit, String Razonsocial, String Direccion, String Telefono, String Email) {
        this.Proveedorid = Proveedorid;
        this.Nit = Nit;
        this.Razonsocial = Razonsocial;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public cls_proveedor(String Nit, String Razonsocial, String Direccion, String Telefono, String Email) {
        this.Nit = Nit;
        this.Razonsocial = Razonsocial;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }
    
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getProveedorid() {
        return Proveedorid;
    }

    public void setProveedorid(int Proveedorid) {
        this.Proveedorid = Proveedorid;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getRazonsocial() {
        return Razonsocial;
    }

    public void setRazonsocial(String Razonsocial) {
        this.Razonsocial = Razonsocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
     
    
    
    
}
