package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s=new Shape();
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        Square sq=new Square();
         s.setColor("black");
         System.out.println(s);
         c.setRadius(4);
         c.getPerimeter();
         double po=c.getPerimeter();
         System.out.println(po);
         r.setLength(10);
         r.setWidth(25);
         r.getPerimeter();
         double wo=r.getPerimeter();
         System.out.print("Perimeter of Rectangle is :");
         System.out.println(wo);
         sq.setWidth(25);
         sq.setLength(2);
        System.out.print("Perimeter of Square is :");
         sq.getPerimeter();
         double zh=sq.getPerimeter();

         System.out.println(zh);
    }
}
