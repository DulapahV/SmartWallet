package MyStudyPlan;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
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

    ClassInstance(Subject subject, int sector, String room, LocalDate startDate, LocalTime startTime, int duration,
            String building, String teacher, String description) {
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

    public LocalDate getDate() {
        return startDate;
    }

    public LocalTime getTime() {
        return startTime;
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
     * @param sector
     */
    public void setSector(int sector) {
        this.sector = sector;
    }

    /**
     * @param room
     */
    public void setRoom(String room) {
        if (room != null) {
            this.room = room;
        }
    }

    /**
     * @param building
     */
    public void setBuilding(String building) {
        if (building != null) {
            this.building = building;
        }
    }

    /**
     * @param teacher
     */
    public void setTeacher(String teacher) {
        if (teacher != null) {
            this.teacher = teacher;
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
        if (obj != null && obj instanceof ClassInstance) {
            ClassInstance classInstance = (ClassInstance) obj;
            return this.subject.equals(classInstance.subject) && this.sector == classInstance.sector
                    && this.startDate.equals(classInstance.startDate) && this.startTime.equals(classInstance.startTime);
        }
        return false;
    }
}
