
package modelo;

import java.time.LocalDate;


public class cls_equipo {
    private int Equipoid;
    private String Serial;
    private String Marca;
    private String Modelo;
    private String Tipo;
    private LocalDate Fechacompra;
    private int Garantia;
    private String Clasificacion;
    private int Cuentadanteid;
    private int Ubicacionid;
    private int Proveedorid;

    public cls_equipo() {
    }

    public cls_equipo(int Equipoid, String Serial, String Marca, String Modelo, String Tipo, LocalDate Fechacompra, int Garantia, String Clasificacion, int Cuentadanteid, int Ubicacionid, int Proveedorid) {
        this.Equipoid = Equipoid;
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.Fechacompra = Fechacompra;
        this.Garantia = Garantia;
        this.Clasificacion = Clasificacion;
        this.Cuentadanteid = Cuentadanteid;
        this.Ubicacionid = Ubicacionid;
        this.Proveedorid = Proveedorid;
    }

    public cls_equipo(String Serial, String Marca, String Modelo, String Tipo, LocalDate Fechacompra, int Garantia, String Clasificacion, int Cuentadanteid, int Ubicacionid, int Proveedorid) {
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.Fechacompra = Fechacompra;
        this.Garantia = Garantia;
        this.Clasificacion = Clasificacion;
        this.Cuentadanteid = Cuentadanteid;
        this.Ubicacionid = Ubicacionid;
        this.Proveedorid = Proveedorid;
    }
    
    
    
    

    public int getProveedorid() {
        return Proveedorid;
    }

    public void setProveedorid(int Proveedorid) {
        this.Proveedorid = Proveedorid;
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

    public int getCuentadanteid() {
        return Cuentadanteid;
    }

    public void setCuentadanteid(int Cuentadanteid) {
        this.Cuentadanteid = Cuentadanteid;
    }

    public int getUbicacionid() {
        return Ubicacionid;
    }

    public void setUbicacionid(int Ubicacionid) {
        this.Ubicacionid = Ubicacionid;
    }
    
    
    
    
    
    
    
}
