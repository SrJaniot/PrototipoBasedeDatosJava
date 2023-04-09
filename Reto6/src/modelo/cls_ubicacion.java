
package modelo;


public class cls_ubicacion {
    private int Ubicacionid;
    private String Nombre;
    private String Descripcion;

    public cls_ubicacion() {
    }

    public cls_ubicacion(int Ubicacionid, String Nombre, String Descripcion) {
        this.Ubicacionid = Ubicacionid;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public cls_ubicacion(String Nombre, String Descripcion) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }
    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getUbicacionid() {
        return Ubicacionid;
    }

    public void setUbicacionid(int Ubicacionid) {
        this.Ubicacionid = Ubicacionid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
            
    
}
