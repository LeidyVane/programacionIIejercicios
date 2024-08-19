package org.example;

import java.util.Scanner;

/* 
 * 
 */

public class MainTransporte {
    private Empresa empresa; 

    public MainTransporte(Empresa empresa) {
        this.empresa = empresa;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear Propietario y Vehículo de carga");
            System.out.println("2. Calcular total de pasajeros transportados");
            System.out.println("3. Obtener lista de usuarios que superan un peso");
            System.out.println("4. Obtener número de usuarios movilizados en un vehículo");
            System.out.println("5. Obtener número de propietarios mayores de 40 años");
            System.out.println("6. Contar usuarios en un rango de edad");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearPropietarioYVehiculoCarga(scanner);
                    break;
                case 2:
                    calcularTotalPasajeros(scanner);
                    break;
                case 3:
                    obtenerListaUsuariosPorPeso(scanner);
                    break;
                case 4:
                    obtenerNumeroUsuariosPorVehiculo(scanner);
                    break;
                case 5:
                    obtenerPropietariosMayoresDe40();
                    break;
                case 6:
                    contarUsuariosEnRangoDeEdad(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
    private void crearPropietarioYVehiculoCarga(Scanner scanner) {
        // Solicitar datos del propietario
        System.out.println("Ingrese el nombre del propietario:");
        String nombrePropietario = scanner.next();
        System.out.println("Ingrese la edad del propietario:");
        int edadPropietario = scanner.nextInt();
    
        // Crear el propietario
        Propietario propietario = new Propietario(nombrePropietario, nombrePropietario, nombrePropietario, nombrePropietario, edadPropietario){


        System.out.println("Ingrese la placa del vehículo de carga:");
        String placa = scanner.next();
        System.out.println("Ingrese el modelo del vehículo de carga:");
        String modelo = scanner.next();
        System.out.println("Ingrese la marca del vehículo de carga:");
        String marca = scanner.next();
        System.out.println("Ingrese el color del vehículo de carga:");
        String color = scanner.next();
        System.out.println("Ingrese la capacidad de carga del vehículo de carga (en kg):");
        double capacidadCarga = scanner.nextDouble();
        System.out.println("Ingrese el número de ejes del vehículo de carga:");
        int numeroEjes = scanner.nextInt();
    
        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);
    

        propietario.agregarVehiculo(vehiculoCarga);
    

        empresa.agregarPropietario(propietario);
    
        System.out.println("Propietario y vehículo de carga creados exitosamente.");

    }

    private void calcularTotalPasajeros(Scanner scanner) {
        // Implementación para calcular el total de pasajeros transportados
    }

    private void obtenerListaUsuariosPorPeso(Scanner scanner) {
        // Implementación para obtener la lista de usuarios que superan un peso
    }

    private void obtenerNumeroUsuariosPorVehiculo(Scanner scanner) {
        // Implementación para obtener el número de usuarios movilizados en un vehículo
    }

    private void obtenerPropietariosMayoresDe40() {
        // Implementación para obtener el número de propietarios mayores de 40 años
    }

    private void contarUsuariosEnRangoDeEdad(Scanner scanner) {
        // Implementación para contar usuarios en un rango de edad
    }
}


