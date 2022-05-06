package ru.se.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {


  @Test
  public void checkDistance(){

    Point p1 = new Point(-1,7.1);
    Point p2 = new Point(-9, 1);
    Point p3 = new Point(100,800);
    Point p4 = new Point(4, 12);


    Assert.assertEquals(p1.distance(p2),5.31,0.9);
    Assert.assertEquals(p3.distance(p4),42,0.9);
    Assert.assertEquals(p4.distance(p1),4.0, 0.9);
  }
}
