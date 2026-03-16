package isp.lab3.exercise2;

public class Rectangle {
    private int length=2;
    private int width=1;
    private String color="red";
    public Rectangle(){}
    public Rectangle(int lenght, int width){
        this.length=lenght;
        this.width=width;
    }
    public Rectangle(int length, int width, String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public String getColor(){
        return this.color;
    }
    public int getPerimeter(){
        return 2*this.length+2*this.width;
    }
    public int getArea(){
        return this.length*this.width;
    }

    @Override
    public String toString(){
        return "Rectangle [width= " + width + ", length " + length + ", color " + color + "]";
    }
}
