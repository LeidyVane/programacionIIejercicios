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
        Propietario propietario1 = new Propietario("Pepito Perez", "123", "pepe@gmail.com", "45674", 18);
        VehiculoCarga vehiculo1 = new VehiculoCarga("GPL124", "2019", "toyota", "Rojo", 1500, 2,3);
        propietario1.asociarVehiculo(vehiculo1);

        empresa.agregarPropietario(propietario1);
        empresa.agregarVehiculo(vehiculo1);

    }
}
