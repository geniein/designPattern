package Decorator;

public abstract class FighterDecorator implements Fighter{
    private Fighter decoratordFighter;
    public FighterDecorator(Fighter _decoratedFighter){
        decoratordFighter = _decoratedFighter;
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        decoratordFighter.attack();        
    }
}