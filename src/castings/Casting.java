/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package castings;

/**
 *
 * @author elhac
 */
import agenteDeCastings.AgenteDeCasting;
import candidatos.Candidato;
import java.util.ArrayList;
import java.util.List;

public class Casting {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String fecha;
    private boolean esPresencial;
    private double costo;
    private List<Candidato> candidatos;
    private AgenteDeCasting agente;

    public Casting(String codigo, String nombre, String descripcion, String fecha, boolean esPresencial, double costo, AgenteDeCasting agente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.esPresencial = esPresencial;
        this.costo = costo;
        this.agente = agente;
        this.candidatos = new ArrayList<>();
    }

    public void agregarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public Object getAgente() {
        return agente;
    }
}

