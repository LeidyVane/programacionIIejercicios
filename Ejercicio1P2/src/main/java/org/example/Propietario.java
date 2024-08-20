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

    /**
     * Método constructor de la clase Propietario
     * 
     * @param nombre
     * @param identificacion
     * @param email
     * @param celular
     * @param edad
     */
    public Propietario(String nombre, String identificacion, String email, String celular, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
        this.listaVehiculosAsociados = new ArrayList<>();
        this.edad=edad;
    }

    /**
     * Método para asociar un propietario con un vehiculo
     * 
     * @param vehiculo
     */
    public void asociarVehiculo(Vehiculo vehiculo) {
        listaVehiculosAsociados.add(vehiculo);
        vehiculo.getListaPropietariosAsociados().add(this);
    }

    /**
     * Método para obtener el nombre del propietario
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la identificación del propietario
     * 
     * @return
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Método para obtener el email del propietario
     * 
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para obtener el celular del propietario
     * 
     * @return
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método para obtener la edad del propietario
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Método para obtener la lista de vehiculos
     * 
     * @return
     */
    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    
}
