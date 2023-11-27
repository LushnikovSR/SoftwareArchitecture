package ModelEliments;

import Stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

public class Poligon {
    Point3D point3D;
    public Poligon(Point3D point3D){
        this.point3D = point3D;
    }
    public List<Point3D> points = new ArrayList<>();
}
