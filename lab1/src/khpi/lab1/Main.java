package khpi.lab1;

import khpi.lab1.dto.Project;
import khpi.lab1.dto.Role;
import khpi.lab1.dto.Task;
import khpi.lab1.dto.User;
import khpi.lab1.log.FileLogger;
import khpi.lab1.service.EmailService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        var logger = new FileLogger();
        var dev1 = new User("dev1", Role.DEV);
        var dev2 = new User("dev2", Role.DEV);
        var admin = new User("admin", Role.ADMIN);
        var commService = new EmailService();
        var project = new Project("testProject", Arrays.asList(dev1, dev2, admin), admin, commService);
        project.addUser(new User("tester1", Role.TESTER));
        project.addTask(new Task(logger, "new", "task1", dev1));

    }

}