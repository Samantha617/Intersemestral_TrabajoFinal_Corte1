package modelo;

import java.util.ArrayList;

/**
 *
 * @author MI PC
 */

//---------Declaro la clase---------
public class Veterinario {
    
//---------Creo los atributos---------
    private String nombreV;
    private String especialidad;
    
    private boolean disponible;
    
    public static ArrayList<Veterinario> listaVeterinarios = new ArrayList<>();
    
//--------Creo metodo constructor---------

    public Veterinario(String nombreV, String especialidad, boolean disponible) {
        this.nombreV = nombreV;
        this.especialidad = especialidad;
        this.disponible = disponible;
    }

    
  
//--------Creo getters and setters----------

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

//-------metodo toString para usar el comboBox en registro de consulta para mostrar
//    la lista de veterinarios-----------------
    
    @Override
    public String toString() {
         return nombreV + " - " + especialidad + (disponible ? " (Disponible)" : " (No disponible)");
}   

//-------------------------CRUD------------------------------------------------
    
    //--------------Metodo para buscar por nombre-------------------
    public static Veterinario buscarVeterinario(String nombre) {
        for (Veterinario vete : listaVeterinarios) {
            if (vete.getNombreV().equalsIgnoreCase(nombre)) {
                return vete;
            }
        }
        return null;
    }
    
    //-------------Metodo para registrar un veterinario-------------
    public static String registrarVeterinario(Veterinario v) {
        for (Veterinario vet : listaVeterinarios) {
            if (vet.getNombreV().equalsIgnoreCase(v.getNombreV())) {
                return "Ya existe un veterinario con ese nombre";
            }
        }
        listaVeterinarios.add(v);
        return null;
    }
}
