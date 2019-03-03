import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Table table = new Table(5, 5);
        Robot robot = new Robot();
        Controller commander = new Controller(robot, table);
        Scanner sc = new Scanner(System.in);
        System.out.println("Input (Type EXIT to terminate) : ");
        while(sc.hasNext()) {
            String s1 = sc.nextLine() ;
            commander.parse(s1);
            if(s1.equals("EXIT")) {
                break;
            }
        }

    }


}
