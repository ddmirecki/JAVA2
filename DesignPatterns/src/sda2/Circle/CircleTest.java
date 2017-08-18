package sda2.Circle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Daniel on 2017-08-18.
 */
public class CircleTest {

    @Test
    public void circleAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14d, circle.getArea(), 0.01);
    }
    @Test
    public void circleDefaultRadiusTest(){
        Circle circle = new Circle(2);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleAreaTest2(){
        Circle circle = new Circle(2);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2StringTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle[radius=2.0,color=red]", circle.toString());
    }
}
