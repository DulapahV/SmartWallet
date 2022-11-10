package MyStudyPlan;

import java.time.LocalDate;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
enum TaskType {
    Assignment, Reminder, Revision
}

public class TaskInstance extends AbstractJob {

    private String title;
    private TaskType type;
    private LocalDate dueDate;
    private boolean isDone = false;

    public TaskInstance(Subject subject, String title, TaskType type, LocalDate dueDate, String description) {
        this.subject = subject;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
        this.description = description;
    }

    public void writeToDatabase(Database dbInstance) {
        dbInstance.addTask(this);
    }

    /**
     * @return Subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return TaskType
     */
    public TaskType getType() {
        return type;
    }

    /**
     * @return LocalDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return boolean
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * @param subject
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param type
     */
    public void setType(TaskType type) {
        this.type = type;
    }

    /**
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param isDone
     */
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TaskInstance) {
            TaskInstance task = (TaskInstance) obj;
            return this.subject.equals(task.subject) && this.title.equals(task.title)
                    && this.type.equals(task.type) && this.dueDate.equals(task.dueDate)
                    && this.description.equals(task.description) && this.isDone == task.isDone;
        }
        return false;
    }
}
