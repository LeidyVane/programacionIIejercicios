package org.example;

import java.util.Scanner;

/* 
 * Documentación del Main transporte, se crea un menú interactivo 
 * y un scanner para cada funcionalidad
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
        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes, peso);

        propietario.asociarVehiculo(vehiculoCarga);
        empresa.agregarPropietario(propietario);
        empresa.agregarVehiculo(vehiculoCarga);

        System.out.println("Propietario y Vehículo de carga creados exitosamente.");
    }
    /*
     * Documentación de método para calcular el Total de Pasajeros e imprimir en consola
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
    /*
     * Documentación de método para obtener la lista de usuarios que superan un peso e imprimir en consola
     */

    private void obtenerListaUsuariosPorPeso() {
        Scanner scanner= new Scanner(System.in);

        //pedimos al usuario que ingrese el valor del peso para poder obtener 
        //la lista de vehículos que superen ese peso
        System.out.println("Ingrese el peso:");
        double peso=scanner.nextDouble();

        for(Vehiculo vehiculo: empresa.getListaVehiculos()){
            if(vehiculo.getPeso() > peso){
                System.out.println("Placa: " + vehiculo.getPlaca() + ", Peso: " + vehiculo.getPeso());
            }
        }
    }
    /*
     * Documentación de método para obtener un número de usuarios que se movilizaron 
     * en dicho vehículo sólo conociendo su placa e imprimir en consola
     */

     private void obtenerNumeroUsuariosPorVehiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la placa del vehículo:");
        String placa = scanner.next();

        int numeroPropietarios = 0;
        for (Vehiculo vehiculo : empresa.getListaVehiculos()) {
            if (vehiculo.getPlaca().equals(placa)) {
                numeroPropietarios = vehiculo.getListaPropietariosAsociados().size();
            }
        }

        System.out.println("Número de propietarios asociados al vehículo con placa " + placa + ": " + numeroPropietarios);
    }
    /*
     * Documentación de método para obtener una lista de propietarios mayores de 40 años e imprimir en consola
     */
    private void obtenerPropietariosMayoresDe40() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese la edad del propietario:");
        int edad = scanner.nextInt();

        int propietariosMayoresDe40 = 0;
        for (Propietario propietario : empresa.getListaPropietarios()) {
            if (propietario.getEdad() > 40) {
                propietariosMayoresDe40++;
             }
        }

        System.out.println("Número de propietarios mayores de 40 años:" + propietariosMayoresDe40);

    }
    /*
     * Dumentación de método para contar usuarios en un rango de edad e imprimir en consola
     */
    private void contarUsuariosEnRangoDeEdad() {
        // Implementación para contar usuarios en un rango de edad
    }
}


