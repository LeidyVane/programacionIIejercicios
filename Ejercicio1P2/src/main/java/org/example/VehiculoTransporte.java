package org.example;


public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros, double peso) {
        super(placa, modelo, marca, color, peso);
        this.maxPasajeros = maxPasajeros;
    }
    
   //Getter max pasajeros  
    public int getMaxPasajeros() {
        return maxPasajeros;
    }



}