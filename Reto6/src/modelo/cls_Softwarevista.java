
package modelo;

import java.time.LocalDate;

/**
 *
 * @author esteb
 */
public class cls_Softwarevista {
    private int Softwareid;
    private String Nombre;
    private String Version;
    private String Instalacionkey;
    private int CantLicencias;
    private LocalDate Vigencia;
    private String Serial;
    private String RazonSocial;

    public cls_Softwarevista() {
    }

    public cls_Softwarevista(int Softwareid, String Nombre, String Version, String Instalacionkey, int CantLicencias, LocalDate Vigencia, String Serial, String RazonSocial) {
        this.Softwareid = Softwareid;
        this.Nombre = Nombre;
        this.Version = Version;
        this.Instalacionkey = Instalacionkey;
        this.CantLicencias = CantLicencias;
        this.Vigencia = Vigencia;
        this.Serial = Serial;
        this.RazonSocial = RazonSocial;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public int getSoftwareid() {
        return Softwareid;
    }

    public void setSoftwareid(int Softwareid) {
        this.Softwareid = Softwareid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getInstalacionkey() {
        return Instalacionkey;
    }

    public void setInstalacionkey(String Instalacionkey) {
        this.Instalacionkey = Instalacionkey;
    }

    public int getCantLicencias() {
        return CantLicencias;
    }

    public void setCantLicencias(int CantLicencias) {
        this.CantLicencias = CantLicencias;
    }

    public LocalDate getVigencia() {
        return Vigencia;
    }

    public void setVigencia(LocalDate Vigencia) {
        this.Vigencia = Vigencia;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }
    
    
    
}
