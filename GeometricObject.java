package DISM_ADF1;

import java.util.Date;

abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "String ??";
    }

    abstract double getArea();

    abstract double getPerimeter();
}
