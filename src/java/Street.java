public class Street {
    String name;
    int idKadastr;
    boolean isMain;
    float length;
    float averageWidth;
    Building[] buildings;
    Park[] park;

    public Street(String name, float length, float averageWidth) {
        this.name = name;
        this.length = length;
        this.averageWidth = averageWidth;
    }

    public Street(String name, int idKadastr, boolean isMain, float length, float averageWidth, Building[] buildings, Park[] park) {
        this.name = name;
        this.idKadastr = idKadastr;
        this.isMain = isMain;
        this.length = length;
        this.averageWidth = averageWidth;
        this.buildings = buildings;
        this.park = park;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdKadastr() {
        return idKadastr;
    }

    public void setIdKadastr(int idKadastr) {
        this.idKadastr = idKadastr;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getAverageWidth() {
        return averageWidth;
    }

    public void setAverageWidth(float averageWidth) {
        this.averageWidth = averageWidth;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

    public Park[] getPark() {
        return park;
    }

    public void setPark(Park[] park) {
        this.park = park;
    }
}
