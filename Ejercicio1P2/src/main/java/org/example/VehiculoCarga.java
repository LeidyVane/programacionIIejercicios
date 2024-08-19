package org.example;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes, double peso) {
        super(placa, modelo, marca, color, peso);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
  // Getters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }


}