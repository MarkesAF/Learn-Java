package entities;

import entities.enums.Color;
public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(){
    }
    public Rectangle(Color color, Double width, Double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    public Double getHeight(){
        return height;
    }
    public void setHeight(Double height){
        this.height = height;
    }
    public Double getWidth(){
        return width;
    }
    public void setWidth(Double width){
        this.width = width;
    }
    @Override
    public Double area(){
        return width * height;
    }
}
