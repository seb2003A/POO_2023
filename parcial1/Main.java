
public class Main {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Set<String> placas = new HashSet<>();

        ///////////// Lleno el arrreglo con 10 datos distintos
        vehiculos.add(new Automovil("toyota", "hilux 4x4", 2015, "obi wan Kenobi", 4, "POEW13D"));
        vehiculos.add(new Automovil("honda", "Civic", 2019, "anakin skywalkwer", 4, "POI12Q"));
        vehiculos.add(new Motocicleta("yamaha", "mt-07", 2020, "carlos ramirez", "SQWR12V", 700.0));
        vehiculos.add(new Motocicleta("bajaja", "boxer ct 150", 2023, "ana sanchez", "FPU43C", 150.0));
        vehiculos.add(new Automovil("ford", "focus", 2017, "pedro picapiedra", 4, "DEDA12C"));
        vehiculos.add(new Motocicleta("suzuki", "GSX-R750", 2021, "cal kestis", "SAD12B", 750.0));
        vehiculos.add(new Automovil("nissan", "sentra", 2016, "yoda garcia", 4, "SOUT12D"));
        vehiculos.add(new Motocicleta("suzuki", "gixxer", 2019, "mace windu", "QWE54X", 250.0));
        vehiculos.add(new Automovil("chevrolet", "camaron", 2020, "carmen morales", 4, "CCO45F"));
        vehiculos.add(new Motocicleta("honda", "navi", 2017, "patricia gomez", "QWE12E", 125.0));

        //////////confirma duplicidad de placas y muestra la información de cada vehiculo
        for (Vehiculo vehiculo : vehiculos) {
            if (placas.contains(vehiculo.getPlaca())) {
                System.out.println("Duplicidad de placas para la placa: " + vehiculo.getPlaca());
            } else {
                placas.add(vehiculo.getPlaca());
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
                System.out.println("");
            }
        }

        /////////modificar el nombre del propietario de un vehiculo en especifico
        modificarNombrePropietario(vehiculos, "Carlos Ramirez", "Carlos Rodriguez");

        // obtener todos los Vehiculos (Para verificar que se modifico)
        System.out.println("Vehiculos después de la modificación:");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            System.out.println();
        }           

     
        buscarVehiculoPorPlaca(vehiculos, "POI12Q"); //con la placa que deseas buscar
    }

    private static void modificarNombrePropietario(List<Vehiculo> vehiculos, String propietarioActual, String nuevoPropietario) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPropietario().equals(propietarioActual)) {
                vehiculo.mostrarInformacion();
                System.out.println("Modificando propietario de " + propietarioActual + " a " + nuevoPropietario);
                vehiculo.setPropietario(nuevoPropietario);
                System.out.println("Propietario modificado con éxito.");
                vehiculo.mostrarInformacion();
                break;
            }
        }
    }
 ////buscar vehiculo pr placa//
    private static void buscarVehiculoPorPlaca(List<Vehiculo> vehiculos, String placaBuscada) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placaBuscada)) {
                System.out.println("Vehiculo con placa " + placaBuscada + ":");
                vehiculo.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con la placa " + placaBuscada);
    }
}





