package sda2.SimpleCircle;

/**
 * Created by Daniel on 2017-08-18.
 */
public class SimpleCircle {
    private double _radius = 1.0d;

    public SimpleCircle(){};
    public SimpleCircle(double r){
        _radius = r;
    }

    public double getRadius(){
        return _radius;
    }

    public void setRadius(double radius){
        _radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius, 2);
    }

    public double getCircumference(){
        return Math.PI * 2 * _radius;
    }

    public String toString(){
        return "Circle"
    }
}
