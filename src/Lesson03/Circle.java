package Lesson03;

public class Circle {
    public double радіус;
    public double діаметр;
    public double пі = 3.14;

    public Circle(double радіус) {
        this.радіус = радіус;
        this.діаметр=радіус+радіус;
    }



    public double Площа ()
    {

        return (пі*(діаметр*діаметр))*1/4;
        /*double верх = пі * (діаметр*діаметр);
        return верх/4;*/
    }
    public double Довжина ()
    {
        return 2*пі*радіус;
    }
}
