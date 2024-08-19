package org.example;


public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;
    }
    
   //Getter max pasajeros  
    public int getMaxPasajeros() {
        return maxPasajeros;
    }



}