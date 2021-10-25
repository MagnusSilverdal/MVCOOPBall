package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    Ball b;
    public SimulationModel() {

        b = new Ball(20,20,10,10,10);
    }
    public void update() {
        b.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(b.getShape());
        return shapes;
    }
}
