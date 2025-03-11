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
public class Modelo extends Candidato {

    private double altura;
    private double peso;

    public Modelo(String nombre, int edad, String genero, String nacionalidad, String telefono,
            String email, String colorOjos, String colorPelo, String fechaNacimiento,
            String fotografia, Representante representante, double altura, double peso) {
        super(nombre, edad, genero, nacionalidad, telefono, email, colorOjos, colorPelo, fechaNacimiento, fotografia, representante);
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Modelo: " + nombre + ", Altura: " + altura + "m, Peso: " + peso + "kg.");
    }
}
