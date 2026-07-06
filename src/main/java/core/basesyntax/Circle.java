package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
