package MyStudyPlan;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExamInstance extends AbstractJob {
    private String room;
    private String seat;
    private LocalDate date;
    private LocalTime time;
    private int duration;
    
    ExamInstance(Subject subject, LocalDate date, LocalTime time, String room, String seat, int duration, String description){
        this.subject = subject;
        this.room = room;
        this.seat = seat;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.description = description;
    }
    
    public Subject getSubject() {
        return subject;
    }
    
    public String getRoom() {
        return room;
    }

    public String getSeat() {
        return seat;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
