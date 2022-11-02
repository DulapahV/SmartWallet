package MyStudyPlan;

enum TaskType {
   Assignment, Reminder, Revision
}

public class TaskInstance {
    private String subject;
    private String title;
    private TaskType type;
    private Date dueDate;
    private String description;

    public TaskInstance(String subject, String title, TaskType type, Date dueDate, String description) {
        this.subject = subject;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
        this.description = description;
    }
}
