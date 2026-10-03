package Exo9;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0;
        this.y=0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(Point p){
        return Math.sqrt((this.x- p.getX())*(this.x- p.getX())+(this.y- p.getY())*(this.y- p.getY()));
    }
    public double distance(int x,int y){
        return Math.sqrt((this.x- x)*(this.x- x)+(this.y- y)*(this.y-y));
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Point p2 = new Point(3, 4);
        System.out.println(p2.getX());
        System.out.println(p2.getY());

        System.out.println(p2.distance());
        System.out.println(p2.distance(0, 0));

        Point p3 = new Point(6, 8);
        System.out.println(p2.distance(p3));
    }
}
