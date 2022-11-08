package MyStudyPlan;

public class ClassInstance extends AbstractJob {

    //private LocalDate startDate; There are no field to add the time in NewClass form, but you might forgot it.
    private int sector;
    private String room;
    private String building;
    private String teacher;

    ClassInstance() {
        this.subject = null;
        this.description = "";
        //this.startDate = null;
        this.sector = 0;
        this.room = "";
        this.building = "";
        this.teacher = "";
    }

    ClassInstance(Subject subject, int sector, String room, String building, String teacher, String description) {
        this.subject = subject;
        this.sector = sector;
        this.room = room;
        //this.startDate = startDate;
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
}
