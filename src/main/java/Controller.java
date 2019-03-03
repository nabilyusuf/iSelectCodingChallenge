import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
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

    public Controller(Robot robot, Table table){
        this.robot = robot;
        this.table = table;
    }

    public void parse(String command){
        if (Pattern.compile("^PLACE\\s\\d[,]\\d[,](NORTH|SOUTH|EAST|WEST)").matcher(command).matches()){
            String[] splitCommand = command.split("\\s* \\s*|\\s+[,]")[1].split(",");
            int x = Integer.parseInt(splitCommand[0]);
            int y = Integer.parseInt(splitCommand[1]);;
            String direction =splitCommand[2];
            new Place(this.robot, this.table, new Position(x, y, direction));
        }
        else if(Pattern.compile("^MOVE$").matcher(command).matches()){
           new Move(this.robot,this.table);
        }
        else if(Pattern.compile("^LEFT$").matcher(command).matches()){
            new LeftCommand(this.robot);
        }
        else if(Pattern.compile("^RIGHT$").matcher(command).matches()){
            new RightCommand(this.robot);
        }
        else if(Pattern.compile("^REPORT$").matcher(command).matches()){
            System.out.println(this.robot.report());
        }
        else {
            System.out.println("Wrong command: " +command );
        }
    }
}