public class NodoPaciente {
    String id;
    String nombre;
    int edad;
    String clinica;
    NodoPaciente siguiente;

    public NodoPaciente(String id, String nombre, int edad, String clinica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.clinica = clinica;
        this.siguiente = null;
    }
}
