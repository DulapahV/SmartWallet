package MyStudyPlan;

import java.time.LocalDateTime;

public class ExamInstance extends AbstractJob {
    private String room;
    private String seat;
    private LocalDateTime time;
    private int duration;
    
    ExamInstance(Subject subject, LocalDateTime time, String room, String seat, int duration, String description){
        this.subject = subject;
        this.room = room;
        this.seat = seat;
        this.time = time; //CONSTRUCT YOUR OWN LOCALDATETIME OR CALL ME FOR HELP
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

    public LocalDateTime getTime() {
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

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
