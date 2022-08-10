package Lesson04;

public class RobotDancer extends  Robot{
    public RobotDancer(String name, String work) {
        super(name, work);
    }
    @Override
    public String toString() {
        return
                "Я '" + super.getName() + '\'' +
                        "- я'" + super.getWork() + '\'';
    }
}
