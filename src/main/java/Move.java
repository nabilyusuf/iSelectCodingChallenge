public class Move {
    private Robot robot;
    private Table table;

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

    public Move(Robot robot, Table table) {
        this.robot = robot ;
        this.table = table ;
        if (this.robot.isPlaced()) {
            Position newPosition = this.robot.getCurrentPosition().goTo(this.robot.getCurrentPosition().getDirection());
            if (this.table.isValid(newPosition)) this.robot.setCurrentPosition(newPosition);
        }
    }
}