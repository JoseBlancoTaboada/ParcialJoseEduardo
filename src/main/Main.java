/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import agenteDeCastings.AgenteDeCasting;
import candidatos.Actor;
import candidatos.Candidato;
import candidatos.CandidatoNiño;
import candidatos.Modelo;
import castings.Casting;
import clientes.Cliente;
import java.util.List;
import pruebasindividuales.PruebaIndividual;
import representantes.Representante;

public class Main {

    public static void main(String[] args) {
        // CREACION DE CLIENTES
        Cliente cliente1 = new Cliente("Gucchi", "12345678", "123456789", "gucchi@gmail.com", "Calle 456");
        Cliente cliente2 = new Cliente("cinecolombia", "87654321", "98754321", "cineco@gmail.com", "Calle te");

        // CREACION DE AGENTES DE CASTING
        AgenteDeCasting agente1 = new AgenteDeCasting("808", "314289687", "Jose Blanco", "Calle Republica");
        AgenteDeCasting agente2 = new AgenteDeCasting("707", "474344559", "Sonic Gomez", "Metropolis 2");

        //CREACION DE CASTINGS 
        Casting casting1 = new Casting("C001", "Casting de Moda", "Desfile de modelos", "2025-06-15", true, 5000, agente1);
        Casting casting2 = new Casting("C002", "Casting de Actores", "Selección de actores para película", "2025-07-10", false, 8000, agente2);

        // Asignar castings a los clientes
        cliente1.contratarCasting(casting1);
        cliente2.contratarCasting(casting2);

        // CREACION DE REPRESENTANTES
        Representante representante1 = new Representante("Rosadela Leon", "3142602067", "rosa@gmail.com");
        Representante representante2 = new Representante("Sebas Torrez", "9848755577", "sebas@gmail.com");

        // CREACION DE CANDIDATOS
        Modelo modelo1 = new Modelo("Ana Lopez", 22, "Femenino", "Colombiana", "320321987",
                "ana@gmail.com", "Marrones", "Castaño", "2002-04-15",
                "foto1.jpg", null, 1.75, 55);

        // Con representante
        Modelo modelo2 = new Modelo("Carlos Torres", 13, "Masculino", "Venezolano", "456654321",
                "carlos@gmail.com", "Grises", "Rubio", "2011-08-22",
                "foto2.jpg", representante1, 1.85, 78);

        // Actor sin representante
        Actor actor1 = new Actor("Luis Méndez", 30, "Masculino", "Mexicano", "321987654",
                "luis@gmail.com", "Verdes", "Negro", "1994-11-30",
                "foto3.jpg", null, 6, "Cine y Teatro");

        // Actor con representante
        Actor actor2 = new Actor("Paula Sánchez", 28, "Femenino", "Colombiana", "147852369",
                "paula@gmail.com", "Marrones", "Castaño", "1996-05-18",
                "foto4.jpg", representante2, 8, "Doblaje y Televisión");

        // Candidato Niño con tutor
        CandidatoNiño niño1 = new CandidatoNiño("Martín Pérez", 10, "Masculino", "Chileno", "963258741",
                "martin@gmail.com", "Negros", "Negro", "2014-09-12",
                "foto5.jpg", representante1, "Alejandra Pérez");

        // Agregar trabajos al portafolio
        modelo1.agregarTrabajo("https://portfolio-ana.com/desfile1");
        modelo2.agregarTrabajo("https://portfolio-carlos.com/sesion1");
        actor1.agregarTrabajo("https://portfolio-luis.com/pelicula1");
        actor2.agregarTrabajo("https://portfolio-paula.com/serie1");
        niño1.agregarTrabajo("https://portfolio-martin.com/comercial1");

        // ASIGNAR CANDIDATOS A LOS CASTINGS
        casting1.agregarCandidato(modelo1);
        casting1.agregarCandidato(modelo2);
        casting2.agregarCandidato(actor1);
        casting2.agregarCandidato(actor2);
        casting2.agregarCandidato(niño1);

        // CREACIÓN Y ASIGNACIÓN DE PRUEBAS INDIVIDUALES
        PruebaIndividual prueba1 = new PruebaIndividual(modelo1, "Desfile en pasarela", 9);
        PruebaIndividual prueba2 = new PruebaIndividual(actor1, "Actuación en escena", 8);
        PruebaIndividual prueba3 = new PruebaIndividual(niño1, "Prueba de publicidad infantil", 10);

        // Mostrar resultados de las pruebas
        System.out.println("\n=== RESULTADOS DE PRUEBAS INDIVIDUALES ===");
        prueba1.mostrarResultado();
        prueba2.mostrarResultado();
        prueba3.mostrarResultado();

        //MOSTRAR INFORMACIÓN DE LOS CASTINGS Y SUS CANDIDATOS
        mostrarDetallesCasting(casting1);
        mostrarDetallesCasting(casting2);
    }

    // Método auxiliar para mostrar información de un casting
    public static void mostrarDetallesCasting(Casting casting) {
        System.out.println("\n=== CASTING: " + casting.getNombre() + " ===");
        System.out.println("Descripción: " + casting.getDescripcion());
        System.out.println("Fecha: " + casting.getFecha());
        System.out.println("Costo: $" + casting.getCosto());
        System.out.println("Candidatos:");

        List<Candidato> candidatos = casting.getCandidatos();
        if (candidatos.isEmpty()) {
            System.out.println("No hay candidatos en este casting.");
        } else {
            for (Candidato c : candidatos) {
                c.mostrarDetalles();
                System.out.println("------------------------------------");
            }
        }
    }
}
