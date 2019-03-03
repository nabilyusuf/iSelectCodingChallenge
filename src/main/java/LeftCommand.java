public class LeftCommand {

    private Robot robot;

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    LeftCommand(Robot robot){
        this.robot = robot;
        if (this.robot.isPlaced()){
            this.robot.setCurrentPosition(new Position(this.robot.getCurrentPosition().getX(), this.robot.getCurrentPosition().getY(),this.robot.getCurrentPosition().directionLeft()));
        }
    }
}