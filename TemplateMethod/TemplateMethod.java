package TemplateMethod;
public class TemplateMethod {

    public static void main(String[] args){
        new NaverMapView().initMap();
        new KaKaoMapView().initMap();
    }
}