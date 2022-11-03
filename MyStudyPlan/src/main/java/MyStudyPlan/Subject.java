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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
