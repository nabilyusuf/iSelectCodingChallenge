import org.jbehave.core.annotations.*;

import static junit.framework.TestCase.assertEquals;

public class Steps {
    private Robot robot;
    private Table table;
    private Controller controller;

    @Given("a $width by $length table")
    @Aliases(values = {"a new table: $width by $length"})
    public void theTableSet(int width, int length) {
        this.table  = new Table(width,length);
        assertEquals( table.getLength(),length);
        assertEquals( table.getWidth(),width);
    }

    @When("I place the robot at ($place)")
    public void isTheRobotPlacedCorrectly(String place) {
        System.out.println("Placed at  " + place);
        this.robot = new Robot();
        this.controller = new Controller(this.robot,this.table);
        this.controller.parse(place);
        assertEquals( controller.getRobot().report(),"[0,0,NORTH]");
    }

    @Then("the <command> is given to the robot,it should report at <position>")
    @Aliases(values = {"Robot move to <command> whats the  <position> "})
    public void isTheRobotAtCorrectPosition(@Named("command") String command, @Named("position") String position) {
        System.out.println("Command is  " + command + " Now the Location is "+position) ;
        Controller controller = new Controller(this.robot,this.table);
        controller.parse(command);
        assertEquals( robot.report(),position);
    }
}