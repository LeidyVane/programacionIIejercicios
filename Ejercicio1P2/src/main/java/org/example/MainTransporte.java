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
                    crearPropietarioYVehiculoCarga();
                    break;
                case 2:
                    calcularTotalPasajeros();
                    break;
                case 3:
                    obtenerListaUsuariosPorPeso();
                    break;
                case 4:
                    obtenerNumeroUsuariosPorVehiculo();
                    break;
                case 5:
                    obtenerPropietariosMayoresDe40();
                    break;
                case 6:
                    contarUsuariosEnRangoDeEdad();
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

    /*
     * Documentación para crear Propietario y Vehículo de Carga en el menú
     */

    private void crearPropietarioYVehiculoCarga() {

        Scanner scanner= new Scanner(System.in);

        //Se pide al usuario ingresar datos del Propietario
        System.out.println("Ingrese el nombre del propietario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la Identificación del propietario");
        String identificacion=scanner.nextLine();

        System.out.println("Ingrese el email del propietario");
        String email=scanner.nextLine();

        System.out.println("Ingrese el número de celular del Propietario");
        String celular=scanner.nextLine();

        System.out.println("Ingrese la edad del propietario:");
        int edad = scanner.nextInt();
    
        System.out.println("Ingrese placa del vehículo:");
        String placa = scanner.next();

        System.out.println("Ingrese modelo del vehículo:");
        String modelo = scanner.next();

        System.out.println("Ingrese marca del vehículo:");
        String marca = scanner.next();

        System.out.println("Ingrese color del vehículo:");
        String color = scanner.next();

        System.out.println("Ingrese peso del vehículo:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese capacidad de carga del vehículo:");
        double capacidadCarga = scanner.nextDouble();

        System.out.println("Ingrese número de ejes del vehículo:");
        int numeroEjes = scanner.nextInt();
        // creamos Propietario y Vehículo Carga con los datos ya ingresados
        Propietario propietario = new Propietario(nombre, identificacion, email, celular, edad);
        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);

        propietario.asociarVehiculo(vehiculoCarga);
        empresa.agregarPropietario(propietario);
        empresa.agregarVehiculo(vehiculoCarga);

        System.out.println("Propietario y Vehículo de carga creados exitosamente.");
    }
    /*
     * Documentación de Scanner para calcular el Total de Pasajeros
     */
    private void calcularTotalPasajeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la placa del vehículo:");
        String placa = scanner.next();

        int totalPasajeros = 0;
        for (Vehiculo vehiculo : empresa.getListaVehiculos()) {
            if (vehiculo instanceof VehiculoTransporte && vehiculo.getPlaca().equals(placa)) {
                totalPasajeros += ((VehiculoTransporte) vehiculo).getListaPropietariosAsociados().size();
            }
        }

        System.out.println("Total de pasajeros transportados por el vehículo con placa " + placa + ": " + totalPasajeros);
    }

    private void obtenerListaUsuariosPorPeso() {
        // Implementación para obtener la lista de usuarios que superan un peso
    }

    private void obtenerNumeroUsuariosPorVehiculo() {
        // Implementación para obtener el número de usuarios movilizados en un vehículo
    }

    private void obtenerPropietariosMayoresDe40() {
        // Implementación para obtener el número de propietarios mayores de 40 años
    }

    private void contarUsuariosEnRangoDeEdad() {
        // Implementación para contar usuarios en un rango de edad
    }
}


