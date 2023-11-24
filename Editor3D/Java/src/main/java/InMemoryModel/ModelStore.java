package InMemoryModel;

import ModelEliments.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception{
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        List<Texture> textures = new ArrayList<>();

        this.models.add(new PoligonalModel(textures));
        this.scenes.add(new Scene(0, models, flashes, cameras));
        this.flashes.add(new Flash());
        this.cameras.add(new Camera());
    }

    public Scene getScene(int id)
    {
        return this.scenes.get(id);
    }

    public void notifyChange(IModelChanger sender) {
    }
}
