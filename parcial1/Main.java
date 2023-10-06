
package parcial1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    
   public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Set<String> placas = new HashSet<>();

        ///////////// Lleno el arrreglo con 10 datos distintoss 
        vehiculos.add(new Automovil("toyota", "hilux 4x4", 2015, "obi wan Kenobi", 4,"POEW13D"));
        vehiculos.add(new Automovil("honda", "Civic", 2019, "anakin skywalkwer", 4,"POI12Q"));
        vehiculos.add(new Motocicleta("yamaha", "mt-07", 2020, "carlos ramirez", "SQWR12V",700.0));
        vehiculos.add(new Motocicleta("bajaja", "boxer ct 150", 2023, "ana sanchez", "FPU43C",150.0));
        vehiculos.add(new Automovil("ford", "focus", 2017, "pedro picapiedra", 4,"DEDA12C"));
        vehiculos.add(new Motocicleta("suzuki", "GSX-R750", 2021, "cal kestis ","SAD12B", 750.0));
        vehiculos.add(new Automovil("nissan", "sentra", 2016, "yoda garcia", 4,"SOUT12D"));
        vehiculos.add(new Motocicleta("suzuki", "gixxer", 2019, "mace windu","QWE54X", 250.0));
        vehiculos.add(new Automovil("chevrolet", "camaron", 2020, "carmen morales", 4,"CCO45F"));
        vehiculos.add(new Motocicleta("honda", "navi", 2017, "patricia gomez", "QWE12E",125.0));

        //////////confirma duplicidad de placas y muestra la información de cada vehiculo
        for (Vehiculo vehiculo : vehiculos) {
            if (placas.contains(vehiculo.getPropietario())) {
                System.out.println("Duplicidad de placas para el propietario: " + vehiculo.getPropietario());
            } else {
                placas.add(vehiculo.getPropietario());
                vehiculo.mostrarInformacion();
                System.out.println();
            }
        }

        ////////obtener  los vehiculos 
        System.out.println("Vehiculos Automovil:");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Automovil) {
                vehiculo.mostrarInformacion();
                System.out.println();
            }
        }

        /////////obtener todos las motos
        System.out.println("Vehiculos Motocicleta:");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Motocicleta) {
                vehiculo.mostrarInformacion();
                System.out.println();
            }
        }

        /////////modificar el nombre del propietario de un vehiculo en especifico
        modificarNombrePropietario(vehiculos, "Carlos Ramirez", "Carlos Rodriguez");

        // Obtener todos los Vehículos (Para verificar que se modificó)
        System.out.println("Vehiculos después de la modificacion:");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            System.out.println();
        }

        //////////obtener  un vehiculo especifico identificado por propietario
        obtenerVehiculoPorPropietario(vehiculos, "Juan Perez");
    }

    private static void modificarNombrePropietario(List<Vehiculo> vehiculos, String propietarioActual, String nuevoPropietario) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPropietario().equals(propietarioActual)) {
                vehiculo.mostrarInformacion();
                System.out.println("Modificando propietario de " + propietarioActual + " a " + nuevoPropietario);
                vehiculo.mostrarInformacion();
                vehiculo.setPropietario(nuevoPropietario);
                System.out.println("Propietario modificado con exito.");
                break;
            }
        }
    }

    private static void obtenerVehiculoPorPropietario(List<Vehiculo> vehiculos, String propietarioBuscado) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPropietario().equals(propietarioBuscado)) {
                System.out.println("Vehiculo de " + propietarioBuscado + ":");
                vehiculo.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontro ningun vehiculo para el propietario " + propietarioBuscado);
    }
}






