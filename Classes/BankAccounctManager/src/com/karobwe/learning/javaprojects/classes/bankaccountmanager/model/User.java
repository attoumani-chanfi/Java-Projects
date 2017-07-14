package com.karobwe.learning.javaprojects.classes.bankaccountmanager.model;

import java.util.ArrayList;

/**
 *
 * @author Chanfi Attoumani <attoumani.chanfi@netcourrier.com>
 */
public abstract class User {
    
    protected int idUser;
    protected String fullname;
    protected String password;
    
    public User(String fullname) {
        this.fullname = fullname;
        this.password = this.getClass().getSimpleName().toLowerCase();
        
    }
    
    public User(String fullname, String password) {
        this.fullname = fullname;
        this.password = password;
    }
    
    /**
     * Get a list of all operations mad in the specified account.
     * @param accountToCheck
     * @return
     * @throws AccountManagerException 
     */
    protected ArrayList<Operation> viewHistory(Account accountToCheck) throws AccountManagerException {
        try {
            return accountToCheck.getListOperation();
        } catch (Exception e) {
            throw new AccountManagerException("An error was detected when trying to view an account history.\n" + e.getMessage());
        }
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
}
