package homework19;

public class Main {
    public static void main(String[] args) {

        Cpu cpu = new Cpu();
        Cpu.Processor processor = cpu.new Processor();
        Cpu.Ram ram = cpu.new Ram();

        Motherboard  motherboard = new Motherboard();
        Motherboard.USB usb = new Motherboard.USB();

        processor.printInfo();
        ram.printInfo();
        usb.extenndsData();

    }
}
