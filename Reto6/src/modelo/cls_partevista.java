
package modelo;

import java.time.LocalDate;

/**
 *
 * @author esteb
 */
public class cls_partevista {
    private int Parteid;
    private String Serial;
    private String Nombre;
    private String Marca;
    private String Modelo;
    private String Descripcion;
    private LocalDate FechaCompra;
    private int Garantia;
    private String SeriealEquipo;
    private String RazonSocial;

    public cls_partevista() {
    }

    public cls_partevista(int Parteid, String Serial, String Nombre, String Marca, String Modelo, String Descripcion, LocalDate FechaCompra, int Garantia, String SeriealEquipo, String RazonSocial) {
        this.Parteid = Parteid;
        this.Serial = Serial;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Descripcion = Descripcion;
        this.FechaCompra = FechaCompra;
        this.Garantia = Garantia;
        this.SeriealEquipo = SeriealEquipo;
        this.RazonSocial = RazonSocial;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
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

    public String getSeriealEquipo() {
        return SeriealEquipo;
    }

    public void setSeriealEquipo(String SeriealEquipo) {
        this.SeriealEquipo = SeriealEquipo;
    }
    
    
    
}
