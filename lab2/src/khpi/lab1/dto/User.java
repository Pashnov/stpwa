package khpi.lab1.dto;

import khpi.lab1.storege.Storage;

public class User {

    private final String fullName;
    private final Storage storage;

    public String getFullName(){
        return fullName;
    }

    public User(String fullName, Storage storage) {
        this.fullName = fullName;
        this.storage = storage;
    }

    private void make() {
        //do something with storage
    }
}
