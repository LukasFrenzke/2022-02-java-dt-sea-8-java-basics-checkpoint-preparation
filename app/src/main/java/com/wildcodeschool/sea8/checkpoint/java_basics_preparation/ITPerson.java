package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public abstract class ITPerson {

    protected String name;

    public ITPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean hasReadAccess();
    public abstract boolean hasWriteAccess();

}
