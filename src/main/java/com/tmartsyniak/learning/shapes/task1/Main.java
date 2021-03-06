package com.tmartsyniak.learning.shapes.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Figure> sourceFigures = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            sourceFigures.add(new Ring(i, i + 1));
            sourceFigures.add(new Circle(i + 2));
        }
        FiguresIOUtil util = new FiguresIOUtil();
        String file = "src/main/java/com/tmartsyniak/learning/shapes/task1/test.ser";
        util.writeFiguresToFile(sourceFigures, file);
        List<Figure> readFigures = new ArrayList<>();
        for (Figure figure : util.readFiguresFromFile(file)) {
            readFigures.add(figure);
            System.out.println(figure);
            System.out.println(figure.calcSquare());
            System.out.println(figure.calcBorderLength());
        }
        FiguresSearchUtil searchUtil = new FiguresSearchUtil();
        System.out.println(searchUtil.getFigureWithMaximumBorderLength(readFigures));
        System.out.println(searchUtil.getFigureWithMaximumSquare(readFigures));

    }
}
