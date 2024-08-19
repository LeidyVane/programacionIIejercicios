package org.example;

/**
 * Prueba 1
 */
public class VehiculoTransporte extends Vehiculo {
    private int maxPasajeros;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        super(placa, modelo, marca, color);
        this.maxPasajeros = maxPasajeros;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + ", Máximo de pasajeros: " + maxPasajeros;
    }
}
