public class Place {

    private Robot robot;
    private Table table;
    private Position position;

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    Place(Robot robot, Table table, Position position){
        this.position = position;
        this.robot = robot;
        this.table = table;
        if(this.table.isValid(this.position))  this.robot.setCurrentPosition(this.position);
    }
}