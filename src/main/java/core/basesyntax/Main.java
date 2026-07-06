package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
        };
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
