package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Admin here.
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        LocalDate localDate = LocalDate.now();
        if (this.lastCertified.isAfter(localDate.minusYears(1))){
            return true;
        }else{
            return false;
        }
        // Add logic to evaluate Write access for Admin here.
        
    }
}
