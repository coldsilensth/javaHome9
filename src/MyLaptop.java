public class MyLaptop {
    public static void main(String[] args) {
    Laptop myLaptop = new Laptop(15.6, "Asus", "black", 512, 8, "NVIDIA GEFORSE GTX 1660");
    Display myDisplay = new Display(15.6, "China", "IPS");
    SSD mySSD = new SSD(512,2);
    RAM myRam = new RAM(8, "AMD");
    USB myUsb = new USB("3.1, 3.0, 2.0", "i don't know");
    Keyboard myKeyboard = new Keyboard(true, true);

    Computer myComputer = new Computer();
    myComputer.setLaptop(myLaptop);
    myComputer.setDisplay(myDisplay);
    myComputer.setSsd(mySSD);
    myComputer.setRam(myRam);
    myComputer.setUsb(myUsb);
    myComputer.setKeyboard(myKeyboard);

        System.out.println(myComputer);

    }
}
