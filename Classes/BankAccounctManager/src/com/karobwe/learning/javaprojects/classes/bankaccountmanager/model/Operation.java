package com.karobwe.learning.javaprojects.classes.bankaccountmanager.model;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Chanfi Attoumani <attoumani.chanfi@netcourrier.com>
 */
public class Operation {
    
    private int idOperation;
    private String description;
    private Date dateOperation;
    
    private static int instanceNumer = 0;

    public Operation(String description) {
        this.idOperation = instanceNumer;
        this.description = description;
        this.dateOperation = new Date();
        
        instanceNumer++;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public static int getInstanceNumer() {
        return instanceNumer;
    }
    
}
