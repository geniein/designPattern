package Singleton;

public class Setting {
    
    private Setting(){};
    private static Setting setting = null;

    public static Setting getSetting(){
        if(setting==null){
            setting = new Setting();
        }
        return setting;
    }

    private boolean darkMode = false;
    private int fonSize = 13;

    public boolean getDarkMode() { return darkMode;}
    public int getFontSize() { return fonSize;}

    public void setDarkMode (boolean _darkMode) {
        darkMode = _darkMode;
    }
    public void setFontSize(int _fontSize){
        fonSize = _fontSize;
    }
}