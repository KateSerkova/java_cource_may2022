package ru.se.sendbox;

public class Point {

  public double x1; // атрибут
  public double y1;
  public double x2;
  public double y2;

  public Point (double x1, double y1, double x2, double y2) {  // это конструктор
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public double distance (){

    return Math.sqrt((this.x1 - this.x2)* 2 + (this.y1 - this.y2)* 2);

  }
}
