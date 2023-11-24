class Camera():
    def __init__ (self, location: Point3D, angle: Angle3D):
        self.location = location
        self.angle = angle

    def rotate(self, angle_action: Angle3D) -> None:
        pass

    def move(self, point_action: Point3D) -> None:
        pass