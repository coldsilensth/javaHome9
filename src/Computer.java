public class Computer {
 private Laptop laptop;
 private Display display;
private SSD ssd;
private RAM ram;
private USB usb;
private Keyboard keyboard;

    public Computer(Laptop laptop, Display display, SSD ssd, RAM ram, USB usb, Keyboard keyboard) {
        this.laptop = laptop;
        this.display = display;
        this.ssd = ssd;
        this.ram = ram;
        this.usb = usb;
        this.keyboard = keyboard;
    }
public Computer(){

}
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    public void setSsd(SSD ssd){
        this.ssd = ssd;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "laptop=" + laptop +
                ", display=" + display +
                ", ssd=" + ssd +
                ", ram=" + ram +
                ", usb=" + usb +
                ", keyboard=" + keyboard +
                '}';
    }
}
