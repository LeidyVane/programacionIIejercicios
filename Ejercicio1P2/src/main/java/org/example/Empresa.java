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
 
     /**
      * Método constructor de la clase Empresa
      *
      * @param nombre
      */
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

     /**
      * Método para obtener una lista de propietarios
      *
      * @return
      */
    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    /**
     * Método para obtener una lista de vehiculos
     * 
     * @return
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Método para obtener el nombre de la empresa
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }
     
 }
 
