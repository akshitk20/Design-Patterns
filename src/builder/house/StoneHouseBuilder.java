package builder.house;

public class StoneHouseBuilder extends HouseBuilder {
    int numWalls = 5;     // Stone houses have 5 walls: 4 exterior, 1 interior
    int numWindows = 20;  // Stone houses have a lot of windows
    String windowMaterial = "Antique glass";
    String wallMaterial = "Stone, 2 feet thick";
    String interiorWallMaterial = "Stone, 1 foot thick";
    String roofMaterial = "Tile";
    public StoneHouseBuilder() {
        this.builderName = "Stone House Builder";
        setHouseType(HouseType.STONE);
    }
    @Override
    public HouseBuilder addWalls() {
        // Add 4 exterior walls
        for (int i = 0; i < numWalls-1; i++) {
            house.addWall(new Wall(interiorWallMaterial));
        }
        // Add 1 interior wall
        house.addWall(new InteriorWall(wallMaterial));
        return this;
    }

    @Override
    public HouseBuilder addRoof() {
        for (int i = 0; i < numWindows; i++) {
            house.addWindow(new Window(windowMaterial));
        }
        return this;    }

    @Override
    public HouseBuilder addWindows() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    public House build() {
        System.out.println("Stick everything together with mortar");
        return house;
    }
}
