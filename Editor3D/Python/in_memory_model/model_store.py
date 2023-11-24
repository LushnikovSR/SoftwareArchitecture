from ast import List


class ModelStore(IModelChanger):
    def __init__ (self, change_observers: List[IModelChangeObserver]):
        model_1 = PoligonalModel()
        scene_1 = Scene()
        flashe_1 = Flash()
        camera_1 = Camera()

        self.models = [model_1]
        self.scenes = [scene_1]
        self.flashes = [flashe_1]
        self.cameras = [camera_1]
        self.change_observers = change_observers

    def get_scene(self, id):
        for scene in scenes:
            if scene.id == id:
                return scene
        return None

    def notify_change(self, sender) -> None:
        return super().notify_change(sender)