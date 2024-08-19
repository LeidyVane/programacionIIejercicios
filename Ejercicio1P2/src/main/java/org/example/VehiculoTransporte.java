package org.example;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;
    private List<Usuario> listaUsuariosAsociados;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;
        this.listaUsuariosAsociados = new ArrayList<>();
    }

    public void asociarUsuario(Usuario usuario) {
        listaUsuariosAsociados.add(usuario);
    }

    // Getters y setters
    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }
}