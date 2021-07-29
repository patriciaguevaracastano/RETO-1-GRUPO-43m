
package retoi;


public class PersonClass {
    //Pocedimientos aplicar:
    //1. Declarar las variables de forma privada
    //2. Encapsulate fields(GET y SET). Clic secundario> Refactor> Encapsulate fields
    //3. Insertar el constructor de la clase. Clic secundario> Insert code> Constructor
    //4. Crear función o método que retorna o imprime los getter de la clase.
    private String nombre;
    private String tipo_documento;
    private int nro_documento;
    private int edad;
    private char genero;
    private float peso;
    private float estatura;
    private String nro_celular;
    private String direccion;
    private String email;
    private boolean ucaldas;
    
    //3. Insertar el constructor de la clase. Clic secundario> Insert code> Constructor
    public PersonClass(String nombre, String tipo_documento, int nro_documento, int edad, char genero, float peso, float estatura, String nro_celular, String direccion, String email, boolean ucaldas) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.nro_documento = nro_documento;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
        this.nro_celular = nro_celular;
        this.direccion = direccion;
        this.email = email;
        this.ucaldas = ucaldas;
    }

     
    //2. Encapsulate fields(GET y SET). Clic secundario> Refactor> Encapsulate fields
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getTipo_documento() {
        return tipo_documento;
    }

    
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

   
    public int getNro_documento() {
        return nro_documento;
    }

   
    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public char getGenero() {
        return genero;
    }

    
    public void setGenero(char genero) {
        this.genero = genero;
    }

    
    public float getPeso() {
        return peso;
    }

    
    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    public float getEstatura() {
        return estatura;
    }

    
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    
    public String getNro_celular() {
        return nro_celular;
    }

    
    public void setNro_celular(String nro_celular) {
        this.nro_celular = nro_celular;
    }

   
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public boolean isUcaldas() {
        return ucaldas;
    }

    
    public void setUcaldas(boolean ucaldas) {
        this.ucaldas = ucaldas;
        
    }
    
    //4. Crear función o método que retorna o imprime los getter de la clase.
    // A continuacion se presentan dos formas:
    
    //FORMA I: Funcion que retorna los Getter de la clase. 
    public String consultar_informacion_persona(){
        return "* Persona consultada desde la funcion 'FORMA I':\n     >>Nombre:                  " + getNombre() + "\n     >>Tipo de documento es:    " + getTipo_documento() + "\n     >>Numero de documento es:  " + getNro_documento() + "\n     >>La edad es:              " + getEdad() + "\n     >>Genero:                  " + getGenero() + "\n     >>Tiene de estatura:       " + getEstatura() + "\n     >>el numero de celular es: " + getNro_celular() + "\n     >>La direccion es:         " + getDireccion() + "\n     >>El email es:             " + getEmail() + "\n     >>Se encuentra registrado en la universidad: " + isUcaldas();
    }
    
    //FORMA II: Metodo que imprime los Getter de la clase.
    public void consultar_info_persona(){
        System.out.println("\n\n * Persona consultada desde el metodo 'FORMA II':\n     >>Nombre:                  " +getNombre() + "\n     >>Tipo de documento es:    " + getTipo_documento() + "\n     >>Numero de documento es:  " + getNro_documento() + "\n     >>La edad es:              " + getEdad() + "\n     >>Genero:                  " + getGenero() + "\n     >>Tiene de estatura:       " + getEstatura() + "\n     >>el numero de celular es: " + getNro_celular() + "\n     >>La direccion es:         " + getDireccion() + "\n     >>El email es:             " + getEmail() + "\n     >>Se encuentra registrado en la universidad: " + isUcaldas());
    }
    
    public void consultar_informacion_persona(int nro_documento){
        if (getNro_documento()== nro_documento){
            System.out.println("\n\n * Persona consultada se encuentra registrada:\n     >>Nombre:                  " +getNombre() + "\n     >>Tipo de documento es:    " + getTipo_documento() + "\n     >>Numero de documento es:  " + getNro_documento() + "\n     >>La edad es:              " + getEdad() + "\n     >>Genero:                  " + getGenero() + "\n     >>Tiene de estatura:       " + getEstatura() + "\n     >>el numero de celular es: " + getNro_celular() + "\n     >>La direccion es:         " + getDireccion() + "\n     >>El email es:             " + getEmail() + "\n     >>Se encuentra registrado en la universidad: " + isUcaldas());
        } else{
            System.out.println("\n\n * La persona no esta registrada en la universidad");
        }
       
    }
    public void iniciar_sesion(int nro_documento){
        if (getNro_documento() == nro_documento){
            System.out.println("\n\n * Persona consultada se encuentra registrada y puede iniciar sesion:\n     >>Nombre:                  " +getNombre() + "\n     >>Tipo de documento es:    " + getTipo_documento() + "\n     >>Numero de documento es:  " + getNro_documento() + "\n     >>La edad es:              " + getEdad() + "\n     >>Genero:                  " + getGenero() + "\n     >>Tiene de estatura:       " + getEstatura() + "\n     >>el numero de celular es: " + getNro_celular() + "\n     >>La direccion es:         " + getDireccion() + "\n     >>El email es:             " + getEmail() + "\n     >>Se encuentra registrado en la universidad: " + isUcaldas());
        }else{
            System.out.println("\n\n * La persona no se encuentra registrada y no puede iniciar sesion");
        }
      
    }
    
   public void editar_perfil(){
       System.out.println("\n\n * Bienvenida usted puede editar su perfil");
   }
   public void cerrar_sesion(){
       System.out.println("\n\n * Tarea finalizada, puede cerrar sesion");
   }
}

