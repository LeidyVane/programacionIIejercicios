package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTransporte {

    private static Empresa empresa;
    private static Scanner scanner;

    public static void main(String[] args) {
        empresa= new Empresa ("Movilidad SA");
        inicializarDatos();
        scanner = new Scanner(System.in);
        mostrarMenu();

        /*
         * se crea un Propietario con sus datos personales
         *
         */
        System.out.println("Ingrese el nombre del propietario:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la identificación del propietario:");
        String identificacion = scanner.nextLine();
        System.out.println("Ingrese el email del propietario:");
        String email = scanner.nextLine();
        System.out.println("Ingrese el celular del propietario:");
        String celular = scanner.nextLine();

        Propietario propietario = new Propietario(nombre, identificacion, email, celular);

        /*
         *  añadimos el vehículo de carga
         */

        System.out.println("Ingrese la placa del vehículo:");
        String placa = scanner.nextLine();
        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el color del vehículo:");
        String color = scanner.nextLine();
        System.out.println("Ingrese la capacidad del vehículo (en toneladas):");
        double capacidadCarga = scanner.nextDouble();
        System.out.println("Ingrese el número de ejes:");
        int numeroEjes = scanner.nextInt();

        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);
        propietario.agregarVehiculo(vehiculoCarga);

        System.out.println("\nDatos del Propietario y su Vehículo:");
        System.out.println(propietario);

        /**
         * Calculamos el total de pasajeros transportados en un día
         */
        VehiculoTransporte vehiculo1 = new VehiculoTransporte("Ck456", "2020", "Toyota", "Blanco", 50);
        VehiculoTransporte vehiculo2 = new VehiculoTransporte("XT67", "2019", "BMW", "Negro", 45);
        VehiculoTransporte vehiculo3 = new VehiculoTransporte("LG49", "2021", "Ford", "Azul", 60);

        System.out.println("\nIngrese la placa del vehículo de pasajeros para calcular el total de pasajeros transportados:");
        scanner.nextLine();  // Consumir la nueva línea
        String placaBusqueda = scanner.nextLine();
        int pasajerosTransportados = 0;

        if (placaBusqueda.equals(vehiculo1.getPlaca())) {
            pasajerosTransportados = vehiculo1.getMaxPasajeros();
        } else if (placaBusqueda.equals(vehiculo2.getPlaca())) {
            pasajerosTransportados = vehiculo2.getMaxPasajeros();
        } else if (placaBusqueda.equals(vehiculo3.getPlaca())) {
            pasajerosTransportados = vehiculo3.getMaxPasajeros();
        }

        System.out.println("Total de pasajeros transportados por el vehículo con placa " + placaBusqueda + ": " + pasajerosTransportados);
    }

    /*
    /* Se crea método para mostrar el Menú y manejar opciones
     */
    

}

