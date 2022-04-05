package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<I> {
    List<I> itcrowd = new ArrayList();

    public boolean storePerson(I person) {
        return itcrowd.add(person);
    }

    public I getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    public I getFirstStoredPerson() {
        return itcrowd.get(0);
    }
}
