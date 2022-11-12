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

    public TaskInstance(Subject subject, String title, TaskType type, LocalDate dueDate, String description) {
        this.subject = subject;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
        this.description = description;
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
     * @param subject
     */
    public void setSubject(Subject subject) {
        if (subject != null) {
            this.subject = subject;
        }
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    /**
     * @param type
     */
    public void setType(TaskType type) {
        if (type != null) {
            this.type = type;
        }
    }

    /**
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        if (dueDate != null) {
            this.dueDate = dueDate;
        }
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    /**
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TaskInstance) {
            TaskInstance task = (TaskInstance) obj;
            return this.subject.equals(task.subject) && this.title.equals(task.title)
                    && this.type.equals(task.type) && this.dueDate.equals(task.dueDate)
                    && this.description.equals(task.description);
        }
        return false;
    }
}
