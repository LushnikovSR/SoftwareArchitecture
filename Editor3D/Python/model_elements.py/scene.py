class Scene():
    def __init__(self, id: int, models: List[PoligonalModel], flashes: List[Flash], cameras: List[Camera]):
        self.id = id
        self.flashes = flashes
        if len(models) > 0:
            self.models = models
        else
            raise Exception("At least one model")
        if len(cameras) > 0:
            self.cameras = cameras
        else
            raise Exception("At least one model")

    def method_1(self, temp: Type) -> Type:
        return pass

    def method_2(self, temp_1: Type, temp_2: Type) -> Type:
        return pass