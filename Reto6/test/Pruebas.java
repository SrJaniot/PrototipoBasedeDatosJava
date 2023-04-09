

import controlador.DAO;
import controlador.Filtros;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.cls_cuentadante;
import modelo.cls_equipo;
import modelo.cls_parte;
import modelo.cls_proveedor;
import modelo.cls_software;
import modelo.cls_ubicacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esteb
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    
    public void PruebavalidarCuenadanteOk (){
        Filtros filtro=new Filtros();
        cls_cuentadante cuentadante =new cls_cuentadante(1, "1254", "Esteban", "janiot", "e@gmail.com", "21332");
        boolean OK=filtro.ValidarCuentadante(cuentadante);
        assertTrue(OK);     
    }
    @Test
    
    public void PruebavalidarCuentadanteFalla(){
        Filtros filtro=new Filtros();
        cls_cuentadante cuentadante=new cls_cuentadante(1, "22", "e0s25", "256", "asdasdas", "4568as");
        boolean OK=filtro.ValidarCuentadante(cuentadante);
        assertFalse(OK);
    }
    
    @Test 
    public void PruevaValidarCrearCuentadanteOK(){
        DAO dao= new DAO();
        ArrayList <cls_cuentadante> lstCuentadante=dao.ListaCuentadante();
        int TamañoLista=lstCuentadante.size()+1;
        cls_cuentadante cnt=new cls_cuentadante("1004", "PRUEVA", "PRUEVA", "PRUEVA@PRUEVA", "00000");
        dao.CrearCuentadante(cnt);
        int TamañoLista2=dao.ListaCuentadante().size();
        assertEquals(TamañoLista, TamañoLista2);
        cls_cuentadante cue2=dao.BuscarCuentadante(cnt.getDocumento());
        dao.EliminarCuentadante(cue2);
        
        
        
        }
    
    @Test
    public void PruevaValidarBuscarCuentadanteOK(){
        Boolean OK=false;
        DAO dao=new DAO();
        cls_cuentadante cue=dao.BuscarCuentadante("1");
        if(cue!=null){
            OK=true;
        }
        assertTrue(OK); 
    }
    @Test 
    public void PruevaValidarActualizarCuentadanteOK(){
        DAO dao=new DAO();
        String Nombre="PASS";
        cls_cuentadante cuen=new cls_cuentadante("2002", "PRUEVA", "PRUEVA", "PRUEVA", "00000");
        dao.CrearCuentadante(cuen);
        cls_cuentadante cuen2=dao.BuscarCuentadante(cuen.getDocumento());
        cuen2.setNombre("PASS");
        dao.ActualizarCuentadante(cuen2);
        
        assertEquals(Nombre, dao.BuscarCuentadante(cuen2.getDocumento()).getNombre());
        dao.EliminarCuentadante(cuen2);
        
     
    }
    @Test 
    public void PruevaValidarEliminarCuentadanteOK(){
        DAO dao=new DAO();
        cls_cuentadante cuent=new cls_cuentadante("3001", "PRUEVA", "PRUEVA", "PREUVA@PRUEVA", "00000");
        dao.CrearCuentadante(cuent);
        cls_cuentadante cuent2=dao.BuscarCuentadante(cuent.getDocumento());
        dao.EliminarCuentadante(cuent2);
        cls_cuentadante cuent3=dao.BuscarCuentadante(cuent2.getDocumento());
        assertEquals(null, cuent3);
    }
 
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    @Test
    
    public void PruebavalidarUbicacionOk (){
        Filtros filtro=new Filtros();
        cls_ubicacion ubi=new cls_ubicacion(1, "Esteban", "a");
        boolean OK=filtro.ValidarUbicacion(ubi);
        assertTrue(OK);
    }
    @Test
     
    public void PruebavalidarUbicacionFalla (){
        Filtros filtro=new Filtros();
        cls_ubicacion ubi=new cls_ubicacion(1, "Esteb102an", "a");
        boolean OK=filtro.ValidarUbicacion(ubi);
        assertFalse(OK);
    }
    @Test 
    public void PruebaValidarCrearUbicacionOK(){
        DAO dao= new DAO();
        ArrayList <cls_ubicacion> lstUbicacion=dao.ListaUbicacion();
        int TamañoLista=lstUbicacion.size()+1;
        cls_ubicacion cnt=new cls_ubicacion("1001", "PRUEVB");
        dao.CrearUbicacion(cnt);
        int TamañoLista2=dao.ListaUbicacion().size();
        assertEquals(TamañoLista, TamañoLista2);
        cls_ubicacion cue2=dao.BuscarUbicacion(cnt.getNombre());
        dao.EliminarUbicacion(cue2);
        }
    @Test
    public void PruebaValidarBuscarUbicacionOK(){
        DAO dao=new DAO();
        boolean key=false;
        cls_ubicacion ubi=new cls_ubicacion("PUREBA", "PRUEBA");
        dao.CrearUbicacion(ubi);
        cls_ubicacion ubi2=dao.BuscarUbicacion(ubi.getNombre());
        if(ubi2!=null){
            key=true;
        }
        assertTrue(key);
        dao.EliminarUbicacion(ubi2);
        
    }
    @Test
    public void PruebaValidarEditarUbicacionOK(){
        DAO dao =new DAO();
        String Nombre="PASS";
        cls_ubicacion ubi=new cls_ubicacion("PUREBA", "PRUEBA");
        dao.CrearUbicacion(ubi);
        cls_ubicacion ubi2=dao.BuscarUbicacion(ubi.getNombre());
        ubi2.setNombre(Nombre);
        dao.ActualizarUbicacion(ubi2);
        cls_ubicacion ubi3=dao.BuscarUbicacion(ubi2.getNombre());
        assertEquals(Nombre, ubi3.getNombre());
        dao.EliminarUbicacion(ubi3);
    }
    @Test
    public void PruebaValidarEliminarUbicacionOK(){
        DAO dao =new DAO();
        cls_ubicacion ubi=new cls_ubicacion("PRUEBA", "PRUEBA");
        dao.CrearUbicacion(ubi);
        cls_ubicacion ubi2=dao.BuscarUbicacion(ubi.getNombre());
        dao.EliminarUbicacion(ubi2);
        cls_ubicacion ubi3=dao.BuscarUbicacion(ubi.getNombre());
        assertEquals(null, ubi3);
    }
    
  
    
    //--------------------------------------------------------------------------------------------------------------------------------
    
    @Test
    public void PruebavalidarProveedorOK (){
        Filtros filtro=new Filtros();
        cls_proveedor pro =new cls_proveedor(1, "15665", "a", "a", "5615161", "asdas@asda");
        boolean OK =filtro.ValidarProveedor(pro);
        assertTrue(OK);
    }
    
     @Test
    public void PruebavalidarProveedorFalla (){
        Filtros filtro=new Filtros();
        cls_proveedor pro =new cls_proveedor(1, "15665", "a", "a", "5615161", "asdasasda");
        boolean OK =filtro.ValidarProveedor(pro);
        assertFalse(OK);
    }
    
    @Test 
    public void PruebaValidarEquipoOK(){
        Filtros filtro =new Filtros();
        cls_equipo equ=new cls_equipo(1, "516351651", "a", "a", "a", LocalDate.now(), 1, "a", 1, 1, 1);
        boolean OK=filtro.ValidarEquipo(equ);
        assertTrue(OK);   
    }
    
    @Test 
    public void PruebaValidarEquipoFallida(){
        Filtros filtro =new Filtros();
        cls_equipo equ=new cls_equipo(1, "21", "a", "a", "a", LocalDate.now(), 1, "a", 1, 1, 1);
        boolean OK=filtro.ValidarEquipo(equ);
        assertFalse(OK);   
    }
    
    @Test
    public void PruevaValidarParteOK(){
        Filtros filtro=new Filtros();
        cls_parte parte=new cls_parte(1, "asdasda", "asdasd", "asdasd", "asdasd", "asdasd", LocalDate.now(), 1, 1, 1);
        boolean OK=filtro.ValidarParte(parte);
        assertTrue(OK); 
    }
    
    @Test
    public void PruevaValidarParteFallida(){
        Filtros filtro=new Filtros();
        cls_parte parte=new cls_parte(1, "a", "d", "asdasd", "asdasd", "asdasd", LocalDate.now(), 1, 1, 1);
        boolean OK=filtro.ValidarParte(parte);
        assertFalse(OK); 
     }
    
    @Test
    public void PruevaValidarSoftwareOK(){
        Filtros filtro=new Filtros();
        cls_software software=new cls_software(1, "asdaasd", "asdasdasd", "asdasda", 1, LocalDate.now(), 1, 1);
        boolean OK=filtro.ValidarSoftware(software);
        assertTrue(OK);
               
    }
    
    @Test
    public void PruevaValidarSoftwareFallida(){
        Filtros filtro=new Filtros();
        cls_software software=new cls_software(1, "a", "asdasdasd", "asdasda", 1, LocalDate.now(), 1, 1);
        boolean OK=filtro.ValidarSoftware(software);
        assertFalse(OK);
               
    }
    
    
    
    
    
     
    
     
    
    
    
     
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
