package Week6;
import java.util.Date;

public abstract class GeometricObject {
    private String Color;
    private Boolean filled;
    private Date dateCreated;

    protected GeometricObject()
    {}

    protected GeometricObject(String color, Boolean filled)
    {
        this.Color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        Color = color;
    }

    public Boolean isFilled()
    {
        return filled;
    }

    public void setFilled(Boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        return ("Color: " + this.Color + " Filled: " + this.filled + " Date Created: " + this.dateCreated);
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    
}
