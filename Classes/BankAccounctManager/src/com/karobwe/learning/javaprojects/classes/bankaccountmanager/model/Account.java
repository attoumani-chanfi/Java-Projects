package com.karobwe.learning.javaprojects.classes.bankaccountmanager.model;

import java.util.ArrayList;

/**
 *
 * @author Chanfi Attoumani <attoumani.chanfi@netcourrier.com>
 */
public class Account {
    
    private int idAccount;
    private double balance;
    private Client owner;
    
    private static ArrayList<Operation> listOperation = new ArrayList();
    private static int numberInstanceAccount = 0;

    public Account(double initialBalance, Client owner) {
        this.idAccount = numberInstanceAccount;
        this.balance = initialBalance;
        this.owner = owner;
        numberInstanceAccount++;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public static ArrayList<Operation> getListOperation() {
        return listOperation;
    }

    public static int getNumerAccountInstance() {
        return numberInstanceAccount;
    }
    
}
