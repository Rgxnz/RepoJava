package view.console;

import java.util.ArrayList;
import java.util.Scanner;
import model.coche;
import model.ColorEnum;
import model.TipoEnum;
import model.camion;
import model.moto;
import model.vehiculo;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<vehiculo> listaVehiculos = new ArrayList<>();

    public static void main(String[] args) {

//        ArrayList<coche> listaCoches = new ArrayList<>();
//        ArrayList<moto> listaMotos = new ArrayList<>();
//        ArrayList<camion> listaCamiones = new ArrayList<>();
        vehiculo car1 = new coche("Ferrari", "1234ABC", "F8 Tributo", 720, ColorEnum.ROJO, "V8", "Deportivas", 4.0, 0, 274000, TipoEnum.DEPORTIVO, "01/01/2020");
        vehiculo car2 = new coche();

        System.out.println(listaVehiculos.size());
        listaVehiculos.add(car1);
        listaVehiculos.add(car2);
        System.out.println(listaVehiculos.size());

        int num = 0;
        for (vehiculo Coche : listaVehiculos) {
            num++;
            System.out.println("Coche " + num + ": " + Coche);
            calcularVelocidadMax(Coche);
        }

        vehiculo moto1 = new moto("Benda", "5678ABC", "Dark Flag", 500, ColorEnum.NEGRO, "V4", "algo", 4.0, 200, 8000, TipoEnum.INDIAN, "28/02/2021", true);
        vehiculo moto2 = new moto();

        System.out.println(listaVehiculos.size());
        listaVehiculos.add(moto1);
        listaVehiculos.add(moto2);
        System.out.println(listaVehiculos.size());

        for (vehiculo Moto : listaVehiculos) {
            num++;
            System.out.println("Moto " + num + ": " + Moto);
            calcularVelocidadMax(Moto);
        }

        vehiculo camion1 = new camion("Mercedes", "1234DEF", "nose", 300, ColorEnum.NEGRO, "V12", "algo", 8.0, 150, 20000, TipoEnum.CAMION, "28/02/2021", 1000, 4);
        vehiculo camion2 = new camion();

        System.out.println(listaVehiculos.size());
        listaVehiculos.add(camion1);
        listaVehiculos.add(camion2);
        System.out.println(listaVehiculos.size());

        for (vehiculo Camion : listaVehiculos) {
            num++;
            System.out.println("Camion " + num + ": " + Camion);
            calcularVelocidadMax(Camion);
        }

//        System.out.println("Marca: " + car1.getMarca());
//        System.out.println("Matricula: " + car1.getMatricula());
//        System.out.println("Modelo: " + car1.getModelo());
//        System.out.println("Potencia: " + car1.getPotencia());
//        System.out.println("Color: " + car1.getColor());
//        System.out.println("Motor: " + car1.getMotor());
//        System.out.println("Tipo de Rueda: " + car1.getTipoRueda());
//        System.out.println("Frenos: " + car1.getFrenos());
//        System.out.println("Velocidad: " + car1.getVelocidad());
//        System.out.println("Precio: " + car1.getPrecio());
//        System.out.println("Tipo: " + car1.getTipo());
//        System.out.println("Fecha de Fabricación: " + car1.getFechaFabricacion());
        int opcion;
        do {
            System.out.println("Oriol Arcarons Roig");
            System.out.println("----MENU----");
            System.out.println("1. Crear vehiculo");
            System.out.println("2. Mostrar matriculas");
            System.out.println("3. Mostrar datos del vehiculo");
            System.out.println("4. Mostar total");
            System.out.println("5. Eliminar vehiculo");
            System.out.println("6. Salir");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que quieres crear?");
                    System.out.println("1. Coche");
                    System.out.println("2. Moto");
                    System.out.println("3. Camion");
                    System.out.println("4. Salir");
                    System.out.print("Introduce una opcion: ");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            coche x = crearCoche();
                            listaVehiculos.add(x);
                            System.out.println("Size lista vehiculos: " + listaVehiculos.size());
                            break;
                        case 2:

                            moto y = crearMoto();
                            listaVehiculos.add(y);
                            System.out.println("Size lista vehiculos: " + listaVehiculos.size());
                            break;
                        case 3:
                            camion z = crearCamion();
                            listaVehiculos.add(z);
                            System.out.println("Size lista vehiculos: " + listaVehiculos.size());
                            break;

                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    mostrarMatricula();
                    break;
                case 3:
                    pedirMatricula();
                    break;
                case 4:
                    System.out.println("1. Total vehiculos");
                    System.out.println("2. Total coches");
                    System.out.println("3. Total motos");
                    System.out.println("4. Total camiones");
                    System.out.print("Introduce una opcion: ");
                    opcion = sc.nextInt();
                    switch (opcion) {

                        case 1:
                            System.out.println("Total de vehiculos: " + listaVehiculos.size());
                            break;
                        case 2:
                            totalCoches();
                            break;
                        case 3:
                            totalMotos();
                            break;
                        case 4:
                            totalCamiones();
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 5:
                    eliminarVehiculo();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);

        sc.close();
    }

    private static void calcularVelocidadMax(vehiculo v) {
        System.out.println("La velocidad maxima del vehiculo es: " + (200 + 10 * v.getPotencia()));
    }

    private static coche crearCoche() {
        System.out.println("Introduce los siguientes datos");
        System.out.print("Marca (String): ");
        String marca = sc.next();
        System.out.print("Matricula (String): ");
        String matricula = sc.next();
        System.out.print("Modelo (String): ");
        String modelo = sc.next();
        System.out.print("Potencia (double): ");
        double potencia = sc.nextDouble();
        System.out.print("Color (Rojo, Azul, Negro, Gris)");
        ColorEnum color = ColorEnum.valueOf(sc.next().toUpperCase());
        System.out.print("Motor (String): ");
        String motor = sc.next();
        System.out.print("Tipo de rueda (String): ");
        String TipoRueda = sc.next();
        System.out.print("Frenos (double): ");
        double frenos = sc.nextDouble();
        System.out.print("Velocidad (double): ");
        double velocidad = sc.nextDouble();
        System.out.print("Precio (double): ");
        double precio = sc.nextDouble();
        System.out.print("Tipo (Suv, Sedan, Coupe, Furgon, Descapotable, Monovolumen, Break, Urban, Deportivo): ");
        TipoEnum tipo = TipoEnum.valueOf(sc.next().toUpperCase());
        System.out.println("Fecha de fabricacion (DD/MM/YYYY): ");
        String fechaFabricacion = sc.next();
        System.out.println("Numero de puertas (int): ");
        int numPuertas = sc.nextInt();
        return new coche(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion, numPuertas);
    }

    private static moto crearMoto() {
        System.out.println("Introduce los siguientes datos");
        System.out.print("Marca (String): ");
        String marca = sc.next();
        System.out.print("Matricula (String): ");
        String matricula = sc.next();
        System.out.print("Modelo (String): ");
        String modelo = sc.next();
        System.out.print("Potencia (double): ");
        double potencia = sc.nextDouble();
        System.out.print("Color (Rojo, Azul, Negro, Gris): ");
        ColorEnum color = ColorEnum.valueOf(sc.next().toUpperCase());
        System.out.print("Motor (String): ");
        String motor = sc.next();
        System.out.print("Tipo de rueda (String): ");
        String TipoRueda = sc.next();
        System.out.print("Frenos (double): ");
        double frenos = sc.nextDouble();
        System.out.print("Velocidad (double): ");
        double velocidad = sc.nextDouble();
        System.out.print("Precio (double): ");
        double precio = sc.nextDouble();
        System.out.print("Tipo (Indian, Break, Urban, Deportivo): ");
        TipoEnum tipo = TipoEnum.valueOf(sc.next().toUpperCase());
        System.out.println("Fecha de fabricacion (DD/MM/YYYY): ");
        String fechaFabricacion = sc.next();
        System.out.println("Tiene sidecar? (Yes/No): ");
        String x = sc.next().toUpperCase();
        boolean tieneSidecar = false;
        if (x.equalsIgnoreCase("YES")) {
            tieneSidecar = true;
        }
        return new moto(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion, tieneSidecar);
    }

    private static camion crearCamion() {
        System.out.println("Introduce los siguientes datos");
        System.out.print("Marca (String): ");
        String marca = sc.next();
        System.out.print("Matricula (String): ");
        String matricula = sc.next();
        System.out.print("Modelo (String): ");
        String modelo = sc.next();
        System.out.print("Potencia (double): ");
        double potencia = sc.nextDouble();
        System.out.print("Color (Rojo, Azul, Negro, Gris)");
        ColorEnum color = ColorEnum.valueOf(sc.next().toUpperCase());
        System.out.print("Motor (String): ");
        String motor = sc.next();
        System.out.print("Tipo de rueda (String): ");
        String TipoRueda = sc.next();
        System.out.print("Frenos (double): ");
        double frenos = sc.nextDouble();
        System.out.print("Velocidad (double): ");
        double velocidad = sc.nextDouble();
        System.out.print("Precio (double): ");
        double precio = sc.nextDouble();
        System.out.print("Tipo (Camion): ");
        TipoEnum tipo = TipoEnum.valueOf(sc.next().toUpperCase());
        System.out.println("Fecha de fabricacion (DD/MM/YYYY): ");
        String fechaFabricacion = sc.next();
        System.out.println("MMA (double): ");
        double MMA = sc.nextDouble();
        System.out.println("Altura (double): ");
        double altura = sc.nextDouble();
        return new camion(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion, MMA, altura);
    }

    private static void mostrarMatricula() {
        for (vehiculo Vehiculo : listaVehiculos) {
            int num = 0;
            num++;
            System.out.println("Matricula del vehiculo " + num + ":  " + Vehiculo.getMatricula());

        }

    }

    private static void pedirMatricula() {
        String x;
        System.out.println("Dime la matricula de un vehiculo: ");
        x = sc.next();
        for (vehiculo Vehiculo : listaVehiculos) {
            if (x.equals(Vehiculo.getMatricula())) {
                System.out.println(Vehiculo.toString());
            }
        }

    }

    private static void totalCoches() {
        int totalCoches = 0;
        for (vehiculo x : listaVehiculos) {
            if (x instanceof coche) {
                totalCoches++;
            }
        }
        System.out.println("Total coches: " + totalCoches);

    }

    private static void totalMotos() {
        int totalMotos = 0;
        for (vehiculo y : listaVehiculos) {
            if (y instanceof moto) {
                totalMotos++;
            }
        }
        System.out.println("Total motos: " + totalMotos);

    }

    private static void totalCamiones() {
        int totalCamiones = 0;
        for (vehiculo z : listaVehiculos) {
            if (z instanceof camion) {
                totalCamiones++;
            }
        }
        System.out.println("Total camiones: " + totalCamiones);

    }

    private static void eliminarVehiculo() {
        String x;
        System.out.println("Introduce la matricula del vehiculo que deseas eliminar: ");
        x = sc.next().toUpperCase();
        boolean y = false;
        for (vehiculo Vehiculo : listaVehiculos) {
            if (x.equalsIgnoreCase(Vehiculo.getMatricula())) {
                y = true;
                listaVehiculos.remove(Vehiculo);
                System.out.println("El vehiculo ha sido eliminado correctamente");
                break;
            } else {
                System.out.println("La matricula introducida no es correcta");
            }
            
        }

    }
}
