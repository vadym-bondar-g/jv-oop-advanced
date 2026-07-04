package core.basesyntax;

public class IsoscelesTrapezoid  extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;
    public IsoscelesTrapezoid(double firstBase, double secondBase, double height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }
    @Override
    public double getArea() {

        return 0;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid is draw");
    }
}
