package modelo;

import java.util.ArrayList;

/**
 *
 * @author MI PC
 */
public class Cita {
//------atributos-------------------------------
    private String fecha;
    private String hora;
    private Mascota mascota;
    private Propietario propietario;
    private Veterinario veterinario;
//..............................................................................
    //------------lista estatica----------
    public static ArrayList<Cita> listaCitas = new ArrayList<>();
//..............................................................................

    //--------------------constructor---------------------------------
    public Cita(String fecha, String hora, Mascota mascota, Propietario propietario, Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.propietario = propietario;
        this.veterinario = veterinario;
    }

    //------------getters and setters---------------------------
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    //---------------CRUD-------------------------------
    
    //----------Guardar cita----------------
    public static void guardarCita(Cita cita) {
        listaCitas.add(cita);
    }

    //-------Buscar cita por fecha-------------
    public static Cita buscarCita(String fecha) {
        for (Cita c : listaCitas) {
            if (c.getFecha().equalsIgnoreCase(fecha)) {
                return c;
            }
        }
        return null;
    }

    // Editar cita
    public static boolean editarCita(String fecha, 
            String hora, Mascota mascota, Propietario propietario,
            Veterinario veterinario){
        
         Cita cita = buscarCita(fecha);
        if (cita != null) {
            cita.setHora(hora);
            cita.setMascota(mascota);
            cita.setPropietario(propietario);
            cita.setVeterinario(veterinario);
            return true;
        }
        return false;        
    }
    
    //-------------Eliminar cita-------------------
    public static boolean eliminarCita(String fecha) {
        Cita cita = buscarCita(fecha);
        if (cita != null) {
            listaCitas.remove(cita);
            return true;
        }
        return false;
    }
}
