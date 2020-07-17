package Decorator;

public class LaserDecorator extends FighterDecorator{
    public LaserDecorator(Fighter _decoratedFighter){
        super(_decoratedFighter);
    }
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        super.attack();
        System.out.println("Laser Attack!");
    }
}