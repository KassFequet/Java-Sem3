package Week3.CircleMyPoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

        public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return ("(" + this.x + "," + this.y + this.y + ")");
    }

    public double distance(int x, int y)
    {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
    }
    
}
