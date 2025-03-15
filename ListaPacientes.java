public class ListaPacientes {
    private NodoPaciente cabeza; // Primer nodo de la lista

    public void agregarPaciente(String id, String nombre, int edad, String clinica) {
        NodoPaciente nuevo = new NodoPaciente(id, nombre, edad, clinica);
        if (cabeza == null) {
            cabeza = nuevo; // Si la lista está vacía, el nuevo nodo es la cabeza
        } else {
            NodoPaciente actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Avanza hasta el último nodo
            }
            actual.siguiente = nuevo; // Agrega el nuevo nodo al final
        }
    }

    public NodoPaciente buscarPaciente(String id) {
        NodoPaciente actual = cabeza;
        while (actual != null) {
            if (actual.id.equals(id)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null; // Retorna el nodo si encuentra el ID
    }

    public boolean eliminarPaciente(String id) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.id.equals(id)) {
            cabeza = cabeza.siguiente; // Elimina la cabeza si es el paciente buscado
            return true;
        }
        NodoPaciente actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.id.equals(id)) {
            actual = actual.siguiente; // Busca el nodo antes del que se eliminará
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            return true;
        }
        return false; // Si el paciente no es encontrado
    }

    public void mostrarPacientes() {
        NodoPaciente actual = cabeza;
        while (actual != null) {
            System.out.println("ID: " + actual.id + ", Nombre: " + actual.nombre + ", Edad: " + actual.edad + ", Clínica: " + actual.clinica);
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
    }
}
