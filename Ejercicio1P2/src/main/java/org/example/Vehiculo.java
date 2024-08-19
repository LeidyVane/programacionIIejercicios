package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private List<Propietario> listaPropietariosAsociados;

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.listaPropietariosAsociados = new ArrayList<>();
    }

    // Getters y setters
    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }
}

