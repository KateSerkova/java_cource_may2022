package ru.se.sendbox;

public class ExampleFromTheLesson {
  public static void main(String[] args) {

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной "+ s.l+ " = " + s.area());
    System.out.println(s.area());


    Rectangle r = new Rectangle();
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b +" = " + area(r));
  }



  public static double area(Rectangle r){
    return r.a * r.b;
  }
}