package sda2.Circle;

/**
 * Created by Daniel on 2017-08-18.
 */
public class Circle {

    private double _radius = 1.0;
    private String _color = "red";

    public Circle(){}
    public Circle(double r){
        _radius = r;
    }
    public double getRadius(){
        return _radius;
    }
    public void setRadius(double radius){
        _radius = radius;
    }

    public String getColor(){
        return _color;
    }

    public void setColor(String color){
        _color = color;
    }

    public double getArea(){
        return 3.14 * Math.pow(_radius, 2d);
    }

    public String toString(){
        return "Circle[radius=" +_radius+
                ",color=" + _color+"]";
    }

}
