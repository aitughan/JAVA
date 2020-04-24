package com.company;

public class Square extends Rectangle  {
    private double length=1.0,width=1.0;

    private double side;
    public Square(){
        super();
    }
    public Square (double side){
         super();
         this.side=side;
    }
    public Square(double s,String c ,boolean f){

          super(c,f);
          side=s;

    }
    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        this.side = side;
    }
    public void setWidth(double width) {
        this.width=width;
    }

    public void setLength(double length) {
         this.length=length;
    }
    public double getArea(){
        if(width!=length){
            System.out.println("Error,because the values of length and width should to be same");
            return 0;
        }
        else return width*length;
    }
    public double getPerimeter(){
        if(width!=length){
            System.out.println("Error,because the values of length and width should to be same");
            return 0;
        }
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return super.toString()+width+length;
    }

    public String soString(){
        return super.soString()+width+" "+length;
    }
}

