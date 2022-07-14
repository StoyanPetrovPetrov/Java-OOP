package PolymorphismLab.Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        super.setArea(this.calculateArea());
        super.setPerimeter(this.calculatePerimeter());
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    public Double getRadius() {
        return radius;
    }
}
