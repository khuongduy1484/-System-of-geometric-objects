public class Circle extends Shape {
    private double radius = 1.0;
    public  Circle(){

    }
    public  Circle(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return 2*Math.PI*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius="+getRadius()+ ", which is a subclass of "
                + super.toString();
    }
}
