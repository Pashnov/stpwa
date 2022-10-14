package khpi.lab1.dto;

import khpi.lab1.service.CommunicationService;

import java.util.*;

public class Project {

    private String name;
    private List<User> users = new ArrayList<>();
    private User admin;
    private CommunicationService commService;
    private Map<String, Task> tasks = new HashMap<>();

    public Project(String name, List<User> users, User admin, CommunicationService commService) {
        this.name = name;
        this.users.addAll(users);
        this.admin = admin;
        this.commService = commService;
    }

    public void addUser(User user){
        users.add(user);
        commService.send("new user: "+ user.getFullName() + ", added to project: " + name, Arrays.asList(admin));
    }

    public void removeUser(User user){
        users.remove(user);
        commService.send("new user: "+ user.getFullName() + ", added to project: " + name, Arrays.asList(admin));
    }

    public void addTask(Task task) {
        tasks.put(task.getTitle(), task);
    }

    public Task getTask(String title) {
        return tasks.get(title);
    }

    public Collection<Task> getAllTasks(){
        return tasks.values();
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        if (admin.getRole() != Role.ADMIN) {
            throw new RuntimeException("Wrong role for new admin: "+ admin);
        }
        users.remove(this.admin);
        users.add(admin);
        commService.send("new admin: "+ admin.getFullName() + ", set for project: " + name, users);
        this.admin = admin;
    }
}
