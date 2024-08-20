package org.example;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String identificacion;
    private String email;
    private String celular;
    private List<Vehiculo> listaVehiculosAsociados;
    private int edad;

    public Propietario(String nombre, String identificacion, String email, String celular, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
        this.listaVehiculosAsociados = new ArrayList<>();
        this.edad=edad;
    }

    public void asociarVehiculo(Vehiculo vehiculo) {
        listaVehiculosAsociados.add(vehiculo);
        vehiculo.getListaPropietariosAsociados().add(this);
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

    public int getEdad() {
        return edad;
    }
    
    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    
}
