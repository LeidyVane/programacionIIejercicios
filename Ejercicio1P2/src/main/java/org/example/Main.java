package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        inicializarDatos(empresa);

        MainTransporte menu = new MainTransporte(empresa);
        menu.mostrarMenu();
    }

    public static void inicializarDatos(Empresa empresa) {
        // Crear propietarios, vehículos y asociarlos
        Propietario propietario1 = new Propietario("Pepito Pérez", "12345678", "juan@example.com", "555-1234", 21);
        VehiculoCarga vehiculo1 = new VehiculoCarga("ABC123", "ModeloX", "MarcaY", "Rojo", 1500.0, 2);
        propietario1.asociarVehiculo(vehiculo1);

        empresa.agregarPropietario(propietario1);
        empresa.agregarVehiculo(vehiculo1);

        // Más inicializaciones según sea necesario
    }
}