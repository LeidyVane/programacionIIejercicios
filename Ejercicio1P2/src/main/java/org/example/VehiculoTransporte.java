package org.example;


public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;

    /**
     * Método constructor de la clase VehiculoTransporte
     * @param placa
     * @param modelo
     * @param marca
     * @param color
     * @param maxPasajeros
     * @param peso
     */
    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros, double peso) {
        super(placa, modelo, marca, color, peso);
        this.maxPasajeros = maxPasajeros;
    }
    
    /**
     * Método para obtener el máximo de pasajeros
     * 
     * @return 
     */ 
    public int getMaxPasajeros() {
        return maxPasajeros;
    }



}