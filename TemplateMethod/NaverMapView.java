package TemplateMethod;

public class NaverMapView extends MapView{
    @Override
    protected void connectMapServer() {
        // TODO Auto-generated method stub        
        System.out.println("connect NaverMap");
    }
    @Override
    protected void moveToCurrentLocation() {
        // TODO Auto-generated method stub
        System.out.println("show NaverMap");
    }
    @Override
    protected void showMapOnScreen() {
        // TODO Auto-generated method stub
        System.out.println("move current place on NaverMap");
    }
}