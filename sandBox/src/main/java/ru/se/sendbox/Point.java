package ru.se.sendbox;

public class Point {

  public double x; // атрибут
  public double y;

  public Point(double x, double y) {  // это конструктор
    this.x = x;
    this.y = y;
  }

  public double distance (Point p2){
    return Math.sqrt((this.x - p2.x)* 2 + (this.y - p2.y)* 2);
  }
}