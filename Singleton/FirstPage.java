package Singleton;

public class FirstPage {

    private Setting setting = Setting.getSetting();

    public void setAndPrintSetting() {
        setting.setDarkMode(true);
        setting.setFontSize(15);

        System.out.println(setting.getDarkMode()+ " " + setting.getFontSize());        
    }
    
}