class Flash():
    def __init__ (self, location: Point3D, angle: Angle3D, color: Color, power: float):
        self.location = location
        self.angle = angle
        self.color = color
        self.power = power

    def rotate(self, angle_action: Angle3D) -> None:
        pass

    def move(self, point_action: Point3D) -> None:
        pass