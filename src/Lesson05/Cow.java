package Lesson05;

public class Cow extends Pet{
    @Override
    void showName() {
        System.out.println("Cow");
    }

    @Override
    void voice() {
        System.out.println("Mu-mu");
    }
}
