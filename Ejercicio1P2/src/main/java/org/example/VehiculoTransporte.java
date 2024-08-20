package org.example;


public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;
    private int pasajerosTransportados;

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
        this.pasajerosTransportados = 0;
    }
    
    /**
     * Método para obtener el máximo de pasajeros
     * 
     * @return 
     */ 
    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public int getPasajerosTransportados() {
        return pasajerosTransportados;
    }

    public void setPasajerosTransportados(int pasajerosTransportados) {
        this.pasajerosTransportados = pasajerosTransportados;
    }


}