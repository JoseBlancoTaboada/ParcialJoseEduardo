/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidatos;

/**
 *
 * @author elhac
 */
import java.util.ArrayList;
import java.util.List;
import representantes.Representante;

public abstract class Candidato {
    protected String nombre;
    protected int edad;
    protected String genero;
    protected String nacionalidad;
    protected String telefono;
    protected String email;
    protected String colorOjos;
    protected String colorPelo;
    protected String fechaNacimiento;
    protected String fotografia;
    protected List<String> portafolio;
    protected Representante representante;

    // Constructor
    public Candidato(String nombre, int edad, String genero, String nacionalidad, String telefono, 
                     String email, String colorOjos, String colorPelo, String fechaNacimiento, 
                     String fotografia, Representante representante) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.email = email;
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.representante = representante;
        this.portafolio = new ArrayList<>();
    }

    // Método para agregar un enlace al portafolio
    public void agregarTrabajo(String enlace) {
        portafolio.add(enlace);
    }

    // Método abstracto que será implementado en las subclases
    public abstract void mostrarDetalles();
}


