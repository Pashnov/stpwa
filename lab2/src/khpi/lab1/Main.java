package khpi.lab1;

import khpi.lab1.dto.User;
import khpi.lab1.storege.AmazonS3Storage;
import khpi.lab1.storege.LocalFileSystemStorage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var user1 = new User("user1", LocalFileSystemStorage.getInstance());
        var user2 = new User("user2", LocalFileSystemStorage.getInstance());
        var user3 = new User("user3", AmazonS3Storage.getInstance());
    }
}