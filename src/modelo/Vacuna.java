/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


/**
 *
 * @author MI PC
 */
public class Vacuna {
    //--------atributos---------
    private String fechaVacuna;
    private String lote;
    
    private Mascota mascota; // Asociacion: cada vacuna se aplica a una mascota
    
    private String tipoDeVacuna;
    private String proximaDosis;
//..............................................................................
    // Lista estatica que guarda todas las vacunas registradas
    public static ArrayList<Vacuna> listaVacunas = new ArrayList<>();
//..............................................................................    

    //-------constructor----------

    public Vacuna(String fechaVacuna, String lote, Mascota mascota, String tipoDeVacuna, String proximaDosis) {
        this.fechaVacuna = fechaVacuna;
        this.lote = lote;
        this.mascota = mascota;
        this.tipoDeVacuna = tipoDeVacuna;
        this.proximaDosis = proximaDosis;
    }
     //-------getters and setters-----
    public String getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(String fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public String getLote() {    
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getTipoDeVacuna() {
        return tipoDeVacuna;
    }

    public void setTipoDeVacuna(String tipoDeVacuna) {
        this.tipoDeVacuna = tipoDeVacuna;
    }

    public String getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(String proximaDosis) {
        this.proximaDosis = proximaDosis;
    }

    //----------CRUD-----------------------------------
    //-----------Metodo para guardar ----------
    public static void guardarVacuna(Vacuna vacuna) {
        listaVacunas.add(vacuna);
    }
    
    // ---------- Buscar vacuna por fecha ----------
    public static Vacuna buscarVacuna(String fecha) {
        for (Vacuna v : listaVacunas) {
            if (v.getFechaVacuna().equalsIgnoreCase(fecha)) {
                return v;
            }
        }
        return null;
    }
    
    //----------metodo de editar vacuna------------
    public static boolean editarVacuna(String fechaVacuna, String tipoDeVacuna, Mascota mascota,
            String lote, String proximaDosis){
        
        Vacuna vacuna = buscarVacuna(fechaVacuna);
        if(vacuna != null){
            
            vacuna.setTipoDeVacuna(tipoDeVacuna);
            vacuna.setMascota(mascota);
            vacuna.setTipoDeVacuna(tipoDeVacuna);
            vacuna.setLote(lote);
            vacuna.setProximaDosis(proximaDosis);
            return true;
        }
        return false;
    }
    //------------Eliminar vacuna--------------
    public static boolean eliminarVacuna(String fechaVacuna) {
        Vacuna vacuna = buscarVacuna(fechaVacuna);
        if (vacuna != null) {
            listaVacunas.remove(vacuna);
            return true;
        }
        return false;
    }
}
