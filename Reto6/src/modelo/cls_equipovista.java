
package modelo;

import java.time.LocalDate;


public class cls_equipovista {
     private int Equipoid;
     private String Serial;
     private String Marca;
     private String Modelo;
     private String Tipo;
     private LocalDate Fechacompra;
     private int Garantia;
     private String Clasificacion;
     private String Cuentadante;
     private String Ubicacion;
     private String Proveedor;

    public cls_equipovista() {
    }

    public cls_equipovista(int Equipoid, String Serial, String Marca, String Modelo, String Tipo, LocalDate Fechacompra, int Garantia, String Clasificacion, String Cuentadante, String Ubicacion, String Proveedor) {
        this.Equipoid = Equipoid;
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.Fechacompra = Fechacompra;
        this.Garantia = Garantia;
        this.Clasificacion = Clasificacion;
        this.Cuentadante = Cuentadante;
        this.Ubicacion = Ubicacion;
        this.Proveedor = Proveedor;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getEquipoid() {
        return Equipoid;
    }

    public void setEquipoid(int Equipoid) {
        this.Equipoid = Equipoid;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public LocalDate getFechacompra() {
        return Fechacompra;
    }

    public void setFechacompra(LocalDate Fechacompra) {
        this.Fechacompra = Fechacompra;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getCuentadante() {
        return Cuentadante;
    }

    public void setCuentadante(String Cuentadante) {
        this.Cuentadante = Cuentadante;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
     
    
    
    
    
    
    
}
