package org.example;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String identificacion;
    private String email;
    private String celular;
    private List<Vehiculo> vehiculos;

    public Propietario(String nombre, String identificacion, String email, String celular) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        String infoVehiculos = "";
        for (Vehiculo vehiculo : vehiculos) {
            infoVehiculos += vehiculo.toString() + "\n";
        }
        return "Nombre: " + nombre + ", Identificación: " + identificacion + ", Email: " + email + ", Celular: " + celular + "\nVehículos:\n" + infoVehiculos;
    }
}
