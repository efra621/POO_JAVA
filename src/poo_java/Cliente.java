package poo_java;

//Creo modelo Cliente
public class Cliente {

    //Agrego atributos
    //Agrego el encapsulamiento private
    
    /** private: Lo q hace es q solo se pueda acceder/modificar a los atributos 
    desde la clase en donde fue inicializado
    */

    private int code;
    private int phoneNumb;
    private String document;
    private String name;
    private String email;
    
    //ERROR: 
    //String email --> Esto esta mal 
    /**Rompe con el paradigmas (POO) ya q se puede modificar desde cualquier lado
    */

    //Genero un constructor vacio
    public Cliente() {
        
    }

    /**this : Palabra reservada en Java para hacer referencia a una variable en
    concreto (funciona como un puntero)
    */
    public Cliente(int code, int phone_numb, String document, String name, String email) {
        this.code = code; //this.code hace referencia a la variable q creamos en la linea 13
        phoneNumb = phone_numb;  //Tambien se puede colocar facilmente otro nombre y no necesitariamos "this"
        this.document = document;
        this.name = name;
        this.email = email;
    }

    /**  get: Para q sirve? 
    El metodo get = obtener este metodo sirve como su nombre lo indica para obtener 
    el valor asignado
    */
    
    public int getCode() {
        return code;
    }

    /** set: Para q sirve?
    El metodo set = modificar valores 
     */
    public void setCode(int code) {
        this.code = code;
    }

    public int getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(int phone_numb) {
        this.phoneNumb = phone_numb;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
