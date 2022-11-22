package MyStudyPlan;

import java.awt.Color;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Subject {

    private String code;
    private String name;
    private Color color;

    public Subject() {
        this.code = "";
        this.name = "";
        this.color = Color.white;
    }

    public Subject(String code, String name, String colorcode) {
        this.code = code;
        this.name = name;
        this.color = Color.decode(colorcode);
    }

    public Subject(String code, String name, Color color) {
        this.code = code;
        this.name = name;
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
        if (code != null) {
            this.code = code;
        }
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
        if (name != null) {
            this.name = name;
        }
    }

    /**
     * @return Color
     */
    public Color getColor() {
        return color;
    }

    public String getColorHex() {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    /**
     * @param color
     */
    public void setColor(Color color) {
        if (color != null) {
            this.color = color;
        }
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return code + " " + name;
    }

    /**
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Subject) {
            Subject other = (Subject) obj;
            return this.code.equals(other.code);
        }
        return false;
    }
}
