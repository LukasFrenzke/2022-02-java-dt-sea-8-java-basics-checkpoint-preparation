package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        // Get the name of the ITPerson, repair it and return the new name
        // EG: person.getName() -> "Super_Admin" -> return "Super Admin"
        String wrongName = person.getName();
        String[] parts = wrongName.split("_", 2);
        String newName = parts[0] + " " + parts[1];
        return newName;
    }
}
