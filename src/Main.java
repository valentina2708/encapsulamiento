public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

         persona.setNombre("Maria");
         persona.setEdad(30);
         persona.setTelefono(8356078);


        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}