package Lesson05;

public class Dog extends Pet{
    @Override
    void showName() {
        System.out.println("Dog");
    }

    @Override
    void voice() {
        System.out.println("Woof-woof");
    }
}
