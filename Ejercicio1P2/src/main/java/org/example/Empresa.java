package org.example;

import java.util.ArrayList;
import java.util.List;

/*
/* Documentación de la creación de la clase Empresa
 */
 
 public class Empresa {
     private List<Propietario> listaPropietarios;
     private List<Vehiculo> listaVehiculos;
 
     public Empresa() {
         this.listaPropietarios = new ArrayList<>();
         this.listaVehiculos = new ArrayList<>();
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
 
     // Métodos adicionales para las funcionalidades requeridas
     //Getters 
     
 }
 
