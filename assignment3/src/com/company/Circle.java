package com.company;

public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){
         super();
    }
    public Circle(double radius){
       super();
        this.radius=radius;

    }
    public Circle(double r,String c,boolean f){

        super(c,f);
        radius=r;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
       return radius*radius*3.14;
    }
    public double getPerimeter(){
      return  (radius+radius)*3.14;
    }
     @Override
    public  String toString(){
          return super.toString()+"A Circle with radius"+radius;
}
}
