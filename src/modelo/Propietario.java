package modelo;

//-------importamos---------
import java.util.ArrayList;

//-----Declaro la clase-------------
public class Propietario {

//----creo los atributos--------
    private String nombreP;
    private String tipoDocumento;
    private String numeroDocumento;
    private String telefono;
    private String direccion;
    private String email;
    private ArrayList<Mascota> listaMascotas;
//................................................................................   
    //lista estatica que guarda todos los propietarios de las mascotas registradas
    public static ArrayList<Propietario> listaPropietarios = new ArrayList<>();
//................................................................................

//----Creo metodo constructor-------
    public Propietario(String nombreP, String tipoDocumento, String numeroDocumento, String telefono, String direccion, String email) {
        this.nombreP = nombreP;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        
        this.listaMascotas = new ArrayList<>();
    }

//----Creo getters and setters--------

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    
//.............................................................................

//-------------Metodo para Agregar Mascota-----------------
    public void agregarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }

//------------Creo metodo para no volver a guardar la misma mascota
//y lo creo aca porque el propietario contiene la lista de mascotas---------------
    public boolean existeMascota(String nombreMascota) {
    for (Mascota m : listaMascotas) {
        if (m.getNombreM().equalsIgnoreCase(nombreMascota)) {
            return true;
        }
    }
    return false;
}

    
//---------------Metodo para eliminar mascota---------------------------------------
   
public boolean eliminarMascotaPorNombre(String nombreMascota) {
    for (Mascota masco : listaMascotas) {
        if (masco.getNombreM().equalsIgnoreCase(nombreMascota)) {
            listaMascotas.remove(masco);
            return true; // Eliminacion exitosa
        }
    }
    return false; // No se encontro la mascota por lo tanto no se elimino
}

//---------------Metodo para editar mascota---------------------------------------
   
public boolean editarMascota(String nombreM, String especie, int edad, String raza, int peso) {
    for (Mascota masco : listaMascotas) {
        if (masco.getNombreM().equalsIgnoreCase(nombreM)) {
            masco.setEspecie(especie);
            masco.setEdad(edad);
            masco.setRaza(raza);
            masco.setPeso(peso);
            return true;
        }
    }
    return false;
}

//...............................................................................

//---creo metodo estatico para validar si existe un propietario por su nombre
public static boolean existePropietario(String nombreP) {
    for (Propietario p : listaPropietarios) {
        if (p.getNombreP().equalsIgnoreCase(nombreP)) {
            return true;
        }
    }
    return false;
}

//-------------------metodo de buscar propietario--------------------------
 public static Propietario buscarPropietario(String numeroDoc) {
        for (Propietario p : listaPropietarios) {
            if (p.getNumeroDocumento().equalsIgnoreCase(numeroDoc)) {
                return p;
            }
        }
        return null;
    }
 
//------------------metodo de registrar propietario----------------------
public static String registrarPropietario(Propietario propietario) {
        for (Propietario prop : listaPropietarios) {
            if (prop.getNumeroDocumento().equalsIgnoreCase(propietario.getNumeroDocumento())) {
                return "Ya existe un propietario con este documento";
            }
        }
        listaPropietarios.add(propietario);
        return null; // sin errores
    }

//----------------metodo de editar propietario---------------------------
 public static boolean editarPropietario(String nombreP, String tipoDocumento,
         String numeroDocumento, String telefono, String direccion, 
         String email) {
     
        for (Propietario propi : listaPropietarios) {
            
        //---Busco por tipo de documento y numero de documento---
        if (propi.getTipoDocumento().equalsIgnoreCase(tipoDocumento) &&
            propi.getNumeroDocumento().equalsIgnoreCase(numeroDocumento)) {
            
            //----Actualizo los datos-----
            propi.setNombreP(nombreP);
            propi.setTipoDocumento(tipoDocumento);
            propi.setTelefono(telefono);
            propi.setDireccion(direccion);
            propi.setEmail(email);

            return true;
        }
    }
    return false;
}
 
//---------metodo de eliminar propietario--------------------------------
 public static boolean eliminarPropietario(String tipoDocumento, String numeroDocumento) {
    for (Propietario p : listaPropietarios) {
        if (p.getTipoDocumento().equalsIgnoreCase(tipoDocumento) &&
            p.getNumeroDocumento().equalsIgnoreCase(numeroDocumento)) {

            listaPropietarios.remove(p);
            return true;
        }
    }
    return false;
}
}
