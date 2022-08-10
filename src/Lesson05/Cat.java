package Lesson05;

public class Cat extends Pet{
    @Override
    void showName() {
        System.out.println("Cat");
    }

    @Override
    void voice() {
        System.out.println("Nya-nya");
    }
}
