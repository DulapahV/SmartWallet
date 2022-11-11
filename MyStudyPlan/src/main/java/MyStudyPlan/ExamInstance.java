package MyStudyPlan;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class ExamInstance extends AbstractJob {

    private String room;
    private String seat;
    private LocalDate date;
    private LocalTime time;
    private int duration;

    ExamInstance(Subject subject, LocalDate date, LocalTime time, String room, String seat, int duration,
            String description) {
        this.subject = subject;
        this.room = room;
        this.seat = seat;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.description = description;
    }

    public void writeToDatabase(Database dbInstance) {
        dbInstance.addExam(this);
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
    public String getRoom() {
        return room;
    }

    /**
     * @return String
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @return LocalDate
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return LocalTime
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @return int
     */
    public int getDuration() {
        return duration;
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
        this.subject = subject;
    }

    /**
     * @param room
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @param seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @param time
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    /** 
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExamInstance) {
            ExamInstance exam = (ExamInstance) obj;
            return this.subject.equals(exam.subject) && this.date.equals(exam.date) && this.time.equals(exam.time);
        }
        return false;
    }
}
