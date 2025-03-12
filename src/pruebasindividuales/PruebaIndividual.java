/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasindividuales;

import candidatos.Candidato;

/**
 *
 * @author elhac
 */
public class PruebaIndividual {

    private Candidato candidato;
    private String evaluacion;
    private int puntuacion;

    public PruebaIndividual(Candidato candidato, String evaluacion, int puntuacion) {
        this.candidato = candidato;
        this.evaluacion = evaluacion;
        this.puntuacion = puntuacion;
    }

    public void mostrarResultado() {
        System.out.println("Candidato: " + candidato.getNombre());
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Puntuación: " + puntuacion);
    }
}
