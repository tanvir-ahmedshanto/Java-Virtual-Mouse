import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class VirtualMouse {
    public static void main(String[] args) {
        try {
            // Create Robot instance
            Robot robot = new Robot();

            // Wait 2 seconds before starting (to give you time to move your hand)
            robot.delay(2000);

            // Move the mouse to screen position (500, 300)
            robot.mouseMove(500, 300);

            // Left-click the mouse
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // Wait a second
            robot.delay(1000);

            // Move to another position
            robot.mouseMove(600, 400);

            // Right-click the mouse
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

            System.out.println("Mouse actions performed.");

        } catch (AWTException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
