package builder.house;

public abstract class HouseBuilder {
    String builderName;

    enum HouseType {
        WOOD,CLAY,GINGERBREAD,STONE
    }
    HouseType houseType;
    House house = new House();
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
        house.setHouseType(houseType);
    }

    public abstract HouseBuilder addWalls();
    public abstract HouseBuilder addRoof();
    public abstract HouseBuilder addWindows();
    public House build() {
        System.out.println("Build the house!");
        // Very simple build -- just return the house!
        // We've added all the parts...
        // In a real build, we'd have to nail and screw everything together of course.
        // And add wiring and so on.
        return house;
    }

}
