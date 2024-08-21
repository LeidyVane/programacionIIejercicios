package org.example;

import java.util.Scanner;

/**
 * Documentación del Main transporte, se crea un menú interactivo 
 * y un scanner para cada funcionalidad
 */

public class MainTransporte {
    private Empresa empresa; 

    /**
     * Método constructor de la clase MainTransporte
     * 
     * @param empresa
     */
    public MainTransporte(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     *Menú interactivo que realiza diferentes funciones sobre los propietarios y vehiculos
     */
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
     * Documentación para crear Propietario y Vehículo de Carga en el menú y los asocia a la empresa
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

    /**
     * Método para calcular el total de pasajeros e imprimir en consola
     */
    private void calcularTotalPasajeros() {
        Scanner scanner = new Scanner(System.in);

    // Simulamos tres vehículos de transporte operando en un día
    VehiculoTransporte vehiculo1 = new VehiculoTransporte("LDO7", "2019", "Toyota", "blanco", 50, 1600);
    VehiculoTransporte vehiculo2 = new VehiculoTransporte("RLA79", "2015", "Toyota", "Azul", 30, 1500);
    VehiculoTransporte vehiculo3 = new VehiculoTransporte("LVM14", "2013", "Toyota", "negro", 40,1200);

    // Agregamos los vehículos a la lista de la empresa
    empresa.getListaVehiculos().add(vehiculo1);
    empresa.getListaVehiculos().add(vehiculo2);
    empresa.getListaVehiculos().add(vehiculo3);

    // Asignamos un número de pasajeros transportados en un día a cada vehículo
    vehiculo1.setPasajerosTransportados(200); // Este valor podría ser dinámico
    vehiculo2.setPasajerosTransportados(150);
    vehiculo3.setPasajerosTransportados(180);

    // Solicitar la placa al usuario
    System.out.println("Ingrese la placa del vehículo:");
    String placa = scanner.next();

    // Buscar el vehículo por la placa
    VehiculoTransporte vehiculoEncontrado = null;
    for (Vehiculo vehiculo : empresa.getListaVehiculos()) {
        if (vehiculo.getPlaca().equals(placa) && vehiculo instanceof VehiculoTransporte) {
            vehiculoEncontrado = (VehiculoTransporte) vehiculo;
            break;
        }
    }

    // Mostrar el número de pasajeros transportados
    if (vehiculoEncontrado != null) {
        System.out.println("Total de pasajeros transportados por el vehículo con placa " + placa + ": " + vehiculoEncontrado.getPasajerosTransportados());
    } else {
        System.out.println("Vehículo no encontrado o no es un vehículo de transporte.");
    }
}

    /**
     * Método para obtener la lista de usuarios que superan un peso e imprimir en consola
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

    /**
     * Método para obtener un número de usuarios que se movilizaron 
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

    /**
     * Método para obtener una lista de propietarios mayores de 40 años e imprimir en consola
     */
    private void obtenerPropietariosMayoresDe40() {
        int propietariosMayoresDe40 = 0; 

        for (Propietario propietario : empresa.getListaPropietarios()) {
            if (propietario.getEdad() > 40) {
                propietariosMayoresDe40++;
            }
        }

        System.out.println("Número de propietarios mayores de 40 años: " + propietariosMayoresDe40);
    }
    
    /**
     * Método para contar usuarios en un rango de edad e imprimir en consola
     */
    private void contarUsuariosEnRangoDeEdad() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el límite menor del rango de edad:");
        int edadMenor = scanner.nextInt();

        System.out.println("Ingrese el límite mayor del rango de  edad:");
        int edadMayor = scanner.nextInt();

        int usuarios = 0;
        for (Propietario propietario: empresa.getListaPropietarios()) {
            if (propietario.getEdad() >= edadMenor && propietario.getEdad() <=edadMayor) {
                usuarios++;
            }
        }
        
        System.out.println("Número de usuarios en el rango de edad" + edadMenor + "-" + edadMayor + ": " + usuarios);
    }
}


