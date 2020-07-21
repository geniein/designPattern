package CommnadPattern;

public class Robot {
    
    public enum Direction { LEFT, RIGHT}

    public void moveForward ( int space) {
        System.out.println(space + " Forward");    
    }
    public void turn (Direction _direction){
        System.out.println(
            (_direction == Direction.LEFT ? "LEFT" : "RIGHT") + "TURN");    
    }
    public void pickUp(){
        System.out.println("Pick up");    
    }
}