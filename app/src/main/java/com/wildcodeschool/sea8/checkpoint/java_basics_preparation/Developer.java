package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Developer here.
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        LocalDate localDate = LocalDate.now();
        if(this.employmentDate.isBefore(localDate.minusMonths(6))){
            return true;
        }else{
            return false;
        }
        // Add logic to evaluate Write access for Developer here.
    }
}
