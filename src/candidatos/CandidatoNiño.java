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
public class CandidatoNiño extends Candidato {

    private String nombreTutor;

    public CandidatoNiño(String nombre, int edad, String genero, String nacionalidad, String telefono,
            String email, String colorOjos, String colorPelo, String fechaNacimiento,
            String fotografia, Representante representante, String nombreTutor) {
        super(nombre, edad, genero, nacionalidad, telefono, email, colorOjos, colorPelo, fechaNacimiento, fotografia, representante);
        this.nombreTutor = nombreTutor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Candidato Niño: " + nombre + ", Tutor: " + nombreTutor);
    }
}
