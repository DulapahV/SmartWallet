package MyStudyPlan;

import java.time.LocalDate;

enum TaskType {
   Assignment, Reminder, Revision
}

public class TaskInstance {
    private String subject;
    private String title;
    private TaskType type;
    private LocalDate dueDate;
    private String description;

    public TaskInstance(String subject, String title, TaskType type, LocalDate dueDate, String description) {
        this.subject = subject;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public TaskType getType() {
        return type;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
