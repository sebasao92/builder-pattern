public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String id;
    private String telefono;
    private String direccion;
    private Genero genero;

    public Persona(String nombre, String apellido, int edad, String email, String id, String telefono, String direccion, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "Nombre:" + nombre +
                " Apellido:" + apellido +
                " Edad:" + edad +
                " Email:" + email +
                " Id:" + id +
                " Teléfono:" + telefono +
                " Dirección:" + direccion +
                " Género:" + genero;
    }

    public static PersonaBuilder builder(){
        return new PersonaBuilder();
    }

    public static class PersonaBuilder {
        private String nombre;
        private String apellido;
        private int edad;
        private String email;
        private String id;
        private String telefono;
        private String direccion;
        private Genero genero;

        public PersonaBuilder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public PersonaBuilder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PersonaBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public PersonaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonaBuilder id(String id) {
            this.id = id;
            return this;
        }

        public PersonaBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public PersonaBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public PersonaBuilder genero(Genero genero) {
            this.genero = genero;
            return this;
        }

        public Persona build(){
            return new Persona(nombre, apellido, edad, email, id, telefono, direccion, genero);
        }
    }
}
