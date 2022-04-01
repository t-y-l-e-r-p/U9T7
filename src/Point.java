public class Point {
    private int x;
    private int y;
    private String label;
    public Point(String label, int x,int yl)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }
    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
    @Override
    public boolean equals(Object object)
    {
        if(!(object instanceof Point) || object == null)
        {
            return false;
        }
        Point point = (Point)object;
        return (point.x == this.x) && (point.y == this.y);
    }
}
