import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class HelloWorld {
    public static void main(String[] args) {

        // This is my first LEGO code
        // Make me autonomous
        // Press any button to stop the program
        // Narayan Bhattarai

        LCD.clear();
        LCD.drawString("Welcome", 0, 0);
        Delay.msDelay(1000);

        LCD.drawString("This is my first", 0, 1);
        LCD.drawString("LEGO code.", 0, 2);
        Delay.msDelay(2000);

        LCD.clear();
        LCD.drawString("Make me autonomous", 0, 0);
        LCD.drawString("Press any button", 0, 2);
        LCD.drawString("to stop.", 0, 3);

        // Wait for a button press to exit
        Button.waitForAnyPress();
    }
}
