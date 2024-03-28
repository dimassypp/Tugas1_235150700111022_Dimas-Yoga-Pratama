package kelas;

public class lcd {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    public lcd() {
        this.status = "Off";
        this.volume = 50;
        this.brightness = 50;
        this.cable = "Not Connected";
    }

    public void turnOn() {
        this.status = "On";
    }

    public void turnOff() {
        this.status = "Off";
    }

    public void freeze() {
        this.status = "Freeze";
    }

    public void volumeUp() {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void brightnessUp() {
        if (this.brightness < 100) {
            this.brightness++;
        }
    }

    public void brightnessDown() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    
    public void display() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
}