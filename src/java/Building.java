public class Building {
    int number;
    int length;
    float width;

    public Building(int number) {
        this.number = number;
    }

    public Building(int number, int length, float width) {
        this.number = number;
        this.length = length;
        this.width = width;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
