import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Do you want server(1) or gaming(2) computer?");
        Scanner in = new Scanner(System.in);
        int computerType = in.nextInt();

        IFactory factory = null;
        switch (computerType)
        {
            case 1:
                factory = new ServerFactory();
                break;
            case 2:
            default:
                factory = new GamingFactory();
                break;
        }

        var motherboard = factory.CreateMotherboard();
        var processor = factory.CreateProcessor();

        motherboard.ShowType();
        processor.ShowManufacturer();
    }
}