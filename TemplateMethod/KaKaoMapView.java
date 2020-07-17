package TemplateMethod;

public class KaKaoMapView extends MapView{

    @Override
    protected void connectMapServer() {
        // TODO Auto-generated method stub
        System.out.println("connect KaKaoMap");        
    }
    @Override
    protected void showMapOnScreen() {
        // TODO Auto-generated method stub
        System.out.println("show KaKaoMap");
    }
    @Override
    protected void moveToCurrentLocation() {
        // TODO Auto-generated method stub
        System.out.println("move current place in KaKaoMap");
    }
    
}