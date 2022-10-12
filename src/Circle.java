public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double r, String clr) {
        this.radius = r;
        this.color = clr;
    }
    public  Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

//    private double getRadius() {
//        return radius;
//    }
//
//    private double getArea() {
//        return Math.PI * Math.pow(radius,2);
//    }
}
