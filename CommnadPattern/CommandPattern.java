package CommnadPattern;

public class CommandPattern {

    public static void main(String[] args) {
        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(10));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new PickUp());

        robotKit.start();
    }
        
}