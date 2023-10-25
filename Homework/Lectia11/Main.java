public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.InnerProcessor innerProcessor = cpu.new InnerProcessor();
        CPU.RAM ram = cpu.new RAM();

        MotherBoard.USB.getInfo();
        innerProcessor.getInfo();
        ram.getInfo();
    }
}
