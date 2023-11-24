package ModelEliments;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0){
            this.models = models;
        } else {
            throw new Exception("At least one model");
        }
        this.flashes = flashes;
        if (cameras.size() > 0){
            this.cameras = cameras;
        } else {
            throw new Exception("At least one camera");
        }
    }

    public Type method1(Type temp) {
        return null;
    }

    public Type method2(Type temp1, Type temp2) {
        return null;
    }
}
