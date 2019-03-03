public class Table {
    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    Table(int length, int width){
    setLength(length);
    setWidth(width);
}

    public boolean isValid(Position position) {
        return (position.getX() < length &&  position.getY() < width &&  position.getX() >= 0 &&  position.getY() >= 0);
    }
}
