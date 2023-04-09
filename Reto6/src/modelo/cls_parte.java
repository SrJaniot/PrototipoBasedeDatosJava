
package modelo;

import java.time.LocalDate;


public class cls_parte {
    private int Parteid;
    private String Serial;
    private String Nombre;
    private String Marca;
    private String Modelo;
    private String Descripcion;
    private LocalDate FechaCompra;
    private int Garantia;
    private int Equipoid;
    private int Provedorid;

    public cls_parte() {
    }

    public cls_parte(int Parteid, String Serial, String Nombre, String Marca, String Modelo, String Descripcion, LocalDate FechaCompra, int Garantia, int Equipoid, int Provedorid) {
        this.Parteid = Parteid;
        this.Serial = Serial;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Descripcion = Descripcion;
        this.FechaCompra = FechaCompra;
        this.Garantia = Garantia;
        this.Equipoid = Equipoid;
        this.Provedorid = Provedorid;
    }

    public cls_parte(String Serial, String Nombre, String Marca, String Modelo, String Descripcion, LocalDate FechaCompra, int Garantia, int Equipoid, int Provedorid) {
        this.Serial = Serial;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Descripcion = Descripcion;
        this.FechaCompra = FechaCompra;
        this.Garantia = Garantia;
        this.Equipoid = Equipoid;
        this.Provedorid = Provedorid;
    }
    
    

    public int getProvedorid() {
        return Provedorid;
    }

    public void setProvedorid(int Provedorid) {
        this.Provedorid = Provedorid;
    }

    public int getParteid() {
        return Parteid;
    }

    public void setParteid(int Parteid) {
        this.Parteid = Parteid;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LocalDate getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(LocalDate FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

    public int getEquipoid() {
        return Equipoid;
    }

    public void setEquipoid(int Equipoid) {
        this.Equipoid = Equipoid;
    }
    

    
    
    
    
    
    
    
}
