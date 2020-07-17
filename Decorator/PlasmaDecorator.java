package Decorator;

/**
 * PlasmaDecorator
 */
public class PlasmaDecorator extends FighterDecorator{
    public PlasmaDecorator (Fighter _decoratedFighter) {
        super(_decoratedFighter);
    }    
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        super.attack();
        System.out.println("Plsma Attack!");
    }
}