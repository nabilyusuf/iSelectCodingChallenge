public class Report {
    private Robot robot;

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    Report(Robot robot){
        this.robot = robot;
        System.out.println(this.robot.report());
    }
}