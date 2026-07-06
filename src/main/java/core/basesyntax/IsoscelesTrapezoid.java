package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double firstBase;
    private double secondBase;
    private double height;
    private Color color;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {

        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, firstBase: "
                + firstBase
                + " units, secondBase: "
                + secondBase
                + " units, height: "
                + height
                + " units, color: "
                + color);
    }
}
