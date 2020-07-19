package StatePattern;

public interface ModeState {    
    public void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState{
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        // TODO Auto-generated method stub
        System.out.println("LIGHT -> DARK");
        modeSwitch.setState(new ModeStateDark());
    }
}
class ModeStateDark implements ModeState{
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        // TODO Auto-generated method stub
        System.out.println("DARK -> LIGHT");
        modeSwitch.setState(new ModeStateLight());
    }
}