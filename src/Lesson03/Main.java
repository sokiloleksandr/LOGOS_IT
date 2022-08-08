package Lesson03;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,5);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Площа прямокутника = " + rectangle.Square());
        System.out.println("Периметр прямокутника = " + rectangle.Perimeter());
        System.out.println("Площа дефолтного прямокутника = " + rectangle1.Square());
        System.out.println("Периметр дефолтного прямокутника = " + rectangle1.Perimeter());
        Circle circle = new Circle(2);
        System.out.println("Площа кола = " + circle.Площа());
        System.out.println("Довжина кола = " + circle.Довжина());

    }
}
