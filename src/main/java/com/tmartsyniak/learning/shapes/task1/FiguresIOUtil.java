package com.tmartsyniak.learning.shapes.task1;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FiguresIOUtil {

    public void writeFiguresToFile(List<Figure> figures, String filePath) throws IOException {
        try (Output output = new Output(new FileOutputStream(filePath))) {
            Kryo kryo = new Kryo();
            for (Figure figure : figures) {
                kryo.writeClassAndObject(output, figure);
            }
        }
    }

    public List<Figure> readFiguresFromFile(String filePath) throws IOException, ClassNotFoundException {
        List<Figure> result = new ArrayList<>();
        Kryo kryo = new Kryo();
        try (Input input = new Input(new FileInputStream(filePath))) {
            while (input.available() > 0) {
                result.add((Figure) kryo.readClassAndObject(input));
            }
        }
        return result;
    }
}
