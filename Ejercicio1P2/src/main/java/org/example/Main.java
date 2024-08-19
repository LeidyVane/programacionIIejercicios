package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        /* Método Inicializar Datos de prueba 1
         */
        inicializarDatos();

        /*
        /* Método para Iniciar el MainTransporte
         */
        MainTransporte mainTransporte = new MainTransporte();
        mainTransporte.iniciar();
    }

    /*
    /* Método para inicializar datos de prueba 1
     */
    public static void inicializarDatos() {
        Empresa empresa = new Empresa("Movilidad SA");

        /*
        /* Creación del propietario y vehículos
         */
        Propietario propietario1 = new Propietario("Pepe", "1087643301", "pepitoperez@gmail.com", "3216627148");
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga("ABC123", "2020", "Toyota", "Blanco", 15.0, 4);
        VehiculoTransporte vehiculoTransporte1 = new VehiculoTransporte("XYZ789", "2019", "Ford", "Negro", 45);
        propietario1.agregarVehiculo(vehiculoCarga1);
        propietario1.agregarVehiculo(vehiculoTransporte1);

        /*
        /* Método agregar Propietario a la Empresa
         */
        empresa.agregarPropietario(propietario1);

        System.out.println("Datos de prueba inicializados.");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
    }
}
}