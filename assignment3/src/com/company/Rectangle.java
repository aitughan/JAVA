package com.company;

public class Rectangle extends Shape {
    private double width=1.0,length=1.0;
    private String color ="red";
    private boolean filled=true;
    public Rectangle(){
       super();

    }
    public  Rectangle(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }


    public Rectangle(double w,double l){
        width=w;
        length=l;
    }
    public Rectangle(double w,double l,String c,boolean f){
         super(c,f);
         width=w;
         length=l;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width*2)+(length*2);
    }
    @Override
    public String toString(){
        return super.toString()+"A Rectangle with width"+width+",A Rectangle with length"+length;
    }
    public String soString(){
        return color+" "+filled;
    }


}
