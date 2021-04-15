public class Main {

    public static void main(String[] args) {
        new Persona("Sebastián", "David", 12, "hola@sebas.com", "123", "1234", "cualquiera", Genero.HOMBRE);
        Persona persona = Persona.builder()
                .nombre("")
                .apellido("")
                .id("")
                .direccion("")
                .genero(Genero.HOMBRE)
                .edad(12)
                .build();
        System.out.println(persona);
    }
}
