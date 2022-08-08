package Lesson03;

public class Rectangle {
    public double lenght;
    public double width;
    public Rectangle (double l, double w)
    {
        this.lenght = l;
        this.width = w;
    }

    public Rectangle() {
        this.width = 2;
        this.lenght=2;
    }

    public double Perimeter ()
    {
        return 2 * (lenght + width);
    }
    public double Square ()
    {
        return lenght * width;
    }
}
