import java.util.Arrays;

public class Laptop {
    double display;
    String brand;
    String color;
    int ssd;
    int ram;
    String videoCard;
    String [] arrayUsb = {"USB type-c", "USB type-a", "USB 2.0", "HDMI"};


    public Laptop(double display, String brand, String color, int ssd, int ram, String videoCard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.videoCard = videoCard;

    }
public Laptop(){

}
    public void setArrayUsb(String[] arrayUsb) {
        this.arrayUsb = arrayUsb;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "display=" + display +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ssd=" + ssd +
                ", ram=" + ram +
                ", videoCard='" + videoCard + '\'' +
                ", arrayUsb=" + Arrays.toString(arrayUsb) +
                '}';
    }
}
