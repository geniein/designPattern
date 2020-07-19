package Decorator;

public class FactoryDecorator {
    public static void main(String[] args) {
        FighterFactory factory = new FighterFactory();

        factory.getFighter(false, false, false).attack();
        factory.getFighter(false, false, true).attack();
        factory.getFighter(false, true, true).attack();
        factory.getFighter(true, true, true).attack();
    }
}