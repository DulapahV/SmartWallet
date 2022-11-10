package MyStudyPlan;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClassInstance extends AbstractJob {

    private LocalTime startTime;
    private LocalDate startDate;
    private int sector;
    private int duration;
    private String room;
    private String building;
    private String teacher;

    ClassInstance() {
        this.subject = null;
        this.description = "";
        this.startTime = null;
        this.startDate = null;
        this.duration = 0;
        this.sector = 0;
        this.room = "";
        this.building = "";
        this.teacher = "";
    }

    ClassInstance(Subject subject, int sector, String room, LocalDate startDate, LocalTime startTime, int duration, String building, String teacher, String description) {
        this.subject = subject;
        this.sector = sector;
        this.room = room;
        this.startDate = startDate;
        this.startTime = startTime;
        this.duration = duration;
        this.building = building;
        this.teacher = teacher;
        this.description = description;
    }

    public void writeToDatabase(Database dbInstance) {
        dbInstance.addClass(this);
    }

    /**
     * @return Subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * @return int
     */
    public int getSector() {
        return sector;
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
    public String getBuilding() {
        return building;
    }

    /**
     * @return String
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @return String
     */
    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    /**
     * @param subject
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * @param sector
     */
    public void setSector(int sector) {
        this.sector = sector;
    }

    /**
     * @param room
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @param building
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @param teacher
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClassInstance) {
            ClassInstance classInstance = (ClassInstance) obj;
            return this.subject.equals(classInstance.subject) && this.sector == classInstance.sector
                    && this.startDate.equals(classInstance.startDate) && this.startTime.equals(classInstance.startTime);
        }
        return false;
    }

}
