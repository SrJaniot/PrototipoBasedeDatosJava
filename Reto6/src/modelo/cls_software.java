
package modelo;

import java.time.LocalDate;



public class cls_software {
    private int Softwareid;
    private String Nombre;
    private String Version;
    private String Instalacionkey;
    private int CantLicencias;
    private LocalDate Vigencia;
    private int Equipoid;
    private int Provedorid;

    public cls_software() {
    }

    public cls_software(int Softwareid, String Nombre, String Version, String Instalacionkey, int CantLicencias, LocalDate Vigencia, int Equipoid, int Provedorid) {
        this.Softwareid = Softwareid;
        this.Nombre = Nombre;
        this.Version = Version;
        this.Instalacionkey = Instalacionkey;
        this.CantLicencias = CantLicencias;
        this.Vigencia = Vigencia;
        this.Equipoid = Equipoid;
        this.Provedorid = Provedorid;
    }

    public cls_software(String Nombre, String Version, String Instalacionkey, int CantLicencias, LocalDate Vigencia, int Equipoid, int Provedorid) {
        this.Nombre = Nombre;
        this.Version = Version;
        this.Instalacionkey = Instalacionkey;
        this.CantLicencias = CantLicencias;
        this.Vigencia = Vigencia;
        this.Equipoid = Equipoid;
        this.Provedorid = Provedorid;
    }
    

    public int getProvedorid() {
        return Provedorid;
    }

    public void setProvedorid(int Provedorid) {
        this.Provedorid = Provedorid;
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

    public int getEquipoid() {
        return Equipoid;
    }

    public void setEquipoid(int Equipoid) {
        this.Equipoid = Equipoid;
    }
    
    
    
    
    
    
}
