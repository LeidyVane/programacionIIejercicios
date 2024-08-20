package org.example;

import java.util.ArrayList;
import java.util.List;

/*
/* Documentación de la creación de la clase Empresa
 */
 
 public class Empresa {
    private String nombre;
     private List<Propietario> listaPropietarios;
     private List<Vehiculo> listaVehiculos;
 
     public Empresa(String nombre) {
         this.listaPropietarios = new ArrayList<>();
         this.listaVehiculos = new ArrayList<>();
         this.nombre=nombre;
     }
 
     public void agregarPropietario(Propietario propietario) {
         listaPropietarios.add(propietario);
     }
 
     public void agregarVehiculo(Vehiculo vehiculo) {
         listaVehiculos.add(vehiculo);
     }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
     
 }
 
