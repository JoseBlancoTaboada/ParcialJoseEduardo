/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author elhac
 */
import castings.Casting;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String id;
    private String telefono;
    private String email;
    private String direccion;
    private List<Casting> castingsContratados;

    public Cliente(String nombre, String id, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.castingsContratados = new ArrayList<>();
    }

    public void contratarCasting(Casting casting) {
        castingsContratados.add(casting);
    }

    public List<Casting> getCastingsContratados() {
        return castingsContratados;
    }
}
