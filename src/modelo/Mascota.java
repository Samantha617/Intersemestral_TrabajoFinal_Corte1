package modelo;

//-------Declaro la clase-----------

import java.util.ArrayList;

public class Mascota {
    
//-------Creo los atributos---------
    private String nombreM;
    private String especie;
    private int edad;
    private String raza;
    private int peso;
    
    private ArrayList <Consulta> listaConsultas;
    
//............................................................................    
    // Lista estatica que guarda todas las mascotas registradas
    public static ArrayList<Mascota> listaMascotas = new ArrayList<>();   
    
//..............................................................................
    
//------Creo constructor------------

    public Mascota(String nombreM, String especie, int edad,
            String raza, int peso) { //---Aqui no puedo 
                                        //pasar el arraylist----
        this.nombreM = nombreM;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.listaConsultas = new ArrayList<>();//----lo creo aqui para que empiece 
                                              //como lista vacia(crea internamente)-----
                                              
    }
   
//------Creo getters and setters--------

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
    
//----------------Metodo de agregar consulta------------    
    
    public void guardarConsulta(Consulta consulta) {
    listaConsultas.add(consulta);
    }
    
//...............................................................................
    
   //-------Validar datos antes de registrar--------
 public static String validarDatosMascota(String nombreM, String especie, int edad,
    String raza, int peso, String nombreP) {

    if (nombreM == null || nombreM.isEmpty()) 
        return "El nombre no puede estar vacio";

    if (especie == null || especie.isEmpty()) 
        return "La especie no puede estar vacia";

    if (edad < 0 || edad > 50)
        return "La edad debe estar entre 0 y 50 años";

    if (raza == null || raza.isEmpty())
        return "La raza no puede estar vacia";

    if (peso <= 0 || peso > 100) 
        return "El peso debe ser mayor a 0 y menor a 100 kg";

    if (!Propietario.existePropietario(nombreP)) {
        return "No existe un propietario con ese nombre...Registrelo primero.";
    }

    return null; 
  }
}
