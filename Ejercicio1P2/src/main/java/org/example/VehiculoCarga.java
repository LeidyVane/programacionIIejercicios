package org.example;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;

    /**
     * Método constructor de la clase VehiculoCarga
     * 
     * @param placa
     * @param modelo
     * @param marca
     * @param color
     * @param capacidadCarga
     * @param numeroEjes
     * @param peso
     */
    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes, double peso) {
        super(placa, modelo, marca, color, peso);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
    /**
     * Método para obtener la capacidad de carga de un vehiculo
     * @return 
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método para obtener el número de ejes de un vehiculo
     * 
     * @return 
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }


}