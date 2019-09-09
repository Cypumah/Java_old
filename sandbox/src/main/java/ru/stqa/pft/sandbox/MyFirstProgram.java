package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Sasha");

    Square s = new Square(6);
    System.out.println("Площдь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(6,7);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + ", " + r.b + " = " + r.area());


    Rectangle m = new Rectangle (1,2);
    System.out.println("Площадь прямоугольника со сторонами " + m.a + ", " + m.b + " = " + m.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
