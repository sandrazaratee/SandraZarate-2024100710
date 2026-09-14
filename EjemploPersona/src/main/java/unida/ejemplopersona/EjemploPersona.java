package unida.ejemplopersona;

public class EjemploPersona {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.edad = 19;
        
        persona.mostrarInformacion();
    }
}