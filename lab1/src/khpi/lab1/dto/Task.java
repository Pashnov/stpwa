package khpi.lab1.dto;

import khpi.lab1.log.Logger;

import java.time.LocalDateTime;

public class Task {

    private final Logger log;

    private String status;
    private String title;
    private User assigned;

    public Task(Logger log) {
        this.log = log;
    }

    public Task(Logger log, String status, String title, User assigned) {
        this.log = log;
        this.status = status;
        this.title = title;
        this.assigned = assigned;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatus(String status, User user) {
        log.debug(LocalDateTime.now() +" status changed: " + status + ", user: " + user);
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAssigned() {
        return assigned;
    }

    public void setAssigned(User assigned) {
        this.assigned = assigned;
    }

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", title='" + title + '\'' +
                ", assigned=" + assigned +
                '}';
    }
}
