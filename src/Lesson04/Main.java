package Lesson04;

public class Main {
    public static void main(String[] args) {
        //1
        Robot robot = new Robot("Robot","просто працюю");
        CoffeRobot coffeRobot = new CoffeRobot("CoffeRobor","варю каву");
        RobotDancer robotDancer = new RobotDancer("RobotDancer","просто таннцюю");
        RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker","просто готую");
        System.out.println(robot);
        System.out.println(coffeRobot);
        System.out.println(robotDancer);
        System.out.println(robotCoocker);
        //2
        Animal animal = new Animal();
        System.out.println(animal);
        animal.setName("Бик");
        animal.setAge(14);
        animal.setSpeed(2);
        System.out.println(animal);


    }
}
