import java.util.Scanner;

public class CentralPacientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaPacientes lista = new ListaPacientes();
        int opcion;
        
        do { //Menu inicial
            System.out.println("\n--- Central de Pacientes ---");
            System.out.println("1. Agregar Paciente");
            System.out.println("2. Mostrar Pacientes");
            System.out.println("3. Buscar Paciente");
            System.out.println("4. Eliminar Paciente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese Clínica: ");
                    String clinica = scanner.nextLine();
                    lista.agregarPaciente(id, nombre, edad, clinica); //Agregamos el paciente a los nodos
                    System.out.println("Paciente agregado con éxito.");
                    break;
                case 2:
                    System.out.println("\nLista de Pacientes:");
                    lista.mostrarPacientes();
                    break;
                case 3:
                    System.out.print("Ingrese ID del paciente a buscar: ");
                    String idBuscar = scanner.nextLine();
                    NodoPaciente paciente = lista.buscarPaciente(idBuscar); //Busca directamente en el nodo
                    if (paciente != null) {
                        System.out.println("Encontrado: ID: " + paciente.id + ", Nombre: " + paciente.nombre + ", Edad: " + paciente.edad + ", Clínica: " + paciente.clinica);
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese ID del paciente a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    if (lista.eliminarPaciente(idEliminar)) { //Hcemos uso de eliminarPaciente para eliminar el nodo
                        System.out.println("Paciente eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró un paciente con ese ID.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}
