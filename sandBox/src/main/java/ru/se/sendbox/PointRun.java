package ru.se.sendbox;

public class PointRun {
  public static void main(String[] args) {
    Point p1 = new Point(5,10, 4, 6);
    Point p2 = new Point(60,11, 5, 7);

    System.out.println(p1.distance());
    System.out.println(p2.distance());
  }



  // Point p2 = new Point(4, 6);
  // public static double distance (Point p1, Point p2){
  // return Math.sqrt((p1.x - p2.x)* 2 + (p1.y - p2.y)* 2);
  //  }
}
