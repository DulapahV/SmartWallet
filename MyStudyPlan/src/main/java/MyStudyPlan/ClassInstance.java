package MyStudyPlan;

import java.time.LocalDate;

public class ClassInstance extends AbstractJob {
    //private LocalDate startDate; There are no field to add the time in NewClass form, but you might forgot it.
    private int sector;
    private String room;
    private String building;
    private String teacher;

    ClassInstance(){
        this.subject = null;
        this.description = "";
        //this.startDate = null;
        this.sector = 0;
        this.room = "";
        this.building = "";
        this.teacher = "";
    }

    ClassInstance(Subject subject, int sector, String room, String building, String teacher, String description){
        this.subject = subject;
        this.sector = sector;
        this.room = room;
        //this.startDate = startDate;
        this.building = building;
        this.teacher = teacher;
        this.description = description;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getSector() {
        return sector;
    }

    public String getRoom() {
        return room;
    }

    public String getBuilding() {
        return building;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDescription() {
        return description;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
