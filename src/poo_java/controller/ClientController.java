/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_java.controller;

import java.util.ArrayList;
import poo_java.model.Client;

/**
 *
 * @author Efrain
 */
/**
 * Singleton: un concepto para tener el codigo bien estructurado MVC (Model View
 * Controler) = (Modelo vista Controlador)
 */

//Clase controladora para Cliente
public class ClientController {

    private static ClientController clientCont;
    private ArrayList<Client> listClient;

    public ClientController() {
        listClient = new ArrayList<>();
    }

    //Esto es singleton 
    public static ClientController instancia() {
        if (clientCont == null) {
            clientCont = new ClientController();
        }
        return clientCont;
    }

    //Metodo para añadir un cliente
    public boolean addClient(Client client) {
        // add. metodo q sirve para añadir elementos a un Lista 
        return listClient.add(client); // Ejemplo, devuelve true si se agrega correctamente
    }

    // Método para registrar un cliente
    public boolean regiterClient(int code, int phoneNumber, String document, String name, String email) {
        Client client = new Client(code, phoneNumber, document, name, email);
        return addClient(client);
    }

    // Metodo para mostrar la lista de clientes
    public void showClient() {
        System.out.println("----------------------");
        System.out.println("Lista de Clientes:");
        System.out.println("----------------------");

        for (Client client : listClient) {
            System.out.println("Código: " + client.getCode());
            System.out.println("Documento: " + client.getDocument());
            System.out.println("Nombre: " + client.getName());
            System.out.println("Teléfono: " + client.getPhoneNumb());
            System.out.println("Correo electrónico: " + client.getEmail());
            System.out.println("----------------------");
        }
    }

}
