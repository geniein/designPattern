package Singleton;

public class SecondPage {
    private Setting setting = Setting.getSetting();

    public void setAndPrintSetting() {        
        System.out.println(setting.getDarkMode()+ " " + setting.getFontSize());        
    }
}