package CommnadPattern;

abstract class Command {
    protected Robot robot;

    public void setRobot (Robot _robot){
        this.robot = _robot;
    }
    public abstract void execute();
}
class MoveForwardCommand extends Command {
    int space;
    public MoveForwardCommand(int _space){
        space = _space;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        robot.moveForward(space);
    }
}
class TurnCommand extends Command{
    Robot.Direction direction;
    public TurnCommand (Robot.Direction _direction){
        direction = _direction;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        robot.turn(direction);
    }
}
class PickUp extends Command{
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        robot.pickUp();
    }
}