package MyStudyPlan;

import java.awt.Color;

public class Subject {
    private String code;
    private String name;
    private Color color;
    
    public Subject(){
        this.code = "";
        this.name = "";
        this.color = Color.white;
    }
    
    public Subject(String code, String name, String colorcode){
        this.code = "";
        this.name = "";
        this.color = Color.decode(colorcode);
    }

    public Subject(String code, String name, Color color){
        this.code = "";
        this.name = "";
        this.color = color;
    }

    
    /** 
     * @return String
     */
    public String getCode() {
        return code;
    }

    
    /** 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @return Color
     */
    public Color getColor() {
        return color;
    }

    
    /** 
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return code + " " + name;
    }
}
