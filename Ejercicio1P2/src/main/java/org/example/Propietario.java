package org.example;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String identificacion;
    private String email;
    private String celular;
    private List<Vehiculo> listaVehiculosAsociados;

    public Propietario(String nombre, String identificacion, String email, String celular) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
        this.listaVehiculosAsociados = new ArrayList<>();
    }

    public void asociarVehiculo(Vehiculo vehiculo) {
        listaVehiculosAsociados.add(vehiculo);
        vehiculo.getListaPropietariosAsociados().add(this);
    }

    // Getters y setters
}
