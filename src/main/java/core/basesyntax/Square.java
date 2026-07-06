package core.basesyntax;

public class Square implements Figure {
    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: " + color);
    }
}
