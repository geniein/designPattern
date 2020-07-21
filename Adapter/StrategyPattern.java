package Adapter;

public class StrategyPattern {
    private SearchButton SearchButton = new SearchButton(this);
    public Mode mode = Mode.ALL;
    public void setModeAll() { mode = Mode.ALL;}
    public void setModeImage() { mode = Mode.IMAGE;}
    public void setModeNews() { mode = Mode.NEWS;}
    public void setModeMap() { mode = Mode.MAP;}
}