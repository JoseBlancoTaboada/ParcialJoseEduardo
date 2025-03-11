/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidatos;

import representantes.Representante;

/**
 *
 * @author elhac
 */
public class Actor extends Candidato {

    private int añosExperiencia;
    private String especialidad;

    public Actor(String nombre, int edad, String genero, String nacionalidad, String telefono,
            String email, String colorOjos, String colorPelo, String fechaNacimiento,
            String fotografia, Representante representante, int añosExperiencia, String especialidad) {
        super(nombre, edad, genero, nacionalidad, telefono, email, colorOjos, colorPelo, fechaNacimiento, fotografia, representante);
        this.añosExperiencia = añosExperiencia;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Actor: " + nombre + ", Experiencia: " + añosExperiencia + " años, Especialidad: " + especialidad);
    }
}
