import java.util.ArrayList;
import java.util.List;

public class Position {
    private int x;
    private int y;

    private String direction;
    private List<String> directionList = new ArrayList<String>() {
        {
            add("NORTH");
            add("EAST");
            add("SOUTH");
            add("WEST");
        };};

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Position(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private Position goNorth() {
        return new Position(this.x, this.y + 1, this.direction);
    }

    private Position goSouth() {
        return new Position(this.x, this.y - 1, this.direction);
    }

    private Position goWest(){
        return new Position(this.x -1,this.y,this.direction);
    }

    private Position goEast() {
        return new Position(this.x + 1, this.y, this.direction);
    }

    public String directionLeft(){
        int index = (this.directionList.indexOf(this.direction) - 1);
        return this.directionList.get( index == -1 ? directionList.size()-1 :  index);
    }

    public String directionRight(){
        int index = (this.directionList.indexOf(this.direction) + 1);
        return this.directionList.get( index == this.directionList.size() ? 0 :  index);
    }



public Position goTo(String direction){
    switch (direction) {
        case "NORTH" : return goNorth();
        case "EAST"  : return goEast();
        case "SOUTH" : return goSouth();
        case "WEST"  : return goWest();
    }
    return null;
}

}
