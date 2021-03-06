import java.util.Date;

public abstract class GeometricObject1 {

    private String color = null;
    private boolean filled = false;
    private Date dateCreated;

    protected GeometricObject1() {
        this.dateCreated = new Date();
    }

    protected GeometricObject1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "\ncreated on " + this.dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}