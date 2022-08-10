package Lesson04;

public class RobotCoocker extends Robot{
    public RobotCoocker(String name, String work) {
        super(name, work);
    }
    @Override
    public String toString() {
        return
                "Я '" + super.getName() + '\'' +
                        "- я'" + super.getWork() + '\'';
    }
}
