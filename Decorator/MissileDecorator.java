package Decorator;

public class MissileDecorator extends FighterDecorator{
    public MissileDecorator (Fighter _decoratedFighter){
        super(_decoratedFighter);
    }
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        super.attack();
        System.out.println("Missile Attack!");
    }    
}