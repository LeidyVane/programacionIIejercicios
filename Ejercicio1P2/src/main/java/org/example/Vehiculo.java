package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private double peso;
    private List<Propietario> listaPropietariosAsociados;

    public Vehiculo(String placa, String modelo, String marca, String color, double peso) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso=peso;

        this.listaPropietariosAsociados = new ArrayList<>();
    }

    // Getters y setters
    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }
    
}

