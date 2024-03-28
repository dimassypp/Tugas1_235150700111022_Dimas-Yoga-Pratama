package objek;
import kelas.lcd;

public class lcdMain {
    public static void main(String[] args) {
        lcd lcd1 = new lcd();
        lcd1.turnOn();
        // lcd1.freeze();
        // lcd1.turnOff();
        lcd1.setVolume(40);
        lcd1.volumeUp();
        lcd1.setBrightness(75);
        lcd1.brightnessDown();
        lcd1.setCable("RCA");
        lcd1.display();
    }
}