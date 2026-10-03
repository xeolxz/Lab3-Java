package Exo8;

public class Wall {
    private double width;
    private double height;
    public Wall(){
        width=0;
        height=0;
    }
    public Wall(double width,double height){
        if(width<0){
            this.width=0;
        }
        if(height<0){
            this.height=0;
        }
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width=width;
        if(width<0) {
            this.width = 0;
        }
    }
    public void setHeight(double height){
        this.height=height;
        if(height<0) {
            this.height = 0;
        }
    }
    public double getArea(){
        return width*height;
    }
    public static void main(String[] args){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
