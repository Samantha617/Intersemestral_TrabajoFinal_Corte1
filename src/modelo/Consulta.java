package modelo;

import java.util.ArrayList;

/**
 *
 * @author MI PC
 */
//--------Declaro la clase---------
public class Consulta {

//--------------- Atributos -----------------
    private String codigo;
    private String fecha;
    private Mascota mascota; // Asociación: una consulta pertenece a una mascota
    private String diagnostico;
    private String tratamiento;
    private String medicamentos;
   
//..............................................................................
    // Lista estática para registrar todas las consultas
    public static ArrayList<Consulta> listaConsultas = new ArrayList<>();

//..............................................................................
//-------Creo metodo constructor-------

    public Consulta(String codigo, String fecha, Mascota mascota, String diagnostico, String tratamiento, String medicamentos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.mascota = mascota;// Asociacion--> conoce la consulta
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
        
    }
   
//-------Creo getters and setters---------

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

//...............................................................................
    //CRUD
    //---------Metodo de Guardar una consulta-----------
    public static void guardarConsulta(Consulta nueva) {
        listaConsultas.add(nueva);
    }

    //-----------metodo de buscar consulta por codigo--------------
    public static Consulta buscarConsulta(String codigo) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getCodigo().equalsIgnoreCase(codigo)) {
                return consulta;
            }
        }
        return null; // No encontrada
    }

    //---------------Metodo de Editar consulta---------------------- 
     public static boolean editarConsulta(String codigo, String fecha, Mascota mascota, String diagnostico, String tratamiento, String medicamentos) {

        Consulta consulta = buscarConsulta(codigo);

        if (consulta != null) {

            // Actualizar datos
            consulta.setFecha(fecha);
            consulta.setMascota(mascota);
            consulta.setDiagnostico(diagnostico);
            consulta.setTratamiento(tratamiento);
            consulta.setMedicamentos(medicamentos);
            
            return true;
        }
        return false;
    }

    //---------------Eliminar consulta
     public static boolean eliminarConsulta(String codigo) {
        Consulta consulta = buscarConsulta(codigo);
        if (consulta != null) {
            listaConsultas.remove(consulta);
            return true;
        }
        return false;
    }
}
