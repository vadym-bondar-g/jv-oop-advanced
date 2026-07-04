package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        return switch (random.nextInt(5)) {
            case 0 -> new Circle(random.nextDouble());
            case 1 -> new Square(random.nextDouble());
            case 2 -> new Rectangle(random.nextDouble(), random.nextDouble());
            case 3 -> new RightTriangle(random.nextDouble(), random.nextDouble());
            case 4 -> new IsoscelesTrapezoid(random.nextDouble(),  random.nextDouble(), random.nextDouble());
            default -> null;
        };
    }
}
