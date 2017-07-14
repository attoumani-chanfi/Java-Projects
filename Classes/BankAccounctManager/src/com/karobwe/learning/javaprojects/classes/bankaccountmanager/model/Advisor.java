package com.karobwe.learning.javaprojects.classes.bankaccountmanager.model;

import java.util.ArrayList;

/**
 *
 * @author Chanfi Attoumani <attoumani.chanfi@netcourrier.com>
 */
public class Advisor extends User {
    
    private static ArrayList<Client> clientList = new ArrayList();
    private static int numerInstanceAdvisor = 0;
    
    public Advisor(String fullname) {
        super(fullname);
        this.idUser = numerInstanceAdvisor;
        numerInstanceAdvisor++;
    }
    
    /**
     * Create a new account
     * @param initialBalance
     * @param owner 
     */
    public void createAccount(double initialBalance, Client owner) throws AccountManagerException {
        Account newAccount = new Account(initialBalance, owner);
        try {
            Client.getAccountList().add(newAccount);
        } catch (Exception e) {
            throw new AccountManagerException("An error was detected when trying to create new account.\n" + e.getMessage());
        }
    }
    
    /**
     * Remove specified Account from accountList
     * @param accountToRemove 
     */
    public void removeAccount(Account accountToRemove) throws AccountManagerException {
        try {
            Client.getAccountList().remove(accountToRemove);
        } catch (Exception e) {
            throw new AccountManagerException("An error was detected when trying to remove an account.\n" + e.getMessage());
        }
    }
    
    /**
     * Register a new Client
     * @param fullname 
     */
    public void createClient(String fullname) throws UserManagerException {
        Client newClient = new Client(fullname);
        try {
            this.clientList.add(newClient);
        } catch (Exception e) {
            throw new UserManagerException("An error was detected when trying to create new client.\n" + e.getMessage());
        }
    }
    
    /**
     * Update the name of a client
     * @param idClient
     * @param newFullname 
     * @TODO Choose to edit fullname, password or both.
     */
    public void editClient(int idClient, String newFullname) throws UserManagerException {
        try {
            this.clientList.get(idUser).setFullname(fullname);
        } catch (Exception e) {
            throw new UserManagerException("An error was detected when trying to update client's informations.");
        }
    }
    
    /**
     * Remove the client on the list who has a key matching with client's id
     * @param clientToRemove 
     */
    public void removeClient(Client clientToRemove) throws UserManagerException {
        try {
            this.clientList.remove(clientToRemove.getIdUser());
        } catch (Exception e) {
            throw new UserManagerException("An error was detected when trying to remove a client.");
        }
    }

    public static ArrayList<Client> getClientList() {
        return clientList;
    }

    public static int getNumerInstanceAdvisor() {
        return numerInstanceAdvisor;
    }

    public static void setNumerInstanceAdvisor(int numerInstanceAdvisor) {
        Advisor.numerInstanceAdvisor = numerInstanceAdvisor;
    }
    
}
