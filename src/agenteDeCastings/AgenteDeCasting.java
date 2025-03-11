/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenteDeCastings;

/**
 *
 * @author elhac
 */
import castings.Casting;
import java.util.ArrayList;
import java.util.List;

public class AgenteDeCasting {
    private String numeroEmpleado;
    private String dni;
    private String nombre;
    private String direccion;
    private List<Casting> castingsSupervisados;

    public AgenteDeCasting(String numeroEmpleado, String dni, String nombre, String direccion) {
        this.numeroEmpleado = numeroEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.castingsSupervisados = new ArrayList<>();
    }

    public void asignarCasting(Casting casting) {
        castingsSupervisados.add(casting);
    }

    public List<Casting> getCastingsSupervisados() {
        return castingsSupervisados;
    }
    
    public String getNombre() {
        return nombre;
    }
}

