package org.example;

import java.util.ArrayList;
import java.util.List;

/*
/* Documentación de la creación de la clase Empresa
 */

public class Empresa {
    private String nombre;
    private List<Propietario> propietarios;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.propietarios = new ArrayList<>();
    }

    public void agregarPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }
/*
/* Creación del método get para obtener una lista de propietarios
 */
    public List<Propietario> getPropietarios() {
        return propietarios;
    }

}
