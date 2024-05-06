package poo_java.controller;

/**
 *
 * @author Efrain
 */
public class POO_JAVA {

    public static void main(String[] args) {

        ClientController instanciaClient = ClientController.instancia();
        instanciaClient.regiterClient(1, 123456789, "Juan Pérez", "123456789", "juan@example.com");
        instanciaClient.regiterClient(1, 123456789, "Efra Contrera", "123456789", "juan@example.com");
        instanciaClient.showClient();

    }

}
