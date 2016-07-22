package com.tmartsyniak.learning.shapes.task1;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FiguresSearchUtil {

    public Figure getFigureWithMaximumSquare(List<Figure> figures) throws IOException, ClassNotFoundException {
        Collections.sort(figures, (figure, t1) -> (int) (t1.calcSquare() - figure.calcSquare()));
        return figures.get(0);
    }

    public Figure getFigureWithMaximumBorderLength(List<Figure> figures) throws IOException, ClassNotFoundException {
        Collections.sort(figures, (figure, t1) -> (int) (t1.calcBorderLength() - figure.calcBorderLength()));
        return figures.get(0);
    }
}
