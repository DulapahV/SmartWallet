package MyStudyPlan;

import java.time.LocalDate;

enum TaskType {
   Assignment, Reminder, Revision
}

public class TaskInstance extends AbstractJob {
    private String title;
    private TaskType type;
    private LocalDate dueDate;

    public TaskInstance(Subject subject, String title, TaskType type, LocalDate dueDate, String description) {
        this.subject = subject;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
        this.description = description;
    }

    public Subject getSubject() {
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

    public void setSubject(Subject subject) {
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
