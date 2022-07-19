public class City {
    String name;
    float maxLength;
    float maxWidth;
    Street[] streets;

    public City(String name, float maxLength, float maxWidth) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxWidth = maxWidth;
    }

    public City(String name, float maxLength, float maxWidth, Street[] streets) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxWidth = maxWidth;
        this.streets = streets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(float maxLength) {
        this.maxLength = maxLength;
    }

    public float getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(float maxWidth) {
        this.maxWidth = maxWidth;
    }

    public Street[] getStreets() {
        return streets;
    }

    public void setStreets(Street[] streets) {
        this.streets = streets;
    }
}
