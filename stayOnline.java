import java.awt.Robot;
import java.awt.AWTException;

public class StayOnline {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int x = 100; // x coordinate of starting point
        int y = 100; // y coordinate of starting point
        int length = 200; // length of the square
        int delay = 4000; // time delay in milliseconds
        
        while (true) {
            // move to top-right corner of the square
            robot.mouseMove(x + length, y);
            Thread.sleep(delay);
            
            // move to bottom-right corner of the square
            robot.mouseMove(x + length, y + length);
            Thread.sleep(delay);
            
            // move to bottom-left corner of the square
            robot.mouseMove(x, y + length);
            Thread.sleep(delay);
            
            // move to top-left corner of the square
            robot.mouseMove(x, y);
            Thread.sleep(delay);
        }
    }
}
