package com.karobwe.learning.javaprojects.classes.bankaccountmanager.model;

import java.util.ArrayList;

/**
 *
 * @author Chanfi Attoumani <attoumani.chanfi@netcourrier.com>
 */
public class Client extends User {
    
    private static ArrayList<Account> accountList = new ArrayList();
    private static int numberInstanceClient = 0;
    
    public Client(String fullname) {
        super(fullname);
        this.idUser = numberInstanceClient;
        numberInstanceClient++;
    }
    
    /**
     * Substract indicated sum from the specified account's balance.
     * @param ac
     * @param sum 
     */
    public void withdrawalMoney(Account ac, double sum) throws AccountManagerException {
        try {
            ac.setBalance(ac.getBalance() - sum);
        } catch (Exception e) {
            throw new AccountManagerException("An error was produced when trying to withdraw money.\n" + e.getMessage());
        }
    }
    
    /**
     * Add indicated sum to the specified account's balance.
     * @param ac
     * @param sum
     * @throws AccountManagerException 
     */
    public void creditAccount(Account ac, double sum) throws AccountManagerException {
        try {
            ac.setBalance(ac.getBalance() + sum);
        } catch (Exception e) {
            throw new AccountManagerException("An error was detected when trying to credit an account.\n" + e.getMessage());
        }
    }

    public static ArrayList<Account> getAccountList() {
        return accountList;
    }

    public static int getNumberInstanceClient() {
        return numberInstanceClient;
    }

    public static void setNumberInstanceClient(int numberInstanceClient) {
        Client.numberInstanceClient = numberInstanceClient;
    }
    
}
