package org.example;


public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Movilidad SA");
        inicializarDatos(empresa);

        MainTransporte menu = new MainTransporte(empresa);
        menu.mostrarMenu();
    }

    /**
     * Método para inicializar datos de la Empresa
     * 
     * @param empresa
     */
    public static void inicializarDatos(Empresa empresa) {
        // Crear propietarios, vehículos y asociarlos
        Propietario propietario1 = new Propietario("Juan Pérez", "12345678", "juan@example.com", "555-1234", 45);
        VehiculoCarga vehiculo1 = new VehiculoCarga("ABC123", "ModeloX", "MarcaY", "Rojo", 1500.0, 2,3);
        propietario1.asociarVehiculo(vehiculo1);

        empresa.agregarPropietario(propietario1);
        empresa.agregarVehiculo(vehiculo1);

        // Más inicializaciones según sea necesario
    }
}
