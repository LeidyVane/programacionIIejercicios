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

    /**
     * Método constructor de la clase Vehiculo
     * 
     * @param placa
     * @param modelo
     * @param marca
     * @param color
     * @param peso
     */
    public Vehiculo(String placa, String modelo, String marca, String color, double peso) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso=peso;
        this.listaPropietariosAsociados = new ArrayList<>();
    }

    /**
     * Método para obtener la lista de propietarios
     * 
     * @return
     */
    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    /**
     * Método para obtener la placa del vehiculo
     * 
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método para obtener el modelo del vehiculo
     * 
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para obtener la marca del vehiculo
     * 
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para obtener el color del vehiculo
     * 
     * @return
     */
    public String getColor() {
        return color;
    }


    /**
     * Método para obtener el peso del vehiculo
     * 
     * @return
     */
    public double getPeso() {
        return peso;
    }
    
}

