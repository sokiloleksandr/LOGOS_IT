package Lesson04;

public class CoffeRobot extends Robot {
    public CoffeRobot(String name, String work) {
        super(name, work);
    }
    @Override
    public String toString() {
        return
                "Я '" + super.getName() + '\'' +
                        "- я'" + super.getWork() + '\'';
    }
}
